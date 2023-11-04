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