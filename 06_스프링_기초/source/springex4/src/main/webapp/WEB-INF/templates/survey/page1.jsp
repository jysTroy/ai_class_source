<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
${commonValue}
<c:url var="action" value="/survey/page2" />
<form:form action="${action}" modelAttribute="requestSurvey">
    문항 1. <form:input path="q1" /><br>
    문항 2. <form:input path="q2" /><br>
    문항 3. <form:input path="q3" /><br>
    <button type='submit'>다음 페이지</button>
</form:form>