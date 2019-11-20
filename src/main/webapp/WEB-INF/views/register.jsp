<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp"
	crossorigin="anonymous">
<link href="styles.css" rel="stylesheet">
</head>
<body>
	<div class="jumbotron">
		<h1>Please fill in the form to Register</h1>
		<fieldset>
			<form action="/summary" name="myForm" method="post"
				onsubmit="return validatePass() && validateEmail()">
				First Name: <input type="text" name="firstName" required><br>
				Last Name: <input type="text" name="lastName" required><br>
				<div class="form-group row">
					<div class="col-10">
						Birthday (optional): <input class="form-control" type="date"
							value="yyyy-mm-dd" id="date" name="birthday">
					</div>
				</div>
				Email: <input type="text" name="email" id="email" required><br>
				Phone Number: <input type="tel" id="phone" name="phoneNumber" pattern="[0-9]{3}[0-9]{3}[0-9]{4}" required><br>
				Password: <input type="password" value="" id="myInput" required name="password"><br>
				<div class="form-check">
					<label class="form-check-label"> <input
						class="form-check-input" type="checkbox" onclick="showAndHide()">Show
						Password
					</label>
				</div>
				Re-enter Password: <input type="password" value="" id="myInput1"
					required><br>
				<div class="form-group">
					<select required class="custom-select" id="dropdown" name="branch">
						<option value="">Select your local branch</option>
						<option value="Detroit">Detroit</option>
						<option value="Holland">Holland</option>
						<option value="Saugatuck">Saugatuck</option>
					</select>
				</div>
				<div class="form-check">
					<label class="form-check-label"> <input
						class="form-check-input" type="checkbox" name="newsletter" value=true>check here if you
						want to receive our weekly newsletter
					</label>
				</div>
				<input class="btn-primary" type="submit" value="Submit"><br>
			</form>
		</fieldset>
	</div>
	<script>
		function showAndHide() {
			var x = document.getElementById("myInput");
			if (x.type === "password") {
				x.type = "text";
			} else {
				x.type = "password";
			}
		}
		function validateEmail() {
			var email = document.getElementById("email").value;
			console.log(email);
			var emailReg = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
			if (email.match(emailReg)) {
				return true;
			} else {
				alert("You have entered an invalid email address!");
				return false;
			}
		}

		function validatePass() {

			var pass1 = document.getElementById("myInput").value;
			var pass2 = document.getElementById("myInput1").value;
			if(pass1 === pass2){
				return true;
			} else {
				alert("Your passwords do not match!");
				return false;
			}
			
		}
	</script>
</body>
</body>
</html>