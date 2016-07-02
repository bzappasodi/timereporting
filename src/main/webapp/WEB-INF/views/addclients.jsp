<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="template/header_inc.jsp">
    <jsp:param name="title" value="${addclientsmsg}"/>
</jsp:include>

<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">

    <form:form  modelAttribute="newClient"  role="form">
        <form:errors path="*" cssClass="alert alert-danger" element="div"/>


        <fieldset>
            <div class="form-group">
                <form:input type="text" path="name"  class="form-control" id="name" placeholder="Name" />
                <form:errors path="name" cssClass="text-danger"/>

            </div>

            <div class="form-group">
                <form:input type="text" path="address" class="form-control" id="address" placeholder="Address" />
                <form:errors path="address" cssClass="text-danger"/>
            </div>

            <button type="submit" class="btn btn-primary btn-lg"><spring:message code="addClient.form.submit.label"/></button>

        </fieldset>
    </form:form>
    </div>
    <div class="col-sm-4"></div>

</div>
<script>
    require(["common"], function () {
        require(['base/trs/errorHandler']);

    });

</script>
<%@ include file="template/footer_inc.jsp" %>