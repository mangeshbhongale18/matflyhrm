<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
  <link rel="stylesheet" href="css/login.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" />

</head>

<body>
 
  <div class="container">
   
    <div class="wrapper">
      <div class="title"><img src="images/Matfly Digital logo.png" alt=""><span>Login Account</span></div>
      <form action="/logincheck" method="post">
        <div class="row">
          <i class="fas fa-user"></i>
          <input type="text" name="workEmail" placeholder="Please enter your work email" required>
        </div>
        <div class="row">
          <i class="fas fa-lock"></i>
          <input type="password" name="password" placeholder="Password" required>
        </div>
        
        <div class="pass"><a href="#">Forgot password?</a></div>
        <div class="row button">
          <input type="submit" value="Login">
        </div>
        <div class="signup-link">New to Matfly Family ? <a href="signup" style="font-weight: 500; color: #fe0466;">Be a Member</a></div>
     

      </form>
    </div>

  </div>
  


<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script>
  const showError = ${showError};  // This gets the boolean value from the model

  if (showError) {
	  Swal.fire({
	      title: 'You have entered wrong credentials',
	      width: 300,
	      height: 50,
	      imageUrl: '/images/icons/cross.png',
	      imageHeight: 50,
	      confirmButtonText: 'Try Again',
	      confirmButtonColor: "#fe0466",
	      
	    });

  }
</script>


</body>

</html>