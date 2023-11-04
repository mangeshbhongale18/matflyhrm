const passwordInput = document.querySelector('input[name="password"]');
const confirmPasswordInput = document.querySelector('input[name="cpassword"]');

const passwordValidation = () => {
	if (passwordInput.value !== confirmPasswordInput.value) {
		// Display an error message
		Swal.fire({
			title: 'Password and Confirm password should be same',
			width: 300,
			height: 200,
			confirmButtonText: 'Got it',
			confirmButtonColor: "#fe0466",
		});

		return false;
	}

	// The password and confirm password are the same
	return true;
};

// Add an event listener to the password and confirm password input fields
confirmPasswordInput.addEventListener('change', passwordValidation);

function validateSelect(select, errorMessageId) {
  if (select.value === "") {
    // Show error message
    document.getElementById(errorMessageId).innerHTML = "Please select a value.";

    // Prevent form from submitting
    return false;
  } else {
    // Hide error message
    document.getElementById(errorMessageId).innerHTML = "";

    // Allow form to submit
    return true;
  }
}
validateSelect(departmentSelect, "departmentErrorMessage");
validateSelect(designationSelect, "designationErrorMessage");
validateSelect(genderSelect,"genderErrorMessage");





