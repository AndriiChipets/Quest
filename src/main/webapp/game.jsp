<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quest</title>
    <link rel="stylesheet" href="/css/styles.css" type="text/css">
    <script type="text/javascript" src="/script/scripts.js"></script>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="lang" value='<%=session.getAttribute("lang")%>'/>
    <c:set var="question" value='<%=session.getAttribute("question")%>'/>
    <c:set var="nextQuestions" value='<%=session.getAttribute("nextQuestions")%>'/>
</head>
<body class="game-body">
<div class="question-box">
    <p>${question.getTitle()}</p>
    <c:if test='${!nextQuestions.isEmpty()}'>
        <form method="GET">
            <label>
                <input type="radio" name="answer" value='${nextQuestions.get(0).getValue()}' checked>
                    ${nextQuestions.get(0).getText()}
            </label>
            <br>
            <br>
            <label>
                <input type="radio" name="answer" value='${nextQuestions.get(1).getValue()}'>
                    ${nextQuestions.get(1).getText()}
            </label>
            <br>
            <br>
            <br>
            <br>
            <label>
                <button type="submit" class="submit-button">Next</button>
            </label>
        </form>
    </c:if>
</div>
<c:if test='${nextQuestions.isEmpty()}'>
    <div class="restart-container">
        <button onclick="redirectToWelcome()">Restart</button>
    </div>
</c:if>

</body>
</html>
