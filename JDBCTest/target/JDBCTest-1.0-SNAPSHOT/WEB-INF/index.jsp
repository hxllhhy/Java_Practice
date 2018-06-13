<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hehanyue
  Date: 18-5-24
  Time: 下午8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set target="${pageContext.request}"
       property="=characterEncoding" value="UTF-8"/>
<jsp:useBean id="guestbook"
             class="GuestBookTest.GuestBookBean" scope="application"/>
<c:if test="${param.msg != null}" >
    <jsp:useBean id="newMessage" class="GuestBookTest.Message" />
    <jsp:setProperty name="newMessage" property="*" />
    <c:set target="${guestbook}"
           property="message" value="${newMessage}" />
</c:if>
<html>
<head>
    <title>访客留言板</title>
</head>
<body>
    <table style="text-align: left; width: 100%;" border="0"
           cellpadding="2" cellspacing="2" >
        <tbody>
            <c:forEach var="message" items="${guestbook.messages}">
                <tr>
                    <td>${message.name}</td>
                    <td>${message.email}</td>
                    <td>${message.msg}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
