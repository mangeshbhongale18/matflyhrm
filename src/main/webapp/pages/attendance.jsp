<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/attendance.css">
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

<link rel="stylesheet"
	href="//cdnjs.cloudflare.com/ajax/libs/timepicker/1.3.5/jquery.timepicker.min.css">
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
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
				<li class="active"><a href="dashboard"><img
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
						<li><a href="permissions"> <i class="fa-solid fa-key"></i>
								Permission's
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

		<div class="attendance-container">
			<h2>Attendance Sheet</h2>
			<form action="todayatn" method="post">
				<div class="form-field">
					<label for="date">Date:</label> <input type="date" name="date"
						required>
				</div>
				<div class="form-field" style="display: none">
					<label for="date">Employee ID</label> <input type="text"
						name="empid" value=${empid } required>
				</div>
				<div class="form-field">
					<label for="InTime">In Time</label> <input type="time"
						name="intime" id="timepicker" required>

				</div>
				<div class="form-field">
					<label for="OutTime">Out Time</label> <input type="time"
						name="outtime" required>
				</div>
				<div class="form-field">
					<label for="status">Status:</label> <select id="status"
						name="status" required>
						<option value="present">Present</option>
						<option value="absent">Absent</option>
						<option value="half day">Half Day</option>
						<option value="week off">Week off</option>
						<option value="holiday">Holiday</option>
					</select>
				</div>
				<input type="submit" value="Submit">
			</form>
		</div>

		<div class="days-container">
			<h2>Days Calculator</h2>

			<form action="saveDayCount" method="post" id="myForm">
				<div class="day-count">
					<h4>Total Month Day :</h4>
					<h4 class="number totalMonthDay">0</h4>
					<input type="hidden" name="totalmonthday" value="">
				</div>
				<div class="day-count">
					<h4>Total Present Day :</h4>
					<h4 class="number totalPresentDay">0</h4>
					<input type="hidden" name="totalpresentdays" value="">
				</div>
				<div class="day-count">
					<h4>Total Absent Day :</h4>
					<h4 class="number totalAbsentDay">0</h4>
					<input type="hidden" name="totalabsentday" value="">
				</div>
				<div class="day-count">
					<h4>Total Half Day :</h4>
					<h4 class="number totalHalfDay">0</h4>
					<input type="hidden" name="halfdays" value="">
				</div>
				<div class="day-count">
					<h4>Total Holidays :</h4>
					<h4 class="number totalHolidays">0</h4>
				</div>
				<input type="hidden" name="month" value=""> <input
					type="hidden" name="year" value=""> <input type="submit"
					style="display: none;" value="submit">
			</form>

		</div>

		<div class="wrapper">
			<header>
				<p class="current-date"></p>
				<div class="colorindiacator">
					<p style="cursor: pointer;">
						<i class="fa-regular fa-square"></i>Today
					</p>

					<p>
						<i style="color: #008000;" class="fa-solid fa-square"></i>Present
					</p>
					<p>
						<i style="color: #FF0000;" class="fa-solid fa-square"></i>Absent
					</p>
					<p>
						<i style="color: #c74258;" class="fa-solid fa-square"></i>On Leave
					</p>
					<p>
						<i style="color: #747272;" class="fa-solid fa-square"></i>Week Off
					</p>
					<p>
						<i style="color: #11035b;" class="fa-solid fa-square"></i>Holiday
					</p>
				</div>
				<div class="icons">
					<span id="prev" class="material-symbols-rounded"><i
						class="fa-solid fa-chevron-left"></i></span> <span id="next"
						class="material-symbols-rounded"><i
						class="fa-solid fa-chevron-right"></i></span>
				</div>
			</header>
			<div class="calendar">
				<ul class="weeks">
					<li>Sun</li>
					<li>Mon</li>
					<li>Tue</li>
					<li>Wed</li>
					<li>Thu</li>
					<li>Fri</li>
					<li>Sat</li>
				</ul>
				<ul class="days"></ul>
			</div>
		</div>
	</div>




	<div style="display: none" class="attendanceList">
		<ul>
			<c:forEach items="${attendancelist}" var="c">
				<ul>
					<li class="atndate">${c.date }</li>
					<li class="atnstatus">${c.status}</li>
				</ul>
			</c:forEach>
		</ul>
	</div>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/timepicker/1.3.5/jquery.timepicker.min.js"></script>
	<script src="Js/attendance.js"></script>
</body>

</html>