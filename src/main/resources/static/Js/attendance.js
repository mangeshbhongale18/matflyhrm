const daysTag = document.querySelector(".days"),
  currentDate = document.querySelector(".current-date"),
  prevNextIcon = document.querySelectorAll(".icons span"),
  todayIndicator = document.querySelector(".colorindiacator p:first-child");

const today = new Date();
let currentDisplayedDate = new Date(today);

// Extracting attendance dates and statuses
const attendanceDates = [...document.querySelectorAll(".attendanceList ul li.atndate")].map(li => li.textContent.trim());
const attendanceStatuses = [...document.querySelectorAll(".attendanceList ul li.atnstatus")].map(li => li.textContent.trim());

const months = [
  "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
];

const renderCalendar = () => {
  let firstDayOfMonth = new Date(currentDisplayedDate.getFullYear(), currentDisplayedDate.getMonth(), 1).getDay(),
      lastDateOfMonth = new Date(currentDisplayedDate.getFullYear(), currentDisplayedDate.getMonth() + 1, 0).getDate(),
      lastDateOfLastMonth = new Date(currentDisplayedDate.getFullYear(), currentDisplayedDate.getMonth(), 0).getDate(),
      liTag = "";
      
      let totalMonthDay = lastDateOfMonth;
  let totalPresentDay = 0;
  let totalAbsentDay = 0;
  let totalHalfDay = 0;
  let totalHolidays = 0;


  for (let i = firstDayOfMonth; i > 0; i--) {
    liTag += `<li class="inactive">${lastDateOfLastMonth - i + 1}</li>`;
  }

  for (let i = 1; i <= lastDateOfMonth; i++) {
    let isToday = i === today.getDate() && currentDisplayedDate.getMonth() === today.getMonth() && currentDisplayedDate.getFullYear() === today.getFullYear() ? "active" : "";
    let formattedDate = `${currentDisplayedDate.getFullYear()}-${currentDisplayedDate.getMonth() + 1 < 10 ? '0' + (currentDisplayedDate.getMonth() + 1) : currentDisplayedDate.getMonth() + 1}-${i < 10 ? '0' + i : i}`;
    let attendanceIndex = attendanceDates.indexOf(formattedDate);
    let attendanceStatus = attendanceIndex !== -1 ? attendanceStatuses[attendanceIndex] : "";
    let attendanceClass = "";

    // Check if the day is a Sunday
    let isSunday = new Date(currentDisplayedDate.getFullYear(), currentDisplayedDate.getMonth(), i).getDay() === 0;
    
    if (isSunday) {
      // Mark Sunday as a holiday
      attendanceClass = "sunday";
      totalHolidays++;
    } else {
      if (attendanceStatus === "Present" || attendanceStatus === "present") {
        attendanceClass = "present";
        totalPresentDay++;
      } else if (attendanceStatus === "Absent" || attendanceStatus === "absent") {
        attendanceClass = "absent";
        totalAbsentDay++;
       
      } else if (attendanceStatus === "Half Day" || attendanceStatus === "half day") {
        attendanceClass = "halfday";
        totalHalfDay++;
      } else if (attendanceStatus === "Week Off" || attendanceStatus === "week off" || attendanceStatus === "Holiday" || attendanceStatus === "holiday") {
        attendanceClass = attendanceStatus.toLowerCase().replace(" ", "");
        totalHolidays++;
      }
    }


    liTag += `<li class="${isToday} ${attendanceClass}">${i}</li>`;
  }

  // Update the HTML with the calculated counts
  document.querySelector('.number.totalMonthDay').textContent = totalMonthDay;
  document.querySelector('.number.totalPresentDay').textContent = totalPresentDay;
  document.querySelector('.number.totalAbsentDay').textContent = totalAbsentDay;
  document.querySelector('.number.totalHalfDay').textContent = totalHalfDay;
  document.querySelector('.number.totalHolidays').textContent = totalHolidays;

  currentDate.innerText = `${months[currentDisplayedDate.getMonth()]} ${currentDisplayedDate.getFullYear()}`;
  daysTag.innerHTML = liTag;
};


renderCalendar();

prevNextIcon.forEach(icon => {
  icon.addEventListener("click", () => {
    currentDisplayedDate.setMonth(currentDisplayedDate.getMonth() + (icon.id === "prev" ? -1 : 1));
    renderCalendar();
  });
});

todayIndicator.addEventListener('click', () => {
  currentDisplayedDate = new Date(today);
  renderCalendar();
});



// Get the elements by their classes or other selectors
const TotalMonthday = document.querySelector('.day-count .number.totalMonthDay');
const TotalPresentday = document.querySelector('.day-count .number.totalPresentDay');
const TotalAbsentday = document.querySelector('.day-count .number.totalAbsentDay');
const TotalHalfDay = document.querySelector('.day-count .number.totalHalfDay');
const TotalHolidays = document.querySelector('.day-count .number.totalHolidays');
const inputElementMonthDay = document.querySelector('.day-count input[name="totalmonthday"]');
const inputElementPresentDay = document.querySelector('.day-count input[name="totalpresentdays"]');
const inputElementAbsentDay = document.querySelector('.day-count input[name="totalabsentday"]');
const inputElementHalfDay = document.querySelector('.day-count input[name="halfdays"]');
const inputElementHoliday = document.querySelector('.day-count input[name="totalholiday"]');

if (TotalMonthday && inputElementMonthDay) {
  // Set the input value to the text content of the h4 element
  inputElementMonthDay.value = TotalMonthday.textContent;
}

if (TotalPresentday && inputElementPresentDay) {
  // Set the input value to the text content of the h4 element
  inputElementPresentDay.value = TotalPresentday.textContent;
}
if (TotalAbsentday && inputElementAbsentDay) {
  // Set the input value to the text content of the h4 element
  inputElementAbsentDay.value = TotalAbsentday.textContent;
}
if (TotalHalfDay && inputElementHalfDay) {
  // Set the input value to the text content of the h4 element
  inputElementHalfDay.value = TotalHalfDay.textContent;
}


window.onload = function() {
    // Function to check the time and submit the form
    function autoSubmitForm() {
        const form = document.getElementById("myForm");
        const today = new Date();
        
        // Construct a string representation of today's date without time
        const dateString = `${today.getFullYear()}-${(today.getMonth() + 1).toString().padStart(2, '0')}-${today.getDate().toString().padStart(2, '0')}`;
        
        // Check if the form was already submitted today
        if (localStorage.getItem('lastSubmittedDate') === dateString) {
            return; // The form was already submitted today, do nothing
        }

        // Array of month names
        const monthNames = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
        
        // Check if the current date is the 13th day of the month
        if (today.getDate() === 5) {
            // Determine the previous month's name
            let previousMonthIndex = today.getMonth() - 1;
            let year = today.getFullYear();
            
            // If the current month is January, adjust for December of the previous year
            if (previousMonthIndex < 0) {
                previousMonthIndex = 11;
                year -= 1;
            }
            let previousMonthName = monthNames[previousMonthIndex];

            // Populate the hidden inputs for month and year
            const monthInput = form.querySelector('input[name="month"]');
            const yearInput = form.querySelector('input[name="year"]');

            monthInput.value = previousMonthName;
            yearInput.value = year;

            // Submit the form
            form.submit();
            
            // Save the current date to local storage to prevent re-submission on the same day
            localStorage.setItem('lastSubmittedDate', dateString);
        }
    }
    
    // Immediately check the conditions when the page loads
    autoSubmitForm();
}












