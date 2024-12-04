<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<jsp:useBean id="testBean" class="com.cdac.beans.TestBean" scope="request"/>
<jsp:setProperty property="*" name="testBean"/>

<!DOCTYPE html>
<html>
<head>
    <title>Calculation Result</title>
</head>
<body>
    <h2>Calculation Result</h2>
    <c:choose>
        <c:when test="${testBean.operation == 'add'}">
            <p>Result of Addition: ${testBean.number1 + testBean.number2}</p>
        </c:when>
        <c:when test="${testBean.operation == 'subtract'}">
            <p>Result of Subtraction: ${testBean.number1 - testBean.number2}</p>
        </c:when>
        <c:when test="${testBean.operation == 'multiply'}">
            <p>Result of Multiplication: ${testBean.number1 * testBean.number2}</p>
        </c:when>
        <c:when test="${testBean.operation == 'divide'}">
            <c:choose>
                <c:when test="${testBean.number2 != 0}">
                    <p>Result of Division: ${testBean.number1 / testBean.number2}</p>
                </c:when>
                <c:otherwise>
                    <p style="color: red;">Error: Division by zero is not allowed.</p>
                </c:otherwise>
            </c:choose>
        </c:when>
        <c:otherwise>
            <p style="color: red;">Error: Invalid operation specified.</p>
        </c:otherwise>
    </c:choose>
    <a href="calculator.jsp">Go Back</a>
</body>
</html>
