const daysTag = document.querySelector(".days"),
  currentDate = document.querySelector(".current-date"),
  prevNextIcon = document.querySelectorAll(".icons span"),
  todayIndicator = document.querySelector(".colorindiacator p:first-child");

const today = new Date(); // Constant representing today's date
let currentDisplayedDate = new Date(today); // Initial date configurations for displaying calendar

// Extracting holiday reasons and dates from the .holidaylist
const holidayDates = [...document.querySelectorAll(".holidaylist ul li.holidaydate")].map(li => li.textContent.trim());
const holidayReasons = [...document.querySelectorAll(".holidaylist ul li.holidayreason")].map(li => li.textContent.trim());

// Months array
const months = [
  "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
];

const renderCalendar = () => {
  let firstDayOfMonth = new Date(currentDisplayedDate.getFullYear(), currentDisplayedDate.getMonth(), 1).getDay(),
      lastDateOfMonth = new Date(currentDisplayedDate.getFullYear(), currentDisplayedDate.getMonth() + 1, 0).getDate(),
      lastDateOfLastMonth = new Date(currentDisplayedDate.getFullYear(), currentDisplayedDate.getMonth(), 0).getDate(),
      liTag = "";

  // Add inactive days for the previous month
  for (let i = firstDayOfMonth; i > 0; i--) {
    liTag += `<li class="inactive">${lastDateOfLastMonth - i + 1}</li>`;
  }

  // Add days for the current month, marking today and holidays
  for (let i = 1; i <= lastDateOfMonth; i++) {
    let isToday = i === today.getDate() && currentDisplayedDate.getMonth() === today.getMonth() && currentDisplayedDate.getFullYear() === today.getFullYear() ? "active" : "";
    let formattedDate = `${currentDisplayedDate.getFullYear()}-${(currentDisplayedDate.getMonth() + 1 < 10 ? '0' + (currentDisplayedDate.getMonth() + 1) : currentDisplayedDate.getMonth() + 1)}-${(i < 10 ? '0' + i : i)}`;
    let holidayIndex = holidayDates.indexOf(formattedDate);
    let isHoliday = holidayIndex !== -1 ? "holiday" : "";
    let holidayReason = holidayIndex !== -1 ? holidayReasons[holidayIndex] : "";
    liTag += `<li class="${isToday} ${isHoliday}" ${isHoliday ? `data-reason="${holidayReason}"` : ''}>${i}</li>`;
  }

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
  currentDisplayedDate = new Date(today); // Reset to today's date for display
  renderCalendar();
});

daysTag.addEventListener("click", function (e) {
  if (e.target.classList.contains("holiday")) {
    let reason = e.target.getAttribute("data-reason");
    Swal.fire({
      text: 'Enjoy The Day, It\'s a Holiday!',
      title: reason,
      showConfirmButton: false, // Hide the confirmation button
      showCloseButton: true, // Show the close button
      width: 400,
      height: 300,
      customClass: {
        title: 'holiday-title',
        content: 'holiday-reason',
        closeButton: 'holiday-cross',
        container: 'holiday-container'
      }
    });
  }
});


document.querySelector('.down-icon').addEventListener('click', function () {
  const dropdownMenu = document.querySelector('.dropdown-menu');
  const parentListItem = dropdownMenu.closest('.dropdown');

  if (dropdownMenu.style.display === 'none' || dropdownMenu.style.display === '') {
    dropdownMenu.style.display = 'block';
    parentListItem.classList.add('dropdown-open');
  } else {
    dropdownMenu.style.display = 'none';
    parentListItem.classList.remove('dropdown-open');
  }
});
