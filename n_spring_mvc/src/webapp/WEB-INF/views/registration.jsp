<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <!--Enable EL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- use JSTL-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8f9fa;
            padding-top: 50px;
        }
        .form-container {
            max-width: 500px;
            margin: auto;
            background: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
    </style>
</head>
<body>

    <div class="text-center mb-4">
        <h1>${country}</h1>
        <h2 class="h5 text-muted">${university}</h2>
        <h2 class="h5 text-muted">Registration Form</h2>
    </div>

    <div class="form-container">
        <form action="submit" method="post">

        <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Name</label>
                        <input type="text"
                        class="form-control"
                        id="name"
                        name="name" required>
        </div>

            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Email</label>
                <input type="email"
                 class="form-control"
                 id="email"
                 name="email" required>
            </div>

            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Password</label>
                <input type="password"
                class="form-control"
                id="password"
                name="password" required>
            </div>




            <button type="submit" class="btn btn-primary w-100">Submit</button>
        </form>
    </div>

</body>
</html>
