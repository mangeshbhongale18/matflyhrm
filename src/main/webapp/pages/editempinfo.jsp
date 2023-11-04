<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>Registration Form | Matfly</title>
<link rel="stylesheet" href="css/signup.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
	<div class="signup-container">
		<div class="title">
			<h1>Registration</h1>
			<img src="images/Matfly Digital logo.png" alt="">
		</div>
		<form action="registeremp" method="post" enctype="multipart/form-data">
			<c:forEach var="e" items="${editemp}">
				<div class="form-group">
					<h3>Personal Details</h3>
					<div class="row">
						<div class="form-field">
							<label for="first_name">First Name</label> <input type="text"
								name="firstName" required value="${e.firstName}"
								placeholder="Enter your first name">
						</div>
						<div class="form-field">
							<label for="last_name">Middle Name</label> <input type="text"
								name="middleName" required value="${e.middleName}"
								placeholder="Enter your middle name">
						</div>
						<div class="form-field">
							<label for="email">Last Name</label> <input type="text"
								name="lastName" required value="${e.lastName}"
								placeholder="Enter your last name">
						</div>
					</div>
					<div class="row">
						<div class="form-field">
							<label for="dob">Date of Birth</label> <input type="date"
								name="dob" required value="${e.dob}"
								placeholder="Select your date of birth">
						</div>
						<div class="form-field">
							<label for="gender">Gender</label> <select name="gender" required>
								<option value="" disabled ${e.gender==null?'selected' : ''}>Select
									your gender</option>
								<option value="male" ${e.gender == 'male' ? 'selected' : ''}>Male</option>
								<option value="female" ${e.gender == 'female' ? 'selected' : ''}>Female</option>
								<option value="other" ${e.gender == 'other' ? 'selected' : ''}>Other</option>
							</select> <span class="error-message" id="genderErrorMessage"></span>
						</div>

					</div>
				</div>

				<div class="form-group">
					<h3>Contact Details</h3>
					<div class="row">
						<div class="form-field">
							<label for="email">Email</label> <input type="email"
								name="personalEmail" required value="${e.personalEmail}"
								placeholder="Enter Personal email ID">
						</div>
						<div class="form-field">
							<label for="mobile">Phone</label> <input type="text"
								name="personalPhone" required value="${e.personalPhone}"
								placeholder="Enter Personal Phone number">
						</div>
					</div>
				</div>

				<div class="form-group">
					<h3>Address</h3>
					<div class="row">
						<div class="form-field">
							<label for="address">Current Address</label> <input type="text"
								name="currentAddress" required value="${e.currentAddress}"
								placeholder="Enter Current Address">
						</div>
						<div class="form-field">
							<label for="Permanent-address">Permanent Address</label> <input
								type="text" name="permanentAddress" required
								value="${e.permanentAddress}"
								placeholder="Enter Permanent Address">
						</div>
					</div>
					<div class="row">
						<div class="form-field">
							<label for="City">City</label> <input type="text"
								name="currentCity" required value="${e.currentCity}"
								placeholder="Enter City">
						</div>
						<div class="form-field">
							<label for="City">City</label> <input type="text"
								name="permanentCity" required value="${e.permanentCity}"
								placeholder="Enter City">
						</div>

					</div>
					<div class="row">
						<div class="form-field">
							<label for="State">State</label> <input type="text"
								name="currentState" required value="${e.currentState}"
								placeholder="Enter State">
						</div>
						<div class="form-field">
							<label for="State">State</label> <input type="text"
								name="permanentState" required value="${e.permanentState}"
								placeholder="Enter State">
						</div>
					</div>
					<div class="row">
						<div class="form-field">
							<label for="Country">Country</label> <input type="text"
								name="currentCountry" required value="${e.currentCountry}"
								placeholder="Enter Country">
						</div>
						<div class="form-field">
							<label for="Country">Country</label> <input type="text"
								name="permanentCountry" required value="${e.permanentCountry}"
								placeholder="Enter Country">
						</div>
					</div>
					<div class="row">
						<div class="form-field">
							<label for="Postal">Postal Code</label> <input type="text"
								name="currentPostal" required value="${e.currentPostal}"
								placeholder="Enter Postal Code">
						</div>
						<div class="form-field">
							<label for="Postal">Postal Code</label> <input type="text"
								name="permanentPostal" required value="${e.permanentPostal}"
								placeholder="Enter Postal Code">
						</div>
					</div>
				</div>


				<!-- Professional Details -->
				<div class="form-group">
					<h3>Work Experience Details (Optional)</h3>
					<div class="row">
						<div class="form-field">
							<label for="company">Company</label> <input type="text"
								name="companyName" value="${e.companyName}"
								placeholder="Enter your company name">
						</div>
						<div class="form-field">
							<label for="job_title">Job Title</label> <input type="text"
								name="jobTitle" value="${e.jobTitle}"
								placeholder="Enter your job title">
						</div>
						<div class="form-field">
							<label for="industry">Department</label> <input type="text"
								name="priveouDepartment" value="${e.priveouDepartment}"
								placeholder="Enter your industry">
						</div>
					</div>
					<div class="row">
						<div class="form-field">
							<label for="join-date">Joining Date</label> <input type="date"
								name="lastjoinDate" value="${e.lastjoinDate}"
								placeholder="Select your joining date">
						</div>
						<div class="form-field">
							<label for="work_experience">Work Experience (years)</label> <input
								type="text" name="workExperience" value="${e.workExperience}"
								placeholder="Enter your years of work experience">
						</div>
					</div>
				</div>

				<div class="form-group">
					<h3>Job Details</h3>
					<div class="row">
						<div class="form-field">
							<label for="join-date">Joining Date</label> <input type="date"
								name="joinDate" required value="${e.joinDate}"
								placeholder="Select your joining date">
						</div>
						<div class="form-field">
							<label for="department">Department</label> <select
								name="department" required onchange="validateDepartment(this)">
								<option value=""disabled ${emptye.department ? 'selected' : ''}>Select
									department</option>
								<option value="Sales"
									${'Sales'.equals(e.department) ? 'selected' : ''}>Sales
									Team</option>
								<option value="Manager"
									${'Manager'.equals(e.department) ? 'selected' : ''}>Operational
									Department</option>
								<option value="Graphics"
									${'Graphics'.equals(e.department) ? 'selected' : ''}>Graphics
									Department</option>
								<option value="Social Media Executive"
									${'Social Media Executive'.equals(e.department) ? 'selected' : ''}>Social
									Media Team</option>
								<option value="Website Development"
									${'Website Development'.equals(e.department) ? 'selected' : ''}>Development
									Team</option>
							</select> <span class="error-message" id="departmentErrorMessage"></span>
						</div>

						<div class="form-field">
							<label for="Designation">Designation</label> <select
								name="Designation" required onchange="validateDesignation(this)">
								<option value=""disabled ${emptye.designation ? 'selected' : ''}>Select
									designation</option>

								<!-- Operation Team -->
								<optgroup label="Operation Team">
									<option value="Head Of Operation"
										${'Head Of Operation'.equals(e.designation) ? 'selected' : ''}>Head
										Of Operation</option>
									<option value="Social Media Manager"
										${'Social Media Manager'.equals(e.designation) ? 'selected' : ''}>Social
										Media Manager</option>
									<option value="Team Leader"
										${'Team Leader'.equals(e.designation) ? 'selected' : ''}>Team
										Leader (TL)</option>
								</optgroup>

								<!-- Digital Marketing Team -->
								<optgroup label="Digital Marketing Team">
									<option value="Sr. Digital Marketing Manager"
										${'Sr. Digital Marketing Manager'.equals(e.designation) ? 'selected' : ''}>Sr.
										Digital Marketing Manager</option>
									<option value="Digital Marketing Manager"
										${'Digital Marketing Manager'.equals(e.designation) ? 'selected' : ''}>Digital
										Marketing Manager</option>
									<option value="Digital Marketing Team Leader"
										${'Digital Marketing Team Leader'.equals(e.designation) ? 'selected' : ''}>Digital
										Marketing Team Leader</option>
									<!-- Add other digital marketing designations with similar logic -->
								</optgroup>

								<!-- Sales & Marketing Team -->
								<optgroup label="Sales & Marketing Team">
									<!-- Add sales and marketing designations with similar logic -->
								</optgroup>

								<!-- Graphics Team -->
								<optgroup label="Graphics Team">
									<!-- Add graphics designations with similar logic -->
								</optgroup>

								<!-- Development Team -->
								<optgroup label="Development Team">
									<!-- Add development designations with similar logic -->
								</optgroup>
							</select> <span class="error-message" id="designationErrorMessage"></span>
						</div>


					</div>
					<div class="row">
						<div class="form-field">
							<label for="work-email">Work Email</label> <input type="email"
								name="workEmail" required value="${e.workEmail}"
								placeholder="Enter your work email address">
						</div>
						<div class="form-field">
							<label for="work-email">Phone</label> <input type="text"
								name="workPhone" required value="${e.workPhone}"
								placeholder="Enter Company Provided Number">
						</div>
						<div class="form-field">
							<label for="Location">Location</label> <input type="text"
								name="location" required value="${e.location}"
								placeholder="Enter your work location">
						</div>
					</div>
				</div>

				<div class="form-group" id="personal-docs">
					<h3>Personal Document</h3>
					<div class="row">
						<div class="form-field">
							<label for="Adharcard">Adhar Card Number</label> <input
								type="text" required name="adharcard"
								placeholder="Enter Adhar number" value="${e.adharcard}">
						</div>
						<div class="form-field">
							<label for="PANCard">PAN Card Number</label> <input type="text"
								name="panCard" required placeholder="Enter PAN number"
								value="${e.panCard}">
						</div>
						<div class="form-field">
							<label for="Passport">Passport Number (Optional)</label> <input
								type="text" name="passport" placeholder="Enter Passport number"
								value="${e.passport}">
						</div>
					</div>
					<div class="row">
						<div class="form-field">
							<label for="adharcardfile">Adhar Card</label> <input type="file"
								name="adharcardfile" required
								placeholder="Upload your Adhar Card Document"> <span
								style="display: block; margin-top: 10px;"> <c:choose>
									<c:when test="${not empty e.adharcardfilename}">
                        ${e.adharcardfilename}
                        <a
											href="<c:url value='/viewDocument/${e.adharcardfilename}' />"
											class="btn" target="_blank">View</a>
										<a href="<c:url value='/downloadDocument/${e.adharcardfilename}' />"
											class="btn" download="${e.adharcardfilename}">Download</a>
									</c:when>
									<c:otherwise>No file uploaded</c:otherwise>
								</c:choose>
							</span>
						</div>
						<div class="form-field">
							<label for="pancardfile">PAN Card</label> <input type="file"
								name="pancardfile" required
								placeholder="Upload your PAN Card Document"> <span
								style="display: block; margin-top: 10px;"> <c:choose>
									<c:when test="${not empty e.pancardfilename}">
                        ${e.pancardfilename}
                        <a
											href="<c:url value='/viewDocument/${e.pancardfilename}' />"
											class="btn" target="_blank">View</a>
										<a href="<c:url value='/downloadDocument/${e.pancardfilename}' />"
											class="btn" download="${e.pancardfilename}">Download</a>
									</c:when>
									<c:otherwise>No file uploaded</c:otherwise>
								</c:choose>
							</span>
						</div>
						<div class="form-field">
							<label for="passportcardfile">Passport (Optional)</label> <input
								type="file" name="passportcardfile"
								placeholder="Upload your Passport Document"> <span
								style="display: block; margin-top: 10px;"> <c:choose>
									<c:when test="${not empty e.passportcardfilename}">
                        ${e.passportcardfilename}
                        <a
											href="<c:url value='/viewDocument/${e.passportcardfilename}' />"
											class="btn" target="_blank">View</a>
										<a
											href="<c:url value='/downloadDocument/${e.passportcardfilename}' />"
											class="btn" download="${e.passportcardfilename}">Download</a>
									</c:when>
									<c:otherwise>No file uploaded</c:otherwise>
								</c:choose>
							</span>
						</div>
					</div>
				</div>


				<div class="form-group">
					<h3>Educational Details</h3>
					<div class="row">
						<div class="form-field">
							<h4>10th Details</h4>
							<label for="school_10th">School Name</label> <input type="text"
								name="ssc" required value="${e.ssc}"
								placeholder="Enter your 10th school name">
						</div>
						<div class="form-field">
							<h4>12th Details</h4>
							<label for="school_12th">High School Name</label> <input
								type="text" name="hsc" value="${e.hsc}"
								placeholder="Enter your 12th school name">
						</div>
					</div>
					<div class="row">
						<div class="form-field">
							<label for="state_10th">State</label> <input type="text"
								name="sscState" required value="${e.sscState}"
								placeholder="Enter the state">
						</div>
						<div class="form-field">
							<label for="state_12th">State</label> <input type="text"
								name="hscState" value="${e.hscState}"
								placeholder="Enter the state">
						</div>
					</div>
					<div class="row">
						<div class="form-field">
							<label for="Ug-docs">10th Document</label> <input type="file"
								name="sscdoc" required
								placeholder="Upload your SSC Markesheet/Certificate"
								id="ssc-docs"> <span
								style="display: block; margin-top: 10px;"> <c:choose>
									<c:when test="${not empty e.sscdocname}">
									${e.sscdocname}
										<a href="<c:url value='/viewDocument/${e.sscdocname}' />"
											class="btn" target="_blank">View</a>
										<a href="<c:url value='/downloadDocument/${e.sscdocname}' />"
											class="btn" download="${e.sscdocname}">Download</a>
									</c:when>
									<c:otherwise>No file uploaded</c:otherwise>
								</c:choose>
							</span>
						</div>
						<div class="form-field">
							<label for="Ug-docs">12th Document</label> <input type="file"
								name="hscdoc"
								placeholder="Upload your HSC Markesheet/Certificate"
								id="hsc-docs"> <span
								style="display: block; margin-top: 10px;"> <c:choose>
									<c:when test="${not empty e.hscdocname}">
									${e.hscdocname}
										<a href="<c:url value='/viewDocument/${e.hscdocname}' />"
											class="button-style" target="_blank">View</a>
										<a href="<c:url value='/downloadDocument/${e.hscdocname}' />"
											class="button-style" download="${e.hscdocname}">Download</a>
									</c:when>
									<c:otherwise>No file uploaded</c:otherwise>
								</c:choose>
							</span>
						</div>
					</div>

					<div class="row">
						<div class="form-field">
							<h4 class="UG-PG">UG Details</h4>
							<label for="college_ug">College Name</label> <input type="text"
								name="ugname" value="${e.ugname}"
								placeholder="Enter your college name">
						</div>
						<div class="form-field">
							<h4 class="UG-PG">PG Details</h4>
							<label for="college_pg">College Name</label> <input type="text"
								name="pgname" value="${e.pgname}"
								placeholder="Enter your college name">
						</div>
					</div>
					<div class="row">
						<div class="form-field">
							<label for="state_ug">State</label> <input type="text"
								name="stateug" value="${e.stateug}"
								placeholder="Enter the state of your college">
						</div>
						<div class="form-field">
							<label for="state_pg">State</label> <input type="text"
								name="statepg" value="${e.statepg}"
								placeholder="Enter the state of your college">
						</div>
					</div>
					<div class="row">
						<div class="form-field">
							<label for="Ug-docs">UG Document</label> <input type="file"
								name="ugdoc" placeholder="Upload your UG Certificate"
								id="ug-docs"> <span
								style="display: block; margin-top: 10px;"> <c:choose>
									<c:when test="${not empty e.ugdocfilename}">
                    ${e.ugdocfilename}
                    <a
											href="<c:url value='/viewDocument/${e.ugdocfilename}' />"
											class="btn" target="_blank">View</a>
										<a href="<c:url value='/downloadDocument/${e.ugdocfilename}' />"
											class="btn" download="${e.ugdocfilename}">Download</a>
									</c:when>
									<c:otherwise>No file uploaded</c:otherwise>
								</c:choose>
							</span>
						</div>
						<div class="form-field">
							<label for="Ug-docs">PG Document</label> <input type="file"
								name="pgdoc" placeholder="Upload your PG Certificate"
								id="pg-docs"> <span
								style="display: block; margin-top: 10px;"> <c:choose>
									<c:when test="${not empty e.pgdocfilename}">
                    ${e.pgdocfilename}
                    <a
											href="<c:url value='/viewDocument/${e.pgdocfilename}' />"
											class="btn" target="_blank">View</a>
										<a href="<c:url value='/downloadDocument/${e.pgdocfilename}' />"
											class="btn" download="${e.pgdocfilename}">Download</a>
									</c:when>
									<c:otherwise>No file uploaded</c:otherwise>
								</c:choose>
							</span>
						</div>
					</div>

				</div>

				<div class="form-group">
					<h3>Emergency Contact Details</h3>
					<div class="row">
						<div class="form-field">
							<label for="emergencyno">Phone</label> <input type="text"
								name="emergencyno" required value="${e.emergencyno}"
								placeholder="Contact No. of Relatives">
						</div>
						<div class="form-field">
							<label for="relation">Relation</label> <input type="text"
								name="relation" required value="${e.relation}"
								placeholder="Relation">
						</div>
					</div>
				</div>

				<div class="form-group">
					<h3>Bank Details</h3>
					<div class="row">
						<div class="form-field">
							<label for="bankname">Bank Name</label> <input type="text"
								name="bankname" required value="${e.bankname}"
								placeholder="Enter Your Bank Name">
						</div>
						<div class="form-field">
							<label for="bankacno">Bank AC Number</label> <input type="text"
								name="bankacno" required value="${e.bankacno}"
								placeholder="Enter Bank Account Number">
						</div>
					</div>
					<div class="row">
						<div class="form-field">
							<label for="bankifsc">Bank IFSC Code</label> <input type="text"
								name="bankifsc" required value="${e.bankifsc}"
								placeholder="Enter Bank IFSC Code">
						</div>
						<div class="form-field">
							<label for="bankpassfile">Bank Passbook</label> <input
								type="file" name="bankpassfile" required
								placeholder="Bank Passbook Front Page Image"> <span>${e.bankpass != null ? e.bankpass : 'No file uploaded'}</span>
						</div>
					</div>
				</div>

				<div class="form-group">
					<h3>Resume/CV & Profile Picture</h3>
					<div class="row">
						<div class="form-field">
							<label for="resume">Resume</label> <input type="file"
								name="resume" required placeholder="Upload your resume/CV">

							<span style="display: block; margin-top: 10px;"> <c:choose>
									<c:when test="${not empty e.resumefilename}">
									
									${e.resumefilename} &nbsp
										<!-- View Button -->
										<a href="<c:url value='/viewDocument/${e.resumefilename}' />"
											target="_blank" class="btn">View</a>
											&nbsp
										<!-- Download Button -->
										<a
											href="<c:url value='/downloadDocument/${e.resumefilename}' />"
											download="${e.resumefilename}" class="btn">Download</a>
									</c:when>
									<c:otherwise>No file uploaded</c:otherwise>
								</c:choose>
							</span>
						</div>
						<div class="form-field">
							<label for="profilepic">Profile Picture</label> <input
								type="file" name="profilepic" required
								placeholder="Upload your profile picture"> <span
								style="display: block; margin-top: 10px;"> <c:choose>
									<c:when test="${not empty e.profilepicfilename}">
										<!-- Image Preview and View Link -->
										<a
											href="<c:url value='/viewDocument/${e.profilepicfilename}' />"
											target="_blank">View</a>
											&nbsp
										<!-- Download Button -->
										<a
											href="<c:url value='/downloadDocument/${e.profilepicfilename}' />"
											download="${e.resumefilename}">Download</a>
									</c:when>
									<c:otherwise>No file uploaded</c:otherwise>
								</c:choose>
							</span>
						</div>
					</div>
					<p>Accepted file types - [.pdf, .doc, .png, .jpg, .jpeg]. Max
						file size: 300kb</p>
				</div>




				<div class="form-group">
					<h3>Security</h3>
					<div class="row">
						<div class="form-field">
							<label for="emergency-no">Password</label> <input type="text"
								name="password" required value="${e.password}"
								placeholder="Please enter password for your account">
						</div>
						<div class="form-field">
							<label for="relation">Confirm Password</label> <input type="text"
								name="cpassword" required value="${e.cpassword}"
								placeholder="Please enter confirm password for your account">
						</div>
					</div>
				</div>
				
				<div class="form-group">
				<h3>Authorities Only</h3>
				<div class="row">
					<div class="form-field">
						<label for="empstatus">Employee Status</label> <select name="empstatus" required  >
							<option value="" disabled selected>Select employee application status</option>
							<option value="Approved">Approved</option>
							<option value="Rejected">Rejected</option>
							<option value="Incomplete">Incomplete</option>
						</select>
						<span class="error-message" id="genderErrorMessage"></span>
					</div>
					<div class="form-field">
						<label for="relation">Employee ID</label> <input type="text"
							name="employeeID" required 
							placeholder="Enter Employee ID if you approved application">
					</div>
				</div>
			</div>

				<!-- Submit Button -->
				<div class="button">
					<input type="submit" value="Register as Matlfy Employee">
				</div>
			</c:forEach>
		</form>
		<p>
			Already a Matfly Family Member ? <a href="login"
				style="font-weight: 600;">Login Your Account Now</a>
		</p>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script src="Js/script.js"></script>
</body>

</html>