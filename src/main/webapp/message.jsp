<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Uploaded</title>
</head>
<body>

<br><br>
<h2>Files Uploaded Successfully</h2>



<br><br>

<h3>upload: Servlet-Stores  in:   </h3>   " E:\ "    (Stores in Drive E:)   
<h3>UploadServlet: Servlet-Stores   in:  </h3> "C:\Users\Facilee Two\eclipse-workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\UploadServletApp\upload " 

<br> <br>

<%


request.getAttribute("message");

%>
${requestScope.message}

</body>
</html>