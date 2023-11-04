<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" href="css/salaryslip.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/2.5.1/jspdf.umd.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css"
	integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/html2canvas/1.4.1/html2canvas.min.js"
	integrity="sha512-BNaRQnYJYiPSqHHDb58B0yaPfCu+Wgds8Gp/gU33kqBtgNS4tSPHuGibyoeqMV/TJlSKda6FXzoEyYGjTe+vXA=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>

</head>

<body>
	<div class="slip-container">
		<div class="slip-box">
			<div class="slip-header">
				<div class="left-h-slip">
					<h3>Matfly Digital Marketing</h3>
					<p>
						Office No. 235, Xion Mall,<br> Hinjewadi Phase 1, 411057.
					</p>

				</div>
				<div class="center-h-slip">
					<img src="images/Matfly Digital logo.png" alt="">
				</div>
				<div class="right-h-slip">
					<p>Payslip For The Month</p>
					<h4>${salary.month}${salary.year}</h4>
					<p style="color: black; font-weight: 500;">GST Number:
						27ABWFM1978N1Z4</p>
				</div>
			</div>
			<div class="hr-line"></div>
			<div class="slip-emp-info">
				<div class="employeeinfo">
					<p>Employee Summary</p>
					<div class="name-container">
						<p>Employee Name</p>
						<div class="colon">:</div>
						<h4>${perday.employeename}</h4>
					</div>
					<div class="empid-conainer">
						<p>Employee ID</p>
						<div class="colon">:</div>
						<h4>${perday.empid}</h4>
					</div>
					<div class="payperiod">
						<p>Payment Period</p>
						<div class="colon">:</div>
						<h4>${salary.month}${salary.year}</h4>
					</div>
					<div class="paydate">
						<p>Payment Date</p>
						<div class="colon">:</div>
						<h4>Oct 2023</h4>
					</div>

				</div>
				<div class="salary-highlight">
					<div class="salary">
						<div class="salary-amount">
							<h2>
								<i class="fa-solid fa-indian-rupee-sign"></i> <span
									id="totalearning"></span>
							</h2>
							<p>Employee Net Pay</p>
						</div>
						<div class="hr"></div>

						<div class="salary-days">
							<div class="paiddays">
								<p>Paid Days</p>
								<div class="colon">:</div>
								<h4 id="totalp">${salary.totalpresentdays}</h4>
							</div>
							<div class="extradays">
								<p>Leaves</p>
								<div class="colon">:</div>
								<h4>${salary.totalabsentdays}</h4>
							</div>
							<div class="halfday">
								<p>Half Days</p>
								<div class="colon">:</div>
								<h4>${salary.totalhalfdays}</h4>
							</div>
						</div>
					</div>
				</div>

			</div>
			<div class="earning-details-cont">
				<div class="left-earnign-cont">
					<div class="left-earning-header">
						<h5>Earnings</h5>
						<h5>Amount</h5>
					</div>
					<div class="hr"></div>
					<div class="left-earning-body">
						<div class="left-first-body">
							<p>Basic</p>
							<h4 style="display: none;" id="perday">${perday.perday}</h4>
							<var style="display: none;" id="totalbasicpay"></var>
							<h5>
								<i class="fa-solid fa-indian-rupee-sign"
									style="font-size: 10px;"></i> <span id="basicPayAmount"></span>
							</h5>
						</div>
						<div class="left-second-body">
							<p>Other Allownce</p>
							<h5>
								<i class="fa-solid fa-indian-rupee-sign"
									style="font-size: 10px;"></i> 00
							</h5>
						</div>
					</div>
					<div class="left-earning-total">
						<div class="left-total-body">
							<h4>Gross Earnings</h4>

							<h5>
								<i class="fa-solid fa-indian-rupee-sign"
									style="font-size: 10px;"></i> <span id="grossamount"></span>
							</h5>
						</div>
					</div>
				</div>
				<div class="right-earnign-cont">
					<div class="right-earning-header">
						<h5>Deductions</h5>
						<h5>Amount</h5>
					</div>
					<div class="hr"></div>
					<div class="right-earning-body">
						<div class="right-first-body">
							<p>Professional Tax</p>
							<h5 id="ptax">
								<i class="fa-solid fa-indian-rupee-sign"
									style="font-size: 10px;"></i> 200
							</h5>
						</div>
						<div class="right-second-body">
							<p>Provident Fund</p>
							<h5>
								<i class="fa-solid fa-indian-rupee-sign"
									style="font-size: 10px;"></i> 00
							</h5>
						</div>
					</div>
					<div class="right-earning-total">
						<div class="right-total-body">
							<h4>Total Deductions</h4>
							<h5>
								<i class="fa-solid fa-indian-rupee-sign"
									style="font-size: 10px;"></i> 200
							</h5>
						</div>
					</div>
				</div>
			</div>
			<div class="total-net-payble">
				<div class="left-total-net">
					<p>Total Net Payable</p>
					<p style="color: gray;">Gross Earnign- Total Deductions</p>
				</div>
				<div class="right-total-net">
					<h3>
						<i class="fa-solid fa-indian-rupee-sign"></i> <span
							id="finalamount"></span>
					</h3>
				</div>
			</div>
			<p style="font-size: 11px !important; margin-top: 10px;">-- This
				is system generated payslip, hence signature is not required</p>
			<button id="downloadBtn">Download</button>

		</div>
	</div>

	<script>
        document.querySelector('#downloadBtn').addEventListener('click', function () {
            let slip = document.querySelector('.slip-box');
            let downloadBtn = document.getElementById('downloadBtn');
    
            // Hide the download button
            downloadBtn.style.display = 'none';
    
            // Reduce the scale for smaller PDF size (adjust as needed)
            let scale = 1.5;
    
            html2canvas(slip, { scale: scale }).then(canvas => {
                setTimeout(() => {
                    // Using JPEG for smaller file size
                    let imgData = canvas.toDataURL('image/jpeg', 1); // Adjust the compression quality (0.7 is a good starting point)
    
                    let pdf = new jspdf.jsPDF({
                        orientation: 'portrait',
                        unit: 'mm',
                        format: 'a4'
                    });
    
                    let imgProps = pdf.getImageProperties(imgData);
                    let pdfWidth = pdf.internal.pageSize.getWidth();
                    let pdfHeight = (imgProps.height * pdfWidth) / imgProps.width;
    
                    pdf.addImage(imgData, 'JPEG', 0, 0, pdfWidth, pdfHeight);
                    pdf.save('payslip.pdf');
    
                    // Show the download button again
                    downloadBtn.style.display = 'block';
                }, 100);
            });
        });
    </script>

	<script>
    var totalp = document.getElementById("totalp").textContent;
    var perday = document.getElementById("perday").textContent;
    var totalearning = document.getElementById("totalearning").textContent;
    var tax = document.getElementById("ptax").textContent;
    var totalbasicpay = totalp * perday;
    document.getElementById("totalbasicpay").textContent = totalbasicpay;
    document.getElementById("basicPayAmount").textContent = totalbasicpay;
    document.getElementById("grossamount").textContent = totalbasicpay;
    var grossamount = document.getElementById("grossamount").textContent;
    var finalamount=grossamount-tax;
    document.getElementById("totalearning").textContent= finalamount;
    document.getElementById("finalamount").textContent= finalamount;
    
    </script>

</body>

</html>