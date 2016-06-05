<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="template/header_inc.jsp">
    <jsp:param name="title" value="Time reporting task list"/>
</jsp:include>

<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">


        <form:form modelAttribute="newTask" role="form">

            <form:errors path="*" cssClass="alert alert-danger" element="div"/>

            <fieldset>
                <div class="form-group">
                    <input type="HIDDEN" name="projectId" value="${projectId}"/>
                </div>

                <div class="form-group">


                    <form:input type="text" path="description"  class="form-control" id="description" placeholder="description" />
                    <form:errors path="description" cssClass="text-danger"/>
                </div>

                <div class="form-group">
                    <%--<input type="text" name="hoursAdded" class="form-control" id="hours-added"--%>
                           <%--placeholder="hours added">--%>
                    <form:input type="text" path="hoursAdded" class="form-control" id="hoursAdded" placeholder="hours added"/>
                    <form:errors path="hoursAdded" cssClass="text-danger"/>
                </div>

                <div class="form-group">
                    <form:input type="hours" path="hoursAdded" class="form-control" id="hours" placeholder="hours"/>
                    <form:errors path="hours" cssClass="text-danger"/>
                    <%--<input type="text" name="hours" class="form-control" id="hours" placeholder="Hours">--%>
                </div>

                <button type="submit" class="btn btn-primary btn-lg">Submit</button>

            </fieldset>
        </form:form>


        <div class="col-sm-4"></div>

    </div>
</div>


<%@ include file="template/footer_inc.jsp" %>