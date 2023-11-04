<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Rubik:wght@400;500;600;700;800&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Raleway:wght@300;400;500;600;700;800;900&display=swap');

*{

font-family:'Rubik';
font-weight:800;
}
.buttonclass{
background-color:#fe0466;
}
</style>
</head>
<body>

<script>
Swal.fire({
    icon: 'success',
    title: 'Registration Successful',
    text: 'Welcome to the Matfly family. We are very happy to have you on board as part of our exceptional team.',
    confirmButtonText: 'Login Now',
    confirmButtonColor: '#fe0466'
}).then((result) => {
    if (result.isConfirmed) {
        window.location.href = '/login'; // Redirect to the login page
    }
});
</script>

</body>
</html>