var button = document.getElementById("togglebutton");
var leavebutton = document.getElementById("leaveToggle");
var container = document.getElementsByClassName('container')[0];  // Address the first element
var container = document.getElementsByClassName('container')[0];




button.addEventListener('click', function() {
    if (container.style.display == "none") {
        container.style.display = "block";
    } else {
        container.style.display = "none";
    }
});

 leavebutton.addEventListener('click', function() {
    if (container.style.display == "none") {
        container.style.display = "block";
    } else {
        container.style.display = "none";
    }
});

// Function to update the serial numbers
function updateSerialNumbers() {
  var table = document.getElementById("employeeTable");
  var rows = table.querySelectorAll("tbody tr");

  rows.forEach(function (row, index) {
    var cell = row.querySelector("td:first-child");
    cell.textContent = index + 1;
  });
}
// Initialize serial numbers for existing rows
updateSerialNumbers();

