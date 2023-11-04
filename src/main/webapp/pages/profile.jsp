<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/profile.css">
<link rel="stylesheet" href="css/global.css">

<title>Document</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
	integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

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
			<li  class="dropdown">
                        <div class="text">
                            <a href="employeedash"><img src="/images/icons/group.png"
                                    alt="Employee Icon">Employee</a>
                            <span class="down-icon"><img src="/images/icons/down.png" alt=""></span>
                        </div>
                        <ul class="dropdown-menu">
                            <li><a href="profile"> <i class="fa-solid fa-user"></i> Profile</a></li>
                            <li><a href="attendance"> <i class="fa-solid fa-list"></i>Attendance Sheet</a></li>
                            <li><a href="salary"> <i class="fa-solid fa-money-bill"></i>Salary Slip</a></li>
                            <li><a href="leaves"> <i class="fa-solid fa-leaf"></i>Leaves</a></li>
                            <li><a href="assets"> <i class="fa-solid fa-computer"></i>Asset Require</a></li>
                            <li><a href="reimbursement"> <i class="fa-solid fa-money-bill-transfer"></i>Reimbursement</a></li>
                        </ul>
                    </li>
                    <c:if test="${designation  == 'Social Media Manager'}">
					<li class="dropdown">
						<div class="text">
							<a href="mangerdash"><img
								src="/images/icons/management.png" alt="Employee Icon">Manager's
								Space</a> <span class="manager-down-icon" data-dropdown="manager-dropdown"><img
								src="/images/icons/down.png" alt=""></span>
						</div>
						<ul class="dropdown-menu" id="manager-dropdown">
							<li><a href="addtask"> <i class="fa-solid fa-list-check"></i>
									Assign Tasks
							</a></li>
						</ul>
					</li>
				</c:if>
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
		<div class="personal-container">
			<header>
				<h2>Employee Personal Details</h2>
			</header>
			<table>
				<c:forEach var="employee" items="${allemp}">
					<tr>
						<th>First Name :</th>
						<td>${employee.firstName}</td>
						<th>Middle Name :</th>
						<td>${employee.middleName}</td>
						<th>Last Name :</th>
						<td>${employee.lastName}</td>
					</tr>
					<tr>
						<th>Date Of Birth :</th>
						<td>${employee.dob}</td>
						<th>Gender :</th>
						<td>${employee.gender}</td>
					</tr>
				</c:forEach>
			</table>
		</div>

		<div class="professional-container">
			<header>
				<h2>Contact Details</h2>
			</header>
			<table>
				<c:forEach var="employee" items="${allemp}">
					</tr>
					<th>Email :</th>
					<td id="email">${employee.personalEmail}</td>
					<th>Phone :</th>
					<td>${employee.personalEmail}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div class="professional-container">
			<header>
				<h2>Address Details</h2>
			</header>
			<table>
				<c:forEach var="employee" items="${allemp}">
					<tr>
						<th>Current Address :</th>
						<td>${employee.currentAddress }</td>
						<th>Permanant Address :</th>
						<td>${employee.permanentAddress }</td>
					</tr>
					<tr>
						<th>City</th>
						<td>${employee.currentCity }</td>
						<th>City</th>
						<td>${employee.permanentCity }</td>
					</tr>
					<tr>
						<th>State</th>
						<td>${employee.currentState }</td>
						<th>State</th>
						<td>${employee.permanentState }</td>
					</tr>
					<tr>
						<th>Country</th>
						<td>${employee.currentCountry }</td>
						<th>Country</th>
						<td>${employee.permanentCountry }</td>
					</tr>
					<tr>
						<th>Postal Code</th>
						<td>${employee.currentPostal }</td>
						<th>Postal Code</th>
						<td>${employee.permanentPostal }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div class="professional-container">
			<header>
				<h2>Work Experience Details</h2>
			</header>
			<table>
				<c:forEach var="employee" items="${allemp}">
					<tr>
						<th>Company</th>
						<td>${employee.companyName }</td>
						<th>Job Title</th>
						<td>${employee.jobTitle }</td>
						<th>Department</th>
						<td>${employee.priveouDepartment }</td>
					</tr>
					<tr>
						<th>Joining Date</th>
						<td>${employee.lastjoinDate }</td>
						<th>Work Experience</th>
						<td>${employee.workExperience }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div class="professional-container">
			<header>
				<h2>Job Details</h2>
			</header>
			<table>
				<c:forEach var="employee" items="${allemp}">
					<tr>
						<th>Joining Date</th>
						<td>${employee.joinDate }</td>
						<th>Department</th>
						<td>${employee.department }</td>
						<th>Designation</th>
						<td>${employee.designation }</td>
					</tr>
					<tr>
						<th>Work Email</th>
						<td id="email">${employee.workEmail }</td>
						<th>Phone</th>
						<td>${employee.workPhone }</td>
						<th>Location</th>
						<td>${employee.workExperience }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div class="professional-container">
			<header>
				<h2>Personal Document</h2>
			</header>
			<table>
				<c:forEach var="employee" items="${allemp}">
					<tr>
						<th>Adhar Card Number</th>
						<td>${employee.adharcard }</td>
						<th>PAN Card Number</th>
						<td>${employee.panCard }</td>
						<th>Passport Number</th>
						<td>${employee.passport }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div class="professional-container">
			<header>
				<h2>Educational Details</h2>
			</header>
			<table>
				<tr>
					<th>10th Details</th>
					<td></td>
					<th>12th Details</th>
					<td></td>
				</tr>
				<c:forEach var="employee" items="${allemp}">
					<tr>
						<th>School</th>
						<td>${employee.ssc }</td>
						<th>School</th>
						<td>${employee.hsc }</td>
					</tr>
					<tr>
						<th>State</th>
						<td>${employee.sscState }</td>
						<th>State</th>
						<td>${employee.hscState }</td>
					</tr>
				</c:forEach>
			</table>
			<table>
				<tr>
					<th>UG Details</th>
					<td></td>
					<th>PG Details</th>
					<td></td>
				</tr>
				<c:forEach var="employee" items="${allemp}">
					<tr>
						<th>School</th>
						<td>${employee.ugname }</td>
						<th>School</th>
						<td>${employee.pgname }</td>
					</tr>
					<tr>
						<th>State</th>
						<td>${employee.stateug }</td>
						<th>State</th>
						<td>${employee.statepg }</td>
					</tr>
				</c:forEach>

			</table>
		</div>
		<div class="professional-container">
			<header>
				<h2>Emergency Contact Details</h2>
			</header>
			<table>
				<c:forEach var="employee" items="${allemp}">
					<tr>
						<th>Phone</th>
						<td>${employee.emergencyno }</td>
						<th>Relation</th>
						<td>${employee.relation }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div class="document-container">
			<header>
				<h2>Personal Documents</h2>
			</header>
			<table>
				<c:forEach var="employee" items="${allemp}">
					<tr>
						<th>Resume</th>
						<td>${employee.resumefilename }</td>
						<td><a href="/viewDocument/${employee.resumefilename}"
							target="_blank" class="btn">View</a> <a
							href="/downloadDocument/${employee.resumefilename}" class="btn">Download</a></td>
					</tr>
					<tr>
						<th>Photo</th>
						<td>${employee.profilepicfilename }</td>
						<td><a href="/viewDocument/${employee.profilepicfilename}"
							target="_blank" class="btn">View</a> <a
							href="/downloadDocument/${employee.profilepicfilename}"
							class="btn">Download</a></td>
					</tr>
					<tr>
						<th>Adhar Card</th>
						<td>${employee.adharcardfilename }</td>
						<td><a href="/viewDocument/${employee.adharcardfilename}"
							target="_blank" class="btn">View</a> <a
							href="/downloadDocument/${employee.adharcardfilename}"
							class="btn">Download</a></td>
					</tr>
					<tr>
						<th>Pan Card</th>
						<td>${employee.pancardfilename }</td>
						<td><a href="/viewDocument/${employee.pancardfilename}"
							target="_blank" class="btn">View</a> <a
							href="/downloadDocument/${employee.pancardfilename}" class="btn">Download</a></td>
					</tr>
					<tr>
						<th>Passport Card</th>
						<td>${employee.passportcardfilename }</td>
						<td><a href="/viewDocument/${employee.passportcardfilename}"
							target="_blank" class="btn">View</a> <a
							href="/downloadDocument/${employee.passportcardfilename}"
							class="btn">Download</a></td>
					</tr>
					<tr>
						<th>SSC Certificate</th>
						<td>${employee.sscdocname }</td>
						<td><a href="/viewDocument/${employee.sscdocname}"
							target="_blank" class="btn">View</a> <a
							href="/downloadDocument/${employee.sscdocname}" class="btn">Download</a></td>
					</tr>
					<tr>
						<th>HSC Certificate</th>
						<td>${employee.hscdocname }</td>
						<td><a href="/viewDocument/${employee.hscdocname}"
							target="_blank" class="btn">View</a> <a
							href="/downloadDocument/${employee.hscdocname}" class="btn">Download</a></td>
					</tr>
					<tr>
						<th>UG Certificate</th>
						<td>${employee.ugdocfilename }</td>
						<td><a href="/viewDocument/${employee.ugdocfilename}"
							target="_blank" class="btn">View</a> <a
							href="/downloadDocument/${employee.ugdocfilename}" class="btn">Download</a></td>
					</tr>
					<tr>
						<th>PG Certificate</th>
						<td>${employee.pgdocfilename }</td>
						<td><a href="/viewDocument/${employee.pgdocfilename}"
							target="_blank" class="btn">View</a> <a
							href="/downloadDocument/${employee.pgdocfilename}" class="btn">Download</a></td>
					</tr>

				</c:forEach>
			</table>
		</div>

	</div>

	<script>
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
	</script>
</body>

</html>