<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Login</title>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <style>
            /* Optional: Add some custom spacing */
            body {
                padding-top: 40px;
                padding-bottom: 40px;
                background-color: #f5f5f5; /* Light gray background */
            }
            .login-form {
                max-width: 330px;
                padding: 15px;
                margin: auto;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <form method="post" class="login-form">
                <h1 class="text-center mb-4">Login</h1>

                <c:if test="${not empty ErrorMessage}">
                    <div class="alert alert-danger" role="alert">
                        ${ErrorMessage}
                    </div>
                </c:if>

                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="username" name="username" placeholder="Username" required autofocus>
                    <label for="username">Username</label>
                </div>

                <div class="form-floating mb-3">
                    <input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
                    <label for="password">Password</label>
                </div>

                <button class="w-100 btn btn-lg btn-primary" type="submit">Login</button>
            </form>
        </div>

        <script src="webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script> <%-- Use bundle for Popper --%>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>
