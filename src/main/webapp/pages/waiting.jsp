<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Rubik:wght@300;500;600;700;800&display=swap"
	rel="stylesheet">
<style>
* {
	font-family: 'Rubik', sans-serif;
}
</style>
</head>
<body>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script>
	Swal.fire({
	    title: 'Profile Under Review',
	    text: 'We apologize for the inconvenience. Your profile is currently under review, and we kindly ask for your patience while we process your information.',
	    imageUrl: '/images/waiting.svg',
	    imageWidth: 600,
	    imageHeight: 300,
	    imageAlt: 'Custom image',
	    timer: 10000, // Set the timer in milliseconds (e.g., 1000ms = 1 seconds)
	    confirmButtonText: 'I Understand !', // Corrected the confirmButtonText
	    showConfirmButton: true,
	}).then(function() {
	    // Redirect to the desired URL after the message is displayed for 3 seconds
	    window.location.href = '/login';
	});


	</script>
</body>
</html>