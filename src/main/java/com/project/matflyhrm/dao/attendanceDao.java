package com.project.matflyhrm.dao;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.attendance;
import com.project.matflyhrm.repo.attendanceRepo;
import com.project.matflyhrm.service.attendanceService;

@Service
public class attendanceDao implements attendanceService {

	
	@Autowired
	attendanceRepo ar;
	
	@Override
	public List<attendance> allattendance() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	@Override
	public void saveattendance(attendance atn) {
		// TODO Auto-generated method stub
		
		String inTimeStr = atn.getIntime(); // Assuming it's a String in "HH:mm" format
	    String outTimeStr = atn.getOuttime(); // Assuming it's a String in "HH:mm" format

	    // Convert the input time strings to java.sql.Time objects
	    Time inTime = getTimeFromString(inTimeStr);
	    Time outTime = getTimeFromString(outTimeStr);

	    // Calculate daily working hours
	    double dailyHours = calculateDailyWorkingHours(inTime, outTime);

	    // Update the attendance object with the calculated daily hours
	    atn.setDailytotalhours(dailyHours);

		    // Update the attendance object with the calculated daily hours
		    atn.setDailytotalhours(dailyHours);

		ar.save(atn);
	}

	private Time getTimeFromString(String timeStr) {
		   try {
		        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		        java.util.Date parsedDate = sdf.parse(timeStr);
		        return new Time(parsedDate.getTime());
		    } catch (ParseException e) {
		        // Handle parsing errors or return a default value
		        return null;
		    }
	}
	private double calculateDailyWorkingHours(Time inTime, Time outTime) {
        // Ensure inTime and outTime are not null
        if (inTime == null || outTime == null) {
            return 0.0;
        }

        // Calculate the time difference in milliseconds
        long timeDifferenceMillis = outTime.getTime() - inTime.getTime();

        // Convert the time difference to hours
        double dailyHours = timeDifferenceMillis / (1000.0 * 60 * 60);

        if (dailyHours < 0) {
            // Handle cases where outtime crosses midnight
            dailyHours = 24 - (inTime.getHours() + inTime.getMinutes() / 60.0) + (outTime.getHours() + outTime.getMinutes() / 60.0);
        }

        return dailyHours;
    }
	

}
