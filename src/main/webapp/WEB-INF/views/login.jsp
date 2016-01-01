<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="template/header_inc.jsp">
    <jsp:param name="title" value="Time reporting user registration"/>
</jsp:include>

<div class="panel-body">
    <c:if test="${not empty error}">
        <div class="alert alert-danger">
            <spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br/>
        </div>
    </c:if>
    <form action="users" method="post" role="form">
        <fieldset>
            <div class="form-group">
                <input type="text" name="firstName" class="form-control" id="inputfirstname" placeholder="First Name">
            </div>

            <div class="form-group">
                <input type="text" name="lastName" class="form-control" id="inputlasttname" placeholder="Last Name">
            </div>

            <div class="form-group">
                <input type="text" name="userName" class="form-control" id="inputusername" placeholder="User Name">
            </div>

            <div class="form-group">
                <input type="password" name="passWord" class="form-control" id="inputpassword" placeholder="Password">
            </div>

            <button type="submit" class="btn btn-primary btn-lg">Submit</button>

        </fieldset>
    </form>


</div>
<%@ include file="template/footer_inc.jsp" %>