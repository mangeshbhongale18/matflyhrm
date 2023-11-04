<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Task Table</title>
   
</head>

<body>

    <div>
        <ul>
            <c:forEach items="${attendancelist}" var="atn">
                 <ul>
                    <li class="holidaydate">${atn.date}</li>
                    <li class="holidayreason">${atn.intime}</li>
                </ul>
                
            </c:forEach>
        </ul>
    </div>

</body>

</html>
