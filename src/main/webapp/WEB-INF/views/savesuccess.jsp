<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="template/header_inc.jsp">

    <jsp:param name="title" value="Time reporting user registration success"/>
</jsp:include>

<div class="panel-body">
    <h2>${success}</h2>

</div>
<%@ include file="template/footer_inc.jsp" %>