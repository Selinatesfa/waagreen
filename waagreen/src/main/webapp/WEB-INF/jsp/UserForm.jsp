<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Add User Form</title>
<style type="text/css">
@import url(resources/css/main.css);
</style>
</head>
<body>

	<div id="global">
		<form:form modelAttribute="user" method="post">
			<fieldset>
				<legend>Add a User</legend>
				<p>
					<label for="email">email: </label>
					<form:input id="email" path="email" />
				</p>
				<p>
					<label for="password">Password: </label>
					<form:password id="password" path="password" />
				</p>
				<p>
					<label for="active">Active: </label>
					<form:password id="active" path="active" />
				</p>
				<p>
					<label for="roles">Roles </label>
					<form:select id="roles" path="roles" size="5" multiple="true"
						items="${roles}" itemValue="id" itemLabel="role" />
				</p>
				<p id="buttons">
					<input id="submit" type="submit" value="Add a User">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>
