<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="template/header_inc.jsp">
    <jsp:param name="title" value="Add a task!"/>
</jsp:include>

<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">


        <form:form modelAttribute="newTask" role="form">

            <form:errors path="*" cssClass="alert alert-danger" element="div"/>

            <fieldset>
                <div class="form-group">

                    <form:input type="hidden" path="projectId" value="${projectId}" class="form-control"
                                id="projectId"/>

                </div>

                <div class="form-group">

                    <form:input type="text" path="description" class="form-control" id="description"
                                placeholder="Description"/>
                    <form:errors path="description" cssClass="text-danger"/>
                </div>

                <div class="form-group">

                    <form:input type="text" path="hoursAdded" class="form-control" id="hoursAdded"
                                placeholder="Hours Added"/>
                    <form:errors path="hoursAdded" cssClass="text-danger"/>
                </div>

                <div class="form-group">
                    <form:input type="hours" path="hours" class="form-control" id="hours" placeholder="Hours"/>
                    <form:errors path="hours" cssClass="text-danger"/>
                </div>

                <button type="submit" class="btn btn-primary btn-lg">Submit</button>

            </fieldset>
        </form:form>
        <div class="col-sm-4"></div>
    </div>
</div>

<script>
    require(["common"], function () {
        require(['base/trs/errorHandler']);
    });
</script>

<%@ include file="template/footer_inc.jsp" %>