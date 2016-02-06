<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="template/header_inc.jsp">
    <jsp:param name="title" value="${addclientsmsg}"/>
</jsp:include>

<div class="panel-body">
    <c:if test="${not empty error}">
        <div class="alert alert-danger">
            <spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br/>
        </div>
    </c:if>
    <form action="addclient" method="post" role="form">
        <fieldset>
            <div class="form-group">
                <input type="text" name="Name" class="form-control" id="inputname" placeholder="Name">
            </div>

            <div class="form-group">
                <input type="text" name="Address" class="form-control" id="inputaddress" placeholder="Address">
            </div>

            <button type="submit" class="btn btn-primary btn-lg">Submit</button>

        </fieldset>
    </form>


</div>
<%@ include file="template/footer_inc.jsp" %>