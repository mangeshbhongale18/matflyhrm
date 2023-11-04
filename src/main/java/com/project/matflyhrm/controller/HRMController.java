package com.project.matflyhrm.controller;

import java.io.BufferedInputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.time.format.TextStyle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mysql.cj.Session;
import com.project.matflyhrm.model.Notification;
import com.project.matflyhrm.model.assets;
import com.project.matflyhrm.model.attendance;
import com.project.matflyhrm.model.calendar;
import com.project.matflyhrm.model.clients;
import com.project.matflyhrm.model.employeetask;
import com.project.matflyhrm.model.hrmmodel;
import com.project.matflyhrm.model.leaves;
import com.project.matflyhrm.model.monthlyattendance;
import com.project.matflyhrm.model.perday;
import com.project.matflyhrm.model.permission;
import com.project.matflyhrm.model.rating;
import com.project.matflyhrm.model.reimbursement;
import com.project.matflyhrm.model.salary;
import com.project.matflyhrm.model.suggestion;
import com.project.matflyhrm.model.support;
import com.project.matflyhrm.service.CalendarService;
import com.project.matflyhrm.service.HRMService;
import com.project.matflyhrm.service.assetsService;
import com.project.matflyhrm.service.attendanceService;
import com.project.matflyhrm.service.clientService;
import com.project.matflyhrm.service.clientinfoService;
import com.project.matflyhrm.service.leavesService;
import com.project.matflyhrm.service.monthlyattendanceService;
import com.project.matflyhrm.service.notificationService;
import com.project.matflyhrm.service.permissionService;
import com.project.matflyhrm.service.ratingService;
import com.project.matflyhrm.service.reimbursservice;
import com.project.matflyhrm.service.salaryservice;
import com.project.matflyhrm.service.suggestionService;
import com.project.matflyhrm.service.supportService;
import com.project.matflyhrm.service.taskservice;

import net.bytebuddy.asm.Advice.Return;

@Controller
public class HRMController {

	@Autowired
	HRMService hs;

	@Autowired
	CalendarService cs;

	@Autowired
	attendanceService as;

	@Autowired
	clientService cls;

	@Autowired
	reimbursservice rs;

	@Autowired
	salaryservice ss;

	@Autowired
	monthlyattendanceService ms;

	@Autowired
	taskservice ts;

	@Autowired
	leavesService ls;

	@Autowired
	assetsService aa;

	@Autowired
	supportService sus;

	@Autowired
	suggestionService ssrs;

	@Autowired
	notificationService ns;

	@Autowired
	ratingService ratings;

	@Autowired
	clientinfoService cis;
	
	@Autowired
	permissionService ps;

	@GetMapping("/")
	public String Login() {
		return "login";

	}

	@GetMapping("login")
	public String Login2(HttpSession session, ModelMap m) {

		return "login";

	}

	@GetMapping("/signup")
	public String Signup() {
		return "signup";

	}

	@PostMapping("/registeremp")
	public String RegisterEMP(@ModelAttribute("matfly") hrmmodel matfly, HttpSession session, ModelMap m,
			@RequestParam("adharcardfile") MultipartFile adharcardfile,
			@RequestParam("pancardfile") MultipartFile pancardfile,
			@RequestParam("passportcardfile") MultipartFile passportcardfile,
			@RequestParam("bankpassfile") MultipartFile bankpassfile, @RequestParam("sscdoc") MultipartFile sscdoc,
			@RequestParam("hscdoc") MultipartFile hscdoc, @RequestParam("ugdoc") MultipartFile ugdoc,
			@RequestParam("pgdoc") MultipartFile pgdoc, @RequestParam("resume") MultipartFile resume,
			@RequestParam("profilepic") MultipartFile profilepic

	) {
		try {

			String baseDir = "C:\\MANGESH\\MatflyHRM_Documents\\Personal_Document";
			String employeeFolderName = matfly.getFirstName() + " " + matfly.getLastName();

			// Replace invalid characters with underscores
			employeeFolderName = employeeFolderName.replaceAll("[<>:\"/\\|?*]", "_");

			String path = Paths.get(baseDir, employeeFolderName).toString();

			// Create directory if it doesn't exist
			File directory = new File(path);
			if (!directory.exists()) {
				directory.mkdirs();
			}

			// Save Aadhar card
			String filenameadhar = adharcardfile.getOriginalFilename();
			saveFile(adharcardfile, path, filenameadhar);
			matfly.setAdharcardfilename(filenameadhar);

			// Save PAN card
			String filenamepan = pancardfile.getOriginalFilename();
			saveFile(pancardfile, path, filenamepan);
			matfly.setPancardfilename(filenamepan);

			// Save Passport card
			String filenamepassport = passportcardfile.getOriginalFilename();
			saveFile(passportcardfile, path, filenamepassport);
			matfly.setPassportcardfilename(filenamepassport);

			// Save Bank Passbook
			String filenamebankpass = bankpassfile.getOriginalFilename();
			saveFile(bankpassfile, path, filenamebankpass);
			matfly.setBankpass(filenamebankpass);

			// Save SSC card
			String filenamessc = sscdoc.getOriginalFilename();
			saveFile(sscdoc, path, filenamessc);
			matfly.setSscdocname(filenamessc);

			// Save HSC card
			String filenamehsc = hscdoc.getOriginalFilename();
			saveFile(hscdoc, path, filenamehsc);
			matfly.setHscdocname(filenamehsc);

			// Save UG card
			String filenameug = ugdoc.getOriginalFilename();
			saveFile(ugdoc, path, filenameug);
			matfly.setUgdocfilename(filenameug);

			// Save PG card
			String filenamepg = pgdoc.getOriginalFilename();
			saveFile(pgdoc, path, filenamepg);
			matfly.setPgdocfilename(filenamepg);

			// Save Resume
			String filenameresume = resume.getOriginalFilename();
			saveFile(resume, path, filenameresume);
			matfly.setResumefilename(filenameresume);

			// Save ProfilePic
			String filenameprofile = profilepic.getOriginalFilename();
			saveFile(profilepic, path, filenameprofile);
			matfly.setProfilepicfilename(filenameprofile);

			hs.registeremployee(matfly);
			return "success";

		} catch (Exception e) {
			e.printStackTrace();
			return "Error uploading file: " + e.getMessage();
		}

	}

	private void saveFile(MultipartFile file, String path, String filename) throws IOException {
		byte[] filedata = file.getBytes();
		try {
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(path + "/" + filename));
			bout.write(filedata);
			bout.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@GetMapping("/success")
	public String success() {
		return "success";

	}

	@GetMapping("/employeedash")
	public String EmployeeDash(ModelMap model, HttpSession session) {

		String email = (String) session.getAttribute("wemail");
		String name = (String) session.getAttribute("fname");
		model.addAttribute("usernname", name);
		

		List<attendance> dailyhours = as.allattendance();
		List<employeetask> emptask = ts.taskforemployee("001");
		model.addAttribute("daily", dailyhours);
		model.addAttribute("emptask", emptask);
		hrmmodel userdata = hs.getdata(email);
		if (userdata != null) {
			model.addAttribute("empid", userdata.getEmployeeID());
			model.addAttribute("designation", userdata.getDesignation());

		}

		return "employeedash";

	}

	@PostMapping("/logincheck")
	public String loginCheck(@ModelAttribute("hrm") hrmmodel hrm, HttpSession session, ModelMap model) {
	    try {
	        hrmmodel h = hs.logincheck(hrm.getWorkEmail(), hrm.getPassword());

	        if (h != null && "Approved".equals(h.getEmpstatus())) {
	            session.setAttribute("fname", h.getFirstName());
	            session.setAttribute("lname", h.getLastName());
	            session.setAttribute("wemail", h.getWorkEmail());
	            session.setAttribute("empid", h.getEmployeeID());

	            return "redirect:/dashboard"; // Redirect to the dashboard for approved employees
	        } else if (h != null) {
	            // Handle cases where the employee's status is not "Approved"
	            model.addAttribute("errorMessage", "Your profile is not yet approved.");
	            return "redirect:/waiting";
	        } else {
	            // Handle cases with incorrect credentials
	            model.addAttribute("errorMessage", "Invalid credentials");
	           
	        }
	        return "login";
	    } catch (Exception e) {
	        // Handle exceptions here if needed
	        // You can log the exception or set an error message in the model
	        model.addAttribute("showError", true);
	        return "login";
	    }
	}

	@GetMapping("/waiting")
	public String WaitingPage() {
		return "waiting";
		
	}


	@GetMapping("/logout")
	public String Logout(HttpSession session) {
		session.removeAttribute("fname");
		session.removeAttribute("lname");
		session.removeAttribute("wemail");
		session.removeAttribute("empid");
		return "login";
	}

	@GetMapping("/dashboard")
	public String Dashboard(ModelMap model, HttpSession session, @ModelAttribute("hrm") hrmmodel hrm) {
		String name = (String) session.getAttribute("fname");
		String email = (String) session.getAttribute("wemail");

		hrmmodel userdata = hs.getdata(email);
		List<hrmmodel> allemp = hs.allemployee(hrm);
		List<clients> clientlist = cls.clientlist();
		model.addAttribute("clientlist", clientlist);
		model.addAttribute("allemp", allemp);

		if (userdata != null) {
			model.addAttribute("empid", userdata.getEmployeeID());
			model.addAttribute("designation", userdata.getDesignation());

		}
		long totlaemployee = hs.totalemployee();
		long totalactiveclient = cis.totalactiveclinet("Active");
		long totalclient = cis.allclinets();
		model.addAttribute("employeecount", totlaemployee);

		model.addAttribute("usernname", name);
		model.addAttribute("activenumber", totalactiveclient);
		model.addAttribute("allclients", totalclient);

		String empid = (String) session.getAttribute("empid"); // assuming empid is stored in session
		List<Notification> allnotification = ns.getNotificationsByEmpId(empid);
		long count = ns.countNotificationsByEmpId(empid);
		model.addAttribute("notify", allnotification);
		model.addAttribute("notificationCount", count);

		String currentMonth = getCurrentMonth();
		List<rating> ratingsForCurrentMonth = ratings.getratingbymonth(currentMonth);
		int numberOfEntries = ratingsForCurrentMonth.size();

		model.addAttribute("rating", ratingsForCurrentMonth);

		// Calculate the total rating amount and percentage satisfaction
		int percentageSatisfaction = (int) calculateEmployeeSatisfaction(ratingsForCurrentMonth);
		model.addAttribute("totalRatingAmount", percentageSatisfaction);
		model.addAttribute("ratedperson", numberOfEntries);

		return "dashboard";

	}

	

	public double calculateEmployeeSatisfaction(List<rating> ratingsForCurrentMonth) {
		// Step 1: Count the number of entries for the current month
		int numberOfEntries = ratingsForCurrentMonth.size();

		if (numberOfEntries == 0) {
			// Handle the case when there are no entries for the current month
			return 0.0;
		}

		// Step 2: Calculate the total rating amount
		int totalRatingAmount = 0;
		for (rating r : ratingsForCurrentMonth) {
			totalRatingAmount += r.getRating();
		}

		// Step 3: Calculate the average rating
		double averageRating = (double) totalRatingAmount / numberOfEntries;

		// Step 4: Calculate the percentage satisfaction (assuming a scale from 1 to 5)
		double percentageSatisfaction = (averageRating / 5.0) * 100;

		return percentageSatisfaction;
	}

	private String getCurrentMonth() {
		Month currentMonth = java.time.LocalDate.now().getMonth();
		return currentMonth.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
	}

	@GetMapping("/profile")
	public String Profile(@ModelAttribute("hrmodel") hrmmodel hrmodel, HttpSession session, ModelMap model) {

		List<hrmmodel> allemp = hs.allemployee("001");
		model.addAttribute("allemp", allemp);
		
		String name = (String) session.getAttribute("fname");
		model.addAttribute("usernname", name);

		return "profile";

	}

	@GetMapping("/calendar")
	public String calendar(ModelMap map,HttpSession session) {
		List<calendar> holidauList = cs.holidays();
		map.addAttribute("data", holidauList);
		String name = (String) session.getAttribute("fname");
		map.addAttribute("usernname", name);
		String email=(String) session.getAttribute("wemail");
		hrmmodel userdata = hs.getdata(email);
		if (userdata != null) {
			map.addAttribute("empid", userdata.getEmployeeID());
			map.addAttribute("designation", userdata.getDesignation());

		}
		return "calendar";

	}

	@PostMapping("/todayatn")
	public String Attendance(@ModelAttribute("attendance") attendance attendance) {

		as.saveattendance(attendance);
		return "redirect:/attendance";

	}

	@PostMapping("/saveDayCount")
	public String saveDayCount(@ModelAttribute("ma") monthlyattendance ma) {

		ms.savedaycount(ma);
		return "redirect:/attendance";

	}

	@GetMapping("/attendance")
	public String Attendance(ModelMap map, HttpSession session) {
		String empid = (String) session.getAttribute("empid");
		map.addAttribute("empid", empid);
		List<attendance> attendancelist = as.allattendance();
		map.addAttribute("attendancelist", attendancelist);
		String name = (String) session.getAttribute("fname");
		map.addAttribute("usernname", name);
		
		String email=(String) session.getAttribute("wemail");
		hrmmodel userdata = hs.getdata(email);
		if (userdata != null) {
			map.addAttribute("empid", userdata.getEmployeeID());
			map.addAttribute("designation", userdata.getDesignation());

		}
		return "attendance";

	}

	@GetMapping("/reimbursement")
	public String Reimbursement() {

		return "reimbursement";

	}

	@PostMapping("/savereimbursement")
	public String SaveForm(@ModelAttribute("reimb") reimbursement reimb, @RequestParam("file") MultipartFile file,
			ModelMap modell) {

		try {
			String filename = file.getOriginalFilename();
			String path = "C:\\MANGESH\\MatflyHRM_Documents\\Reimbursement_doc";
			byte[] filedata = file.getBytes();

			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(path + "/" + filename));
			bout.write(filedata);
			bout.flush();
			bout.close();

			reimb.setFilename(filename); // Set filename before saving to the database
			rs.saveform(reimb); // Save the form data to the database
			modell.addAttribute("reimbsave", true);

			return "reimbursement";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error uploading file: " + e.getMessage();
		}
	}

	@GetMapping("/salary")
	public String Salary(HttpSession session,ModelMap model) {
		String name = (String) session.getAttribute("fname");
		model.addAttribute("usernname", name);
		String email=(String) session.getAttribute("wemail");
		hrmmodel userdata = hs.getdata(email);
		if (userdata != null) {
			model.addAttribute("empid", userdata.getEmployeeID());
			model.addAttribute("designation", userdata.getDesignation());

		}
		return "salary";

	}

	@GetMapping("/trial")
	public String Trial() {
		return "trial";

	}

	@GetMapping("/salaryslip")
	public String SalarySlip() {
		return "salaryslip";

	}

	@PostMapping("/generateslip")
	public String GenerateSalary(@RequestParam("empid") String empid, @RequestParam("month") String month,
			@RequestParam("year") String year, ModelMap m) {

		salary salarydetails = ss.generatesalary(empid, month, year);
		perday perdaydetails = ss.getperday(empid);
		m.addAttribute("perday", perdaydetails);
		m.addAttribute("salary", salarydetails);

		return "salaryslip";

	}

	@GetMapping("addtask")
	public String AddTask(@ModelAttribute("hrm") hrmmodel hrm, ModelMap model,HttpSession session) {
		List<hrmmodel> allemp = hs.allemployee("001");
		model.addAttribute("allemp", allemp);
		String name = (String) session.getAttribute("fname");
		model.addAttribute("usernname", name);
		String email=(String) session.getAttribute("wemail");
		hrmmodel userdata = hs.getdata(email);
		if (userdata != null) {
			model.addAttribute("empid", userdata.getEmployeeID());
			model.addAttribute("designation", userdata.getDesignation());

		}
		return "addtask";

	}

	@PostMapping("savetask")
	public String savetask(@ModelAttribute("task") employeetask task, ModelMap model) {
		ts.savetask(task);
		model.addAttribute("tasksaved", true);
		return "addtask";

	}

	@GetMapping("/downloadDocument/{filename}")
	@ResponseBody
	public ResponseEntity<byte[]> downloadFile(@PathVariable("filename") String filename, HttpSession session)
			throws IOException {

		String firstName = (String) session.getAttribute("fname");
		String lastName = (String) session.getAttribute("lname");

		// Map docType to the appropriate folder path
		String folderPath = "C:\\MANGESH\\MatflyHRM_Documents\\Personal_Document\\" + "\\" + firstName + " " + lastName
				+ "\\";

		// Construct the file path
		Path path = Paths.get(folderPath + "\\" + filename);

		// Read the contents of the file into a byte array
		byte[] bytes = Files.readAllBytes(path);

		// Determine the content type
		String contentType = Files.probeContentType(path);

		// Set headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.parseMediaType(contentType));
		headers.setContentDisposition(ContentDisposition.builder("attachment").filename(filename).build());

		// Create a ResponseEntity object with the byte array, content type, and headers
		return ResponseEntity.ok().headers(headers).body(bytes);
	}

	@GetMapping("/viewDocument/{filename}")
	@ResponseBody
	public ResponseEntity<byte[]> viewFile(@PathVariable("filename") String filename, HttpSession session)
			throws IOException {

		String firstName = (String) session.getAttribute("fname");
		String lastName = (String) session.getAttribute("lname");

		// Path to the folder where all documents are stored
		String folderPath = "C:\\MANGESH\\MatflyHRM_Documents\\Personal_Document\\" + firstName + " " + lastName + "\\";

		// Construct the full file path
		Path path = Paths.get(folderPath + "\\" + filename);

		// Read the contents of the file into a byte array
		byte[] bytes = Files.readAllBytes(path);

		// Determine the content type (MIME type) of the file
		String contentType = Files.probeContentType(path);

		// Initialize HTTP headers
		HttpHeaders headers = new HttpHeaders();

		// Set the content type so that the browser knows how to display the file
		headers.setContentType(MediaType.parseMediaType(contentType));

		// Create a ResponseEntity object with the file data, content type, and headers
		return ResponseEntity.ok().headers(headers).body(bytes);
	}

	@GetMapping("/leaves")
	public String Leavespage(ModelMap model,HttpSession session) {
		List<leaves> empleaves = ls.leavesbyempid("001");
		model.addAttribute("leaves", empleaves);
		
		String name = (String) session.getAttribute("fname");
		model.addAttribute("usernname", name);
		return "leaves";

	}

	@PostMapping("/submitleave")
	public String SubmitLeave(@ModelAttribute("l") leaves l) {

		ls.sendleaverequest(l);
		return "leaves";

	}

	// This block of code is for manager's

	@GetMapping("/leaverequest")
	public String LeaveRequest(@ModelAttribute("l") leaves l, ModelMap model,HttpSession session) {
		List<leaves> allleaverequest = ls.allleaves();
		model.addAttribute("allleaves", allleaverequest);
		
		String name = (String) session.getAttribute("fname");
		model.addAttribute("usernname", name);
		
		String email=(String) session.getAttribute("wemail");
		hrmmodel userdata = hs.getdata(email);
		if (userdata != null) {
			model.addAttribute("empid", userdata.getEmployeeID());
			model.addAttribute("designation", userdata.getDesignation());

		}
		return "leaverequest";

	}

	@GetMapping("/approvestatus")
	public String approveRequest(@RequestParam("empid") String empid, @RequestParam("sdate") String sdate, leaves l,
			HttpSession session) {
		ls.updateLeaveStatus(empid, sdate, "approved");

		// Constructing a message for notification
		String notificationMessage = "Leave <b>Approved</b> for date:" + sdate;

		// Assuming ns is your notification service and savenotification method takes a
		// Notification object
		Notification notification = new Notification();
		notification.setEmpid(empid);
		notification.setMessage(notificationMessage);

		ns.savenotification(notification);

		return "redirect:/leaverequest";
	}

	@GetMapping("/rejectstatus")
	public String rejectRequest(@RequestParam("empid") String empid, @RequestParam("sdate") String sdate, leaves l,
			HttpSession session) {
		ls.updateLeaveStatus(empid, sdate, "rejected");

		// Constructing a message for notification
		String notificationMessage = "Leave <b>Rejected</b> for date:" + sdate;

		// Assuming ns is your notification service and savenotification method takes a
		// Notification object
		Notification notification = new Notification();
		notification.setEmpid(empid);
		notification.setMessage(notificationMessage);

		ns.savenotification(notification);

		return "redirect:/leaverequest";
	}

	@GetMapping("/clear-notification")
	public String clearNotification(@RequestParam("id") int notificationId,
			@RequestParam("returnUrl") String returnUrl) {
		ns.deleteNotificationById(notificationId);
		return "redirect:" + returnUrl;
	}

	private void removeNotificationFromSession(HttpSession session, String notification) {
		List<String> approvedNotifications = (List<String>) session.getAttribute("approvedNotifications");
		List<String> rejectedNotifications = (List<String>) session.getAttribute("rejectedNotifications");

		if (approvedNotifications != null && approvedNotifications.contains(notification)) {
			approvedNotifications.remove(notification);
		} else if (rejectedNotifications != null && rejectedNotifications.contains(notification)) {
			rejectedNotifications.remove(notification);
		}
	}

	@GetMapping("/assets")
	public String AssetsRequirement(HttpSession session,ModelMap model) {

		String name = (String) session.getAttribute("fname");
		model.addAttribute("usernname", name);
		
		String email=(String) session.getAttribute("wemail");
		hrmmodel userdata = hs.getdata(email);
		if (userdata != null) {
			model.addAttribute("empid", userdata.getEmployeeID());
			model.addAttribute("designation", userdata.getDesignation());

		}
		return "assets";

	}

	@PostMapping("/saveassets")
	public String AssetsSubmit(@ModelAttribute("a") assets a, ModelMap m) {
		aa.saveassetreq(a);
		m.addAttribute("assetssaved", true);
		return "assets";

	}

	@GetMapping("/support")
	public String Support(ModelMap model,HttpSession session) {
		String name = (String) session.getAttribute("fname");
		model.addAttribute("usernname", name);

		String email=(String) session.getAttribute("wemail");
		hrmmodel userdata = hs.getdata(email);
		if (userdata != null) {
			model.addAttribute("empid", userdata.getEmployeeID());
			model.addAttribute("designation", userdata.getDesignation());

		}
		return "support";

	}

	@PostMapping("/needsupport")
	public String NeedSupport(@ModelAttribute("s") support s, ModelMap m) {
		sus.savesupportrequest(s);
		m.addAttribute("supportsaved", true);
		return "support";

	}

	@GetMapping("/suggestion")
	public String Suggestion(HttpSession session,ModelMap model) {

		String name = (String) session.getAttribute("fname");
		model.addAttribute("usernname", name);

		String email=(String) session.getAttribute("wemail");
		hrmmodel userdata = hs.getdata(email);
		if (userdata != null) {
			model.addAttribute("empid", userdata.getEmployeeID());
			model.addAttribute("designation", userdata.getDesignation());

		}
		
		return "suggestion";

	}

	@PostMapping("/savesuggestion")
	public String SaveSuggestion(@ModelAttribute("suss") suggestion suss, ModelMap m) {
		ssrs.savesuggestion(suss);
		m.addAttribute("suggestionsaved", true);
		return "suggestion";

	}

	@GetMapping("/clients")
	public String ClientInfo(ModelMap model,HttpSession session) {
		String name = (String) session.getAttribute("fname");
		model.addAttribute("usernname", name);

		String email=(String) session.getAttribute("wemail");
		hrmmodel userdata = hs.getdata(email);
		if (userdata != null) {
			model.addAttribute("empid", userdata.getEmployeeID());
			model.addAttribute("designation", userdata.getDesignation());

		}
		return "clientinfo";

	}

	@PostMapping("/rate")
	public ResponseEntity<String> saveRating(@RequestParam int rating, @RequestParam String month,
			@RequestParam String year, @RequestParam String empid) { // Don't forget to pass the unique user identifier

		rating r = new rating();
		r.setMonth(month);
		r.setYear(year);
		r.setRating(rating);
		r.setEmpid(empid);

		if (ratings.saverating(r)) {
			return ResponseEntity.ok("Rating saved successfully!");
		} else {
			return ResponseEntity.status(HttpStatus.CONFLICT)
					.body("You have already provided a rating for this month!");
		}
	}
	
	@GetMapping("/allemployee")
	public String allEmployee(ModelMap model,@ModelAttribute("hrm") hrmmodel hrm) {
		List<hrmmodel> allemp = hs.allemployee(hrm);
		model.addAttribute("allemp", allemp);
		return "allemployee";
		
	}

	@GetMapping("/permissions")
	public String Permissions(HttpSession session,ModelMap model,@ModelAttribute("hrm") hrmmodel hrm) {
		
		List<hrmmodel> allemp = hs.allemployee(hrm);
		model.addAttribute("allemp", allemp);
		String name = (String) session.getAttribute("fname");
		model.addAttribute("usernname", name);
		String email=(String) session.getAttribute("wemail");
		hrmmodel userdata = hs.getdata(email);
		if (userdata != null) {
			model.addAttribute("empid", userdata.getEmployeeID());
			model.addAttribute("designation", userdata.getDesignation());

		}
		return "permissions";
		
	}
	
	@PostMapping("/savepermission")
	public String SavePermission(@ModelAttribute("p") permission p,ModelMap model) {
		
		ps.saveOrUpdatePermission(p);
		model.addAttribute("permissionsaved", true);
		return "permissions";
		
	}
	
	@GetMapping("/editempinfo")
	public String EditEmpInfo(@RequestParam("empid") String empid,ModelMap model) {
		
		List<hrmmodel>emp=hs.editemp(empid);
		model.addAttribute("editemp", emp);
		return "editempinfo";
		
	}

	
}
