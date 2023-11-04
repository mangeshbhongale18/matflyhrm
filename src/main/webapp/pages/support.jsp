<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/assets.css">
<link rel="stylesheet" href="css/global.css">

<title>Document</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
	integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<script
	src="https://cdn.jsdelivr.net/npm/sweetalert2@11.3.0/dist/sweetalert2.all.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/sweetalert2@11.3.0/dist/sweetalert2.min.css">


</head>

<body>


	<sidebar>
	<div class="sidewrapper">
		<div class="logo">
			<img src="images/Matfly Digital logo.png" alt="">
		</div>
		<div class="user">
			<div class="userimg">
				<img src="images/icons/black_person.png" alt="">
			</div>
			<div class="userinfo">
				<h3>${usernname}</h3>
				<p>${designation }</p>
				<p id="empid" style="display: none;">${empid}</p>

			</div>

		</div>
		<div class="navitems">
			<ul class="nav-list">
				<li><a href="dashboard"><img
						src="/images/icons/dashboard.png" alt="Dashboard Icon">Dashboard</a></li>
				<li class="dropdown">
					<div class="text">
						<a href="employeedash"><img src="/images/icons/group.png"
							alt="Employee Icon">Employee</a> <span class="down-icon"><img
							src="/images/icons/down.png" alt=""></span>
					</div>
					<ul class="dropdown-menu">
						<li><a href="profile"> <i class="fa-solid fa-user"></i>
								Profile
						</a></li>
						<li><a href="attendance"> <i class="fa-solid fa-list"></i>Attendance
								Sheet
						</a></li>
						<li><a href="salary"> <i class="fa-solid fa-money-bill"></i>Salary
								Slip
						</a></li>
						<li><a href="leaves"> <i class="fa-solid fa-leaf"></i>Leaves
						</a></li>
						<li><a href="assets"> <i class="fa-solid fa-computer"></i>Asset
								Require
						</a></li>
						<li><a href="reimbursement"> <i
								class="fa-solid fa-money-bill-transfer"></i>Reimbursement
						</a></li>
					</ul>
				</li>
				<c:if test="${designation  == 'Social Media Manager'}">
					<li class="dropdown">
						<div class="text">
							<a href="mangerdash"><img src="/images/icons/management.png"
								alt="Employee Icon">Manager's Space</a> <span
								class="manager-down-icon" data-dropdown="manager-dropdown"><img
								src="/images/icons/down.png" alt=""></span>
						</div>
						<ul class="dropdown-menu" id="manager-dropdown">
							<li><a href="addtask"> <i class="fa-solid fa-list-check"></i>
									Assign Tasks
							</a></li>
						</ul>
					</li>
				</c:if>
				<li class="dropdown">
					<div class="text">
						<a href="ceodash"><img src="/images/icons/ceo.png"
							alt="Employee Icon">CEO's Space</a> <span class="ceo-drop-icon"
							data-dropdown="ceo-dropdown"><img
							src="/images/icons/down.png" alt=""></span>
					</div>
					<ul class="dropdown-menu" id="ceo-dropdown">
						<li><a href="allemployee"> <i
								class="fa-solid fa-users-rays"></i> Employee's List
						</a></li>
						<li><a href="addtask"> <i class="fa-solid fa-list-check"></i>
								Assign Tasks
						</a></li>
						<li><a href="permissions"> <i
								class="fa-solid fa-key"></i> Permission's
						</a></li>
					</ul>
				</li>
				<li><a href="clients"><img src="/images/icons/clients.png"
						alt="Clients Icon">Clients</a></li>
				<li><a href="calendar"><img
						src="/images/icons/calender.png" alt="Calendar Icon">Calendar</a></li>
				<li><a href="suggestion"><img
						src="/images/icons/envelope.png" alt="Suggestions Icon">Suggestions</a></li>
				<li><a href="support"><img
						src="/images/icons/black_headset.png" alt="Support Icon">Support</a></li>
			</ul>
		</div>


	</div>
	</sidebar>

	<div class="dashmain">
		<div class="header">
			<div class="headertext">
				<h3>MATFLY DIGITAL MARKETING HUMAN RESOURCE MANAGEMENT SYSTEM</h3>
			</div>
			<div class="righttop">
				<a href="support"> <img src="images/icons/black_headset.png"
					alt=""> Support
				</a> <a href="logout"> <img src="images/icons/logout_black.png"
					alt="">
				</a> <a href="#" class="ratingbtn" onclick="getRating()"> <img
					src="images/icons/rating.png" alt="">
				</a> <a id="notification-icon"> <img
					src="images/icons/notification.png" alt=""> <span
					class="notification-badge"> <span class="badge-number">${notificationCount}</span>
				</span>
				</a>

			</div>
		</div>

		<div class="container">
			<div class="title">
				<h1>Tell us your problems</h1>
				<img src="images/Matfly Digital logo.png" alt="">
			</div>
			<div class="content">
				<form action="needsupport" method="post">
					<div class="user-details">
						<div class="input-box">
							<span class="details">Employee Name</span> <input type="text"
								name="fullname" placeholder="Enter your Full Name" required>
						</div>
						<div class="input-box">
							<span class="details">Employee ID</span> <input type="text"
								name="empid" placeholder="Enter your Employee ID" required>
						</div>
						<div class="input-box">
							<span class="details">Department</span> <input type="text"
								name="department" placeholder="Enter your Department" required>
						</div>
						<div class="input-box">
							<span class="details">Designation</span> <input type="text"
								name="designation" placeholder="Enter your Designation" required>
						</div>
						<div class="input-box">
							<span class="details">Work Email</span> <input type="text"
								name="wemail" placeholder="Enter your work email id" required>
						</div>
						<div class="input-box">
							<span class="details">Mobile Number</span> <input type="text"
								name="mobile" placeholder="Enter your mobile number" required>
						</div>
						<div class="input-box">
							<span class="details">Probelm Topic</span> <input type="text"
								name="problemtopic"
								placeholder="e.g Technical, salary, attendance" required>
						</div>
						<div class="input-box">
							<span class="details">Problem Description</span>
							<textarea name="problemdesc" cols="50" rows="4"
								placeholder="Enter a description of the problem" required></textarea>
						</div>


					</div>

					<div class="button">
						<input type="submit" value="Sumbit your Problem">
					</div>

				</form>
			</div>
		</div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script src="Js/reimbuersement.js"></script>


	<script>
		const supportsaved = $
		{
			supportsaved
		}; // This gets the boolean value from the model

		if (supportsaved) {
			Swal.fire({

				width : 300,
				height : 50,
				imageUrl : '/images/icons/success.png',
				imageHeight : 100,
				showConfirmButton : false,
				title : 'Submitted!<br> Our expert team will get back you.',
				showCloseButton : true,
				timer : 2000,
				didClose : function() {
					window.location.href = "support";
				}
			});

		}
	</script>

</body>

</html>