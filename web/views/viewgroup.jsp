<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Groups list</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>

<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Group App</h1>
</div>


    <%
        boolean check = false;


            List<String> names = (List<String>) request.getAttribute("students");


            if ((names != null) && (!names.isEmpty()) && request.getAttribute("groupname") != null) {
                out.println("<div class=\"w3-container w3-center w3-margin-bottom w3-padding\">\n" +
                        "    <div class=\"w3-card-4\">\n" +
                        "        <div class=\"w3-container w3-light-blue\">\n" +
                        "            <h2>Students</h2>\n" +
                        "        </div>");
                out.println("<ul class=\"w3-ul\">");
                for (String s : names) {
                    out.println("<li class=\"w3-hover-sand\">" + s + "</li>");
                }
                out.println("</ul>");

            } else if (request.getAttribute("groupname") !=null) {

            }
    %>
    <%
        if ((names == null) || (names.isEmpty()) || request.getAttribute("groupname") == null) {
            out.println("    <div class=\"w3-card-4\">\n" +
                    "        <div class=\"w3-container w3-center w3-green\">\n" +
                    "            <h2>Please write group name:</h2>\n" +
                    "        </div>\n" +
                    "        <form method=\"post\" class=\"w3-selection w3-light-grey w3-padding\">\n" +
                    "            <label>Group name:\n" +
                    "                <input type=\"text\" name=\"groupname\" class=\"w3-input w3-animate-input w3-border w3-round-large\"\n" +
                    "                       style=\"width: 30%\"><br/>\n" +
                    "            </label>\n" +
                    "\n" +
                    "            <button type=\"submit\" class=\"w3-btn w3-green w3-round-large w3-margin-bottom\">Submit</button>\n" +
                    "        </form>\n");


        }
    %>
</div>
</div>

<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>