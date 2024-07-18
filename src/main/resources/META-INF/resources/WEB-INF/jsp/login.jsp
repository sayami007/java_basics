<html>
<head>
    <title>My first JSP Page</title>
</head>
<body>
<h1>Login Form</h1>
<pre>${errorMessage}</pre>
<form method="post">
    <div>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name">
    </div>
    <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password">
    </div>
    <div>
        <input type="submit">
    </div>
</form>
</body>
</html>