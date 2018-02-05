<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
  <head>
	  <title>Login Page - Model 1 / No Controller</title>
	</head>
	<body>
  <h3>Model 1 / No Controller Login Form</h3>
  <c:if test="${not empty requestScope.failed}">
    <b>Login Failed. Please Try Again.</b>
  </c:if>
    <form method="post" action="main.jsp" name="LoginForm">
	    <P>
	      Username:
		  <input name="username" size="15" maxlength="100">
	    </P>
	    <P>
	      Password: 
		  <input type="password" name="password" size="15" maxlength="100">
      </P>
      <P>
		  <input type="submit" value="login">
      <input type="hidden" name="_loginpage" value="yes">
	    </P>
	  </form>
  </body>
</html>