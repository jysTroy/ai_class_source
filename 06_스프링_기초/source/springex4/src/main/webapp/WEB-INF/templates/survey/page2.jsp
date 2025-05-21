<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url var="action" value="/survey/page3" />
<form:form action="${action}" modelAttribute="requestSurvey">
    <form:hidden path="q1" />
    <form:hidden path="q2" />
    <form:hidden path="q3" />
    문항 4. <form:input path="q4" /><br>
    문항 5. <form:input path="q5" /><br>
    문항 6. <form:input path="q6" /><br>
    <button type='submit'>다음 페이지</button>
</form:form>