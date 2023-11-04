

// Get the select element by its ID
var yearSelect = document.getElementById("year");

// Generate options for years from 2022 to 2100
for (var year = 2022; year <= 2100; year++) {
    var option = document.createElement("option");
    option.value = year;
    option.text = year;
    yearSelect.appendChild(option);
}

// Get the current year
var currentYear = new Date().getFullYear();

// Set the selected option to the current year
var selectedOption = yearSelect.querySelector('option[value="' + currentYear + '"]');
if (selectedOption) {
    selectedOption.selected = true;
}


// Get the select element by its ID
var monthSelect = document.getElementById("month");

// Get the current month as a number (0 to 11)
var currentMonth = new Date().getMonth();

// Set the selected option based on the current month
monthSelect.selectedIndex = currentMonth;