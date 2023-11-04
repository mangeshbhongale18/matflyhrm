const ctx = document.getElementById('workinghrschart');

// Get all nested ul elements inside the div with class "chartdata"
const nestedUls = document.querySelectorAll('.chartdata ul ul');

let labels = [];
let data = [];

// Loop through each nested ul to extract data and labels
nestedUls.forEach(ul => {
    let items = ul.querySelectorAll('li');
    data.push(parseInt(items[0].textContent)); // Convert the text to an integer and add to data
    labels.push(items[1].textContent); // Add the date to labels
});

// Custom sorting function to sort the labels by date
const sortByDate = (a, b) => {
    const dateA = new Date(a);
    const dateB = new Date(b);
    return dateA - dateB;
};

// Sort the labels and data arrays by date
labels.sort(sortByDate);
data = data.sort((a, b) => labels.indexOf(a) - labels.indexOf(b));

new Chart(ctx, {
    type: 'line',
    data: {
        labels: labels,
        datasets: [{
            label: "hours",
            data: data,
            borderColor: '#000',
            borderWidth: 1,
            backgroundColor: '#fe0466'
        }]
    },
    options: {
        responsive: true,
        maintainAspectRatio: false,
        legend: {
            display: false
        },
        scales: {
            x: {
                beginAtZero: true,
                stacked: true,
                grid: {
                    display: false
                }
            },
            y: {
                beginAtZero: true,
                grid: {
                    display: true
                }
            }
        }
    }
});

// Function to update the serial numbers
function updateSerialNumbers() {
    var table = document.getElementById("tasktable");
    var rows = table.querySelectorAll("tbody tr");

    rows.forEach(function (row, index) {
        var cell = row.querySelector("td:first-child");
        cell.textContent = index + 1;
    });
}

// Function to update the serial numbers
function updateSerialNumbers() {
    var table = document.getElementById("tasktable");
    var rows = table.querySelectorAll("tbody tr");

    rows.forEach(function (row, index) {
        var cell = row.querySelector("td:first-child");
        cell.textContent = index + 1;
    });
}

// Initialize serial numbers for existing rows
updateSerialNumbers();



