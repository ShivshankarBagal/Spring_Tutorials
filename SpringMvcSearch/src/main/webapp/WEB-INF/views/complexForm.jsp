<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Registration Form</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<h2>Student Registration Form</h2>
		<form action="submitForm" method="Post">
			<div class="form-group">
				<label for="name">Name:</label> <input type="text"
					class="form-control" id="name" name="name"
					placeholder="Enter your name" required>
			</div>
			<div class="form-group">
				<label for="id">ID:</label> <input type="text" class="form-control"
					id="id" name="id" placeholder="Enter your ID" required>
			</div>
			<div class="form-group">
				<label for="dob">Date of Birth:</label> <input type="text"
					class="form-control" id="dob" name="dob" placeholder="dd/MM/yyyy"
					required>
			</div>
			<div class="form-group">
				<label>Select Courses:</label>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="Java"
						id="java" name="courses"> <label class="form-check-label"
						for="java"> Java </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="C#"
						id="csharp" name="courses"> <label
						class="form-check-label" for="csharp"> C# </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="Python"
						id="python" name="courses"> <label
						class="form-check-label" for="python"> Python </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="React.js"
						id="react" name="courses"> <label class="form-check-label"
						for="react"> React.js </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value="C++"
						id="cpp" name="courses"> <label class="form-check-label"
						for="cpp"> C++ </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox"
						value="Web Development" id="webdev" name="courses"> <label
						class="form-check-label" for="webdev"> Web Development </label>
				</div>
			</div>
			<div class="form-group">
				<label>Gender:</label>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gender"
						id="male" value="Male" required> <label
						class="form-check-label" for="male"> Male </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="gender"
						id="female" value="Female" required> <label
						class="form-check-label" for="female"> Female </label>
				</div>

				<div class="card-body" style="border: 1px solid black;">
					<label> Address </label>
					<div class="form-group">
						<input name="address.street" type="text" class="form-control"
							placeholder="Enter Street">

					</div>
					<div>
						<input name="address.city" type="text" class="form-control"
							placeholder="Enter city">

					</div>
				</div>
			</div>
			<div class="form-group">
				<label for="type">Select Type:</label> <select class="form-control"
					id="type" name="studentType" required>
					<option value="">Select...</option>
					<option value="Old Student">Old Student</option>
					<option value="New Student">New Student</option>
				</select>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
