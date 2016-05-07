<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="template/header_inc.jsp">
    <jsp:param name="title" value="${greeting}"/>
</jsp:include>

<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">
        <c:if test="${not empty error}">
            <div class="alert alert-danger">
                Error
                    <%-- <spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br/>--%>
            </div>
        </c:if>
        <form action="<c:url value= "/j_spring_security_check"></c:url>" method="post">
            <fieldset>
                <div class="form-group">
                    <input class="form-control" placeholder="User Name" name='j_username' type="text">
                </div>
                <div class="form-group">
                    <input class="form-control" placeholder="Password" name='j_password' type="password" value="">
                </div>
                <input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
            </fieldset>
        </form>
    </div>

    <div class="col-sm-4"></div>

</div>
<%@ include file="template/footer_inc.jsp" %>