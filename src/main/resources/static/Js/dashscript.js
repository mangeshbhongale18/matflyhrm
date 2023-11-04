




// Function to update the serial numbers
function updateSerialNumbers() {
	var table = document.getElementById("employeeTable");
	var rows = table.querySelectorAll("tbody tr");

	rows.forEach(function(row, index) {
		var cell = row.querySelector("td:first-child");
		cell.textContent = index + 1;
	});
}
// Initialize serial numbers for existing rows
updateSerialNumbers();

document.querySelector('.down-icon').addEventListener(
	'click',
	function() {
		const dropdownMenu = document
			.querySelector('.dropdown-menu');
		const parentListItem = dropdownMenu.closest('.dropdown');

		if (dropdownMenu.style.display === 'none'
			|| dropdownMenu.style.display === '') {
			dropdownMenu.style.display = 'block';
			parentListItem.classList.add('dropdown-open');
		} else {
			dropdownMenu.style.display = 'none';
			parentListItem.classList.remove('dropdown-open');
		}
	});
	
// Create a reusable function to toggle the dropdown
function toggleManagerDropdown() {
    const managerDropdown = document.querySelector('ul#manager-dropdown');
    const parentListItem = managerDropdown.closest('.dropdown');

    if (managerDropdown.style.display === 'none' || managerDropdown.style.display === '') {
        managerDropdown.style.display = 'block';
        parentListItem.classList.add('dropdown-open');
    } else {
        managerDropdown.style.display = 'none';
        parentListItem.classList.remove('dropdown-open');
    }
}

// Add a click event listener to all elements with class "manager-down-icon"
const managerIcons = document.querySelectorAll('.manager-down-icon');

managerIcons.forEach(icon => {
    icon.addEventListener('click', toggleManagerDropdown);
});

function toggleCEODropdown() {
    const ceoDropdown = document.querySelector('ul#ceo-dropdown');
    const parentListItem = ceoDropdown.closest('.dropdown');

    if (ceoDropdown.style.display === 'none' || ceoDropdown.style.display === '') {
        ceoDropdown.style.display = 'block';
        parentListItem.classList.add('dropdown-open');
    } else {
        ceoDropdown.style.display = 'none';
        parentListItem.classList.remove('dropdown-open');
    }
}

// Add a click event listener to all elements with class "ceo-drop-icon"
const ceoIcons = document.querySelectorAll('.ceo-drop-icon');

ceoIcons.forEach(icon => {
    icon.addEventListener('click', toggleCEODropdown);
});

	
	


document.addEventListener("DOMContentLoaded", function() {
	const notificationIcon = document.getElementById("notification-icon");
	const notificationsContainer = document.querySelector(".notifications-container");

	notificationIcon.addEventListener("click", function() {
		if (notificationsContainer.style.display === "none" || notificationsContainer.style.display === "") {
			notificationsContainer.style.display = "block";
		} else {
			notificationsContainer.style.display = "none";
		}
	});
});


function clearNotification(button) {
	// Find the <li> element containing the notification and remove it
	var notificationListItem = button.parentElement;
	notificationListItem.remove();

	// You can also send an AJAX request to the server to mark the notification as "read" if needed
	// Example: sendNotificationReadStatus(notificationText);
}

function getRating() {
	const currentDate = new Date();
	const currentYear = currentDate.getFullYear();
	const monthNames = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
	const currentMonth = monthNames[currentDate.getMonth()]; // Get the month's name
	const empidElement = document.getElementById('empid');
	const empid = empidElement.textContent; // Retrieve the text content of the <p> element

	console.log(`Employee ID: ${empid}`);


	Swal.fire({
		title: 'How Satisfied you are in Matfly in This Month',
		text: 'Please rate between 1 to 5',
		input: 'range',
		inputAttributes: {
			min: 1,
			max: 5,
			step: 1
		},
		inputValue: 3,
		confirmButtonText: "Submit",
	}).then((result) => {
		if (result.value) {
			const rating = result.value;

			// Use month's name in the fetch URL
			fetch(`/rate?rating=${rating}&month=${currentMonth}&year=${currentYear}&empid=${empid}`, {

				method: 'POST'
			}).then(response => {
				if (response.ok) {
					Swal.fire('Thanks for your feedback!', 'Your valuable feedback has been saved – much appreciated!.', 'success')
						.then(() => {
							// The user has clicked "OK" on the SweetAlert dialog.
							// Redirect to the dashboard after they close the dialog.
							window.location.href = '/dashboard'; // Replace with your dashboard URL
						})
				} else {
					Swal.fire('Rating Already Submitted', 'You have already submitted your rating. Thank you for your feedback! You can give rating in next month', 'info')
						.then(() => {
							// The user has clicked "OK" on the SweetAlert dialog.
							// Redirect to the dashboard after they close the dialog.
							window.location.href = '/dashboard'; // Replace with your dashboard URL
						})
				}
			})

				.catch(error => {
					console.error('Error:', error);
				});
		}
	});
}




