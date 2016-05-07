<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="template/header_inc.jsp">
    <jsp:param name="title" value="${addprojectmessage}"/>
</jsp:include>

<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">
        <c:if test="${not empty error}">
            <div class="alert alert-danger">

                <spring:message code="AbstractUserDetailsAuthenticationProvider.badCredentials"/><br/>
            </div>
        </c:if>

        <form:form modelAttribute="newProject" role="form">
            <form:errors path="*" cssClass="alert alert-danger" element="div"/>


        <fieldset>
                <div class="form-group">


                    <form:select path="clientId">
                        <form:options items="${clients}" />
                    </form:select>


                    <select name="clientId" class="form-control" id="sel1">
                        <option>Select client</option>
                        <c:forEach items="${clients}" var="client">
                            <option value="${client.clientId}">${client.name}</option>
                        </c:forEach>
                    </select>
                </div>
            <div class="form-group">
                    <form:input type="text" path="description" class="form-control" id="description"  placeholder="Description"/>
                    <form:errors path="description" cssClass="text-danger"/>
            </div>

            <div class="form-group">
                <input type="text" name="dueDate" class="form-control" id="DUE_DATE" placeholder="Due Date">
            </div>

            <div class="form-group">

                    <form:input type="text" path="hours" class="form-control" id="hours" placeholder="Hours"/>
                    <form:errors path="hours" cssClass="text-danger"/>
            </div>

            <div class="form-group">
                <input type="text" name="startDate" class="form-control" id="START_DATE" placeholder="Start Date">
            </div>

                <div class="form-group">

                    <label for="invoiceSent">Invoice Sent?</label>
                    <label class="radio-inline"><input type="radio" id="invoiceSent" value="yes"
                                                       name="invoiceSent">yes</label>
                    <label class="radio-inline"><input type="radio" id="invoiceSent" value="no"
                                                       name="invoiceSent">no</label>

                </div>

                <button type="submit" class="btn btn-primary btn-lg">Submit</button>

            </fieldset>
        </form:form>
    </div>
    <div class="col-sm-4"></div>

</div>

<script>
    require(["common"], function (common) {
        require(['base/trs/renderCalendar']);

    });

</script>
<%@ include file="template/footer_inc.jsp" %>
