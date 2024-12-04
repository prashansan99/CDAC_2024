<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
    <h2>Calculator</h2>
    <form action="calculate.jsp" method="post">
        <label>Number 1:</label>
        <input type="text" name="number1" required><br><br>

        <label>Number 2:</label>
        <input type="text" name="number2" required><br><br>

        <label>Operation:</label>
        <select name="operation" required>
            <option value="add">Addition</option>
            <option value="subtract">Subtraction</option>
            <option value="multiply">Multiplication</option>
            <option value="divide">Division</option>
        </select><br><br>

        <button type="submit">Calculate</button>
    </form>
</body>
</html>
