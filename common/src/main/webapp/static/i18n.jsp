<%--
  Created by IntelliJ IDEA.
  User: 87124
  Date: 2020/8/6
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>测试国际化</title>
    <script src="./plugins/jquery-3.4.1.min.js"></script>
    <script src="./js/i18n.js"></script>
</head>
<body>
<fieldset>
    <legend><spring:message code="test"></spring:message></legend>
    <p>
        <spring:message code="welcome"></spring:message>
    </p>
    <input placeholder="<spring:message code="welcome"></spring:message>">
    <a href="/language?l=en_US">English</a>
    <a href="/language?l=zh_CN">Chinese</a>
<%--    <p>--%>
<%--        <button id="changeLocale">--%>
<%--            <spring:message code="changeLanguage"></spring:message>--%>
<%--        </button>--%>
<%--    </p>--%>
</fieldset>
</body>
</html>
