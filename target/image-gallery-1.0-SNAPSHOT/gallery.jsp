<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Image Gallery</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
<header>
    <h1>Image Gallery</h1>
    <p>Displayed from a Java servlet and rendered as a WAR web app.</p>
</header>
<div class="gallery">
    <%
        List<String> images = (List<String>) request.getAttribute("images");
        if (images != null) {
            for (String image : images) {
    %>
    <article class="card">
        <img src="images/<%= image %>" alt="<%= image %>">
        <h2><%= image.replace(".svg", "") %></h2>
    </article>
    <%
            }
        }
    %>
</div>
<footer>
    <a class="button" href="index.jsp">Back to Home</a>
</footer>
</body>
</html>
