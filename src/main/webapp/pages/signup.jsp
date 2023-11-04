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
			<div class="form-group">
				<h3>Personal Details</h3>
				<div class="row">
					<div class="form-field">
						<label for="first_name">First Name</label> <input type="text"
							name="firstName" required  placeholder="Enter your first name">
					</div>
					<div class="form-field">
						<label for="last_name">Middle Name</label> <input type="text"
							name="middleName" required  placeholder="Enter your middle name">
					</div>
					<div class="form-field">
						<label for="email">Last Name</label> <input type="text"
							name="lastName" required  placeholder="Enter your last name">
					</div>
				</div>
				<div class="row">
					<div class="form-field">
						<label for="dob">Date of Birth</label> <input type="date"
							name="dob"  required placeholder="Select your date of birth">
					</div>
					<div class="form-field">
						<label for="gender">Gender</label> <select name="gender" required  >
							<option value="" disabled selected>Select your gender</option>
							<option value="male">Male</option>
							<option value="female">Female</option>
							<option value="other">Other</option>
						</select>
						<span class="error-message" id="genderErrorMessage"></span>
					</div>
				</div>
			</div>

			<div class="form-group">
				<h3>Contact Details</h3>
				<div class="row">
					<div class="form-field">
						<label for="email">Email</label> <input type="email"
							name="personalEmail" required  placeholder="Enter Personal email ID">
					</div>
					<div class="form-field">
						<label for="mobile">Phone</label> <input type="text"
							name="personalPhone" required  placeholder="Enter Personal Phone number">
					</div>
				</div>
			</div>

			<div class="form-group">
				<h3>Address</h3>
				<div class="row">
					<div class="form-field">
						<label for="address">Current Address</label> <input type="text"
							name="currentAddress" required  placeholder="Enter Current Address">
					</div>
					<div class="form-field">
						<label for="Permanent-address">Permanent Address</label> <input
							type="text" name="permanentAddress" required
							placeholder="Enter Permanent Address"  >
					</div>
				</div>
				<div class="row">
					<div class="form-field">
						<label for="City">City</label> <input type="text"
							name="currentCity" required  placeholder="Enter City">
					</div>
					<div class="form-field">
						<label for="City">City</label> <input type="text"
							name="permanentCity" required  placeholder="Enter City">
					</div>

				</div>
				<div class="row">
					<div class="form-field">
						<label for="State">State</label> <input type="text"
							name="currentState" required  placeholder="Enter State">
					</div>
					<div class="form-field">
						<label for="State">State</label> <input type="text"
							name="permanentState" required  placeholder="Enter State">
					</div>
				</div>
				<div class="row">
					<div class="form-field">
						<label for="Country">Country</label> <input type="text"
							name="currentCountry" required  placeholder="Enter Country">
					</div>
					<div class="form-field">
						<label for="Country">Country</label> <input type="text"
							name="permanentCountry" required  placeholder="Enter Country">
					</div>
				</div>
				<div class="row">
					<div class="form-field">
						<label for="Postal">Postal Code</label> <input type="text"
							name="currentPostal" required  placeholder="Enter Postal Code">
					</div>
					<div class="form-field">
						<label for="Postal">Postal Code</label> <input type="text"
							name="permanentPostal" required  placeholder="Enter Postal Code">
					</div>
				</div>
			</div>

			<!-- Professional Details -->
			<div class="form-group">
				<h3>Work Experience Details (Optional)</h3>
				<div class="row">
					<div class="form-field">
						<label for="company">Company</label> <input type="text"
							name="companyName"   placeholder="Enter your company name">
					</div>
					<div class="form-field">
						<label for="job_title">Job Title</label> <input type="text"
							name="jobTitle"   placeholder="Enter your job title">
					</div>
					<div class="form-field">
						<label for="industry">Department</label> <input type="text"
							name="priveouDepartment"   placeholder="Enter your industry">
					</div>
				</div>
				<div class="row">
					<div class="form-field">
						<label for="join-date">Joining Date</label> <input type="date"
							name="lastjoinDate"   placeholder="Select your joining date">
					</div>
					<div class="form-field">
						<label for="work_experience">Work Experience (years)</label> <input
							type="text" name="workExperience" 
							placeholder="Enter your years of work experience"  >
					</div>
				</div>
			</div>

			<div class="form-group">
				<h3>Job Details</h3>
				<div class="row">
					<div class="form-field">
						<label for="join-date">Joining Date</label> <input type="date"
							name="joinDate" required  placeholder="Select your joining date">
					</div>
					<div class="form-field">
						<label for="department">Department</label> <select
							name="department" required   onsubmit="validateDepartment(this)">
							<option value="" disabled selected>Select department</option>
							<option value="Sales">Sales Team</option>
							<option value="Manager">Operational Department</option>
							<option value="Graphics">Graphics Department</option>
							<option value="Social Media Executive">Social Media
								Team</option>
							<option value="Website Development">Development Team</option>
						</select> <span class="error-message" id="departmentErrorMessage"></span>
					</div>

					<div class="form-field">
						<label for="Designation">Designation</label>
						<select
							name="Designation"  required onsubmit="validateDesignation(this)">
							<option value="" disabled selected>Select designation</option>

							<optgroup label="Operation Team">
								<option value="Head Of Operation">Head Of Operation</option>
								<option value="Social Media Manager">Social Media Manager</option>
								<option value="Team Leader">Team Leader (TL)</option>
							</optgroup>
							<optgroup label="Digital Marketing Team">
								<option value="Sr. Digital Marketing Manager">Sr.
									Digital Marketing Manager</option>
								<option value="Digital Marketing Manager">Digital
									Marketing Manager</option>
								<option value="Digital Marketing Team Leader">Digital
									Marketing Team Leader</option>
								<option value="Sr. Social Media Marketing Executive">Sr.
									Social Media Marketing Executive</option>
								<option value="Jr. Social Media Marketing Executive">Jr.
									Social Media Marketing Executive</option>
								<option value="Social Media Marketing Intern">Social
									Media Marketing Intern</option>
							</optgroup>

							<optgroup label="Sales & Marketing Team">
								<option value="Sales Director">Sales Director</option>
								<option value="Sales Head">Sales Head</option>
								<option value="Marketing & Sales Executive">Marketing &
									Sales Executive</option>
								<option value="Marketing & Sales Executive Intern">Marketing
									& Sales Executive Intern</option>
							</optgroup>

							<optgroup label="Graphics Team">
								<option value="Sr. Graphic /UI,UX Designer">Sr.Graphic
									/UI,UX Designer</option>
								<option value="Jr. Graphic /UI,UX Designer">Jr.Graphic
									/UI,UX Designer</option>
								<option value="Sr. Graphic Designer">Sr.Graphic Designer</option>
								<option value="Jr. Graphic Designer">Jr.Graphic Designer</option>
								<option value="Graphic Designer Intern">Graphic
									Designer Intern</option>
								<option value="Video/Motion Editor">Video/Motion Editor</option>
							</optgroup>

							<optgroup label="Development Team">
								<option value="Full Stack Developer">Full Stack
									Developer</option>
								<option value="Frontend Developer">Frontend Developer</option>
								<option value="Backend Developer">Backend Developer</option>
								<option value="Wordpress Developer">Wordpress Developer</option>
								<option value="Intern Developer">Intern Developer</option>
							</optgroup>
						</select>
						<span class="error-message" id="designationErrorMessage"></span>
					</div>

				
				</div>
				<div class="row">
					<div class="form-field">
						<label for="work-email">Work Email</label> <input type="email"
							name="workEmail"  required placeholder="Enter your work email address">
					</div>
					<div class="form-field">
						<label for="work-email">Phone</label> <input type="text"
							name="workPhone" required  placeholder="Enter Company Provided Number">
					</div>
					<div class="form-field">
						<label for="Location">Location</label> <input type="text"
							name="location" required  placeholder="Enter your work location">
					</div>
				</div>
			</div>

			<div class="form-group" id="personal-docs">
				<h3>Personal Document</h3>
				<div class="row">
					<div class="form-field">
						<label for="Adharcard">Adhar Card Number</label> <input
							type="text" required  name="adharcard" placeholder="Enter Adhar number">
					</div>
					<div class="form-field">
						<label for="PANCard">PAN Card Number</label> <input type="text"
							name="panCard" required  placeholder="Enter PAN number">
					</div>
					<div class="form-field">
						<label for="Passport">Passport Number (Optional)</label> <input type="text"
							name="passport"   placeholder="Enter Passport number">
					</div>
				</div>
				<div class="row">
					<div class="form-field">
						<label for="Ug-docs">Adhar Card</label> <input type="file"
							name="adharcardfile"  required
							placeholder="Upload your Adhar Card Document">

					</div>
					<div class="form-field">
						<label for="Ug-docs">PAN Card</label> <input type="file"
							name="pancardfile"  required
							placeholder="Upload your HSC Markesheet/Certificate">
					</div>
					<div class="form-field">
						<label for="Ug-docs">Passport (Optional)</label> <input type="file"
							name="passportcardfile"  
							placeholder="Upload your HSC Markesheet/Certificate">
					</div>
				</div>
			</div>

			<div class="form-group">
				<h3>Educational Details</h3>
				<div class="row">
					<div class="form-field">
						<h4>10th Details</h4>
						<label for="school_10th">School Name</label> <input type="text"
							name="ssc" required  placeholder="Enter your 10th school name">
					</div>
					<div class="form-field">
						<h4>12th Details</h4>
						<label for="school_12th">High School Name</label> <input type="text"
							name="hsc"   placeholder="Enter your 12th school name">
					</div>
				</div>
				<div class="row">
					<div class="form-field">
						<label for="state_10th">State</label> <input type="text"
							name="sscState" required  placeholder="Enter the state">
					</div>
					<div class="form-field">
						<label for="state_12th">State</label> <input type="text"
							name="hscState"   placeholder="Enter the state">
					</div>
				</div>
				<div class="row">
					<div class="form-field">
						<label for="Ug-docs">10th Document</label> <input type="file"
							name="sscdoc" required  
							placeholder="Upload your SSC Markesheet/Certificate" id="UG-docs">
					</div>
					<div class="form-field">
						<label for="Ug-docs">12th Document</label> <input type="file"
							name="hscdoc"  
							placeholder="Upload your HSC Markesheet/Certificate" id="UG-docs">
					</div>
				</div>
				<div class="row">
					<div class="form-field">
						<h4 class="UG-PG">UG Details</h4>
						<label for="college_ug">College Name</label> <input type="text"
							name="ugname"    placeholder="Enter your college name">
					</div>
					<div class="form-field">
						<h4 class="UG-PG">PG Details</h4>
						<label for="college_pg">College Name</label> <input type="text" 
							name="pgname" placeholder="Enter your college name">
					</div>
				</div>
				<div class="row">
					<div class="form-field">
						<label for="state_ug">State</label> <input type="text"
							name="stateug" placeholder="Enter the state of your college">
					</div>
					<div class="form-field">
						<label for="state_pg">State</label> <input type="text"
							name="statepg"   placeholder="Enter the state of your college">
					</div>
				</div>
				<div class="row">
					<div class="form-field">
						<label for="Ug-docs">UG Document</label> <input type="file"
							name="ugdoc"   placeholder="Upload your UG Certificate"
							id="UG-docs">
					</div>
					<div class="form-field">
						<label for="Ug-docs">PG Document</label> <input type="file"
							name="pgdoc"   placeholder="Upload your PG Certificate"
							id="UG-docs">
					</div>
				</div>
			</div>
			<div class="form-group">
				<h3>Emergency Contact Details</h3>
				<div class="row">
					<div class="form-field">
						<label for="emergencyno">Phone</label> <input type="text"
							name="emergencyno" required  placeholder="Contact No. of Relatives">
					</div>
					<div class="form-field">
						<label for="relation">Relation</label> <input type="text"
							name="relation" required  placeholder="Relation">
					</div>
				</div>
			</div>
			<div class="form-group">
				<h3>Bank Details</h3>
				<div class="row">
					<div class="form-field">
						<label for="emergencyno">Bank Name</label> <input type="text"
							name="bankname"  required placeholder="Enter Your Bank Name">
					</div>
					<div class="form-field">
						<label for="relation">Bank AC Number</label> <input type="text"
							name="bankacno" required  placeholder="Enter Bank Account Number">
					</div>
				</div>
				<div class="row">
					<div class="form-field">
						<label for="emergencyno">Bank IFSC Code</label> <input type="text"
							name="bankifsc" required  placeholder="Enter Bank IFSC Code">
					</div>
					<div class="form-field">
						<label for="relation">Bank Passbook</label> <input type="file"
							name="bankpassfile" required  placeholder="Bank Passbook Front Page Image">
					</div>
				</div>
			</div>
			<div class="form-group">
				<h3>Resume/CV & Profile Picture</h3>
				<div class="row">
					<div class="form-field">
						<label for="resume">Resume</label> <input type="file"
							name="resume"  required 
							placeholder="Upload your resume/CV">

					</div>
					<div class="form-field">
						<label for="profilepic">Profile Picture</label> <input type="file"
							name="profilepic"  required 
							placeholder="Upload your resume/CV">
					</div>
				</div>
				<p>Accepted file types - [ .pdf, .doc, .png .jpg .jpeg ]. Max
					file size: 300kb</p>
			</div>

			<div class="form-group">
				<h3>Security</h3>
				<div class="row">
					<div class="form-field">
						<label for="emergency-no">Password</label> <input type="text"
							name="password"  required
							placeholder="Please enter password for your account">
					</div>
					<div class="form-field">
						<label for="relation">Confirm Password</label> <input type="text"
							name="cpassword" required 
							placeholder="Please enter confirm password for your account">
					</div>
				</div>
			</div>

			<!-- Submit Button -->
			<div class="button">
				<input type="submit" value="Register as Matlfy Employee">
			</div>
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