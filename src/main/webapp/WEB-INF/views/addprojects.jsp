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

        <form:form modelAttribute="project" role="form">
            <form:errors path="*" cssClass="alert alert-danger" element="div"/>


            <fieldset>
                <div class="form-group">


                    <%--<form:select path="clientId" multiple="true">--%>
                        <%--<form:options items="${clients}"/>--%>
                    <%--</form:select>--%>


                    <form:select path="clientId">
                        <form:option value="" label="Please Select"/>
                        <form:options items="${clients}" itemValue="clientId" itemLabel="name"/>
                    </form:select>

                    <form:errors path="clientId" cssClass="text-danger"/>


                        <%--<select name="clientId" class="form-control" id="sel1">--%>
                        <%--<option>Select client</option>--%>
                        <%--<c:forEach items="${clients}" var="client">--%>
                        <%--<option value="${client.clientId}">${client.name}</option>--%>
                        <%--</c:forEach>--%>
                        <%--</select>--%>
                </div>
                <div class="form-group">
                    <form:input type="text" path="description" class="form-control" id="description"
                                placeholder="Description"/>
                    <form:errors path="description" cssClass="text-danger"/>
                </div>

                <div class="form-group">

                    <form:input type="text" path="dueDate" class="form-control" id="DUE_DATE" placeholder="Due Date"/>
                    <form:errors path="dueDate" cssClass="text-danger"/>
                </div>

                <div class="form-group">

                    <form:input type="text" path="hours" class="form-control" id="hours" placeholder="Hours"/>
                    <form:errors path="hours" cssClass="text-danger"/>
                </div>

                <div class="form-group">

                    <form:input type="text" path="startDate" class="form-control" id="START_DATE"
                                placeholder="Start Date"/>
                    <form:errors path="startDate" cssClass="text-danger"/>

                </div>

                <div class="form-group">

                    <label for="invoiceSent">Invoice Sent?</label>
                    <label class="radio-inline">
                        <form:radiobutton path="invoiceSent" id="invoiceSent" value="yes"/>Yes
                    </label>
                    <label class="radio-inline">
                        <form:radiobutton path="invoiceSent" id="invoiceSent" value="no"/>No
                    </label>

                </div>

                <button type="submit" class="btn btn-primary btn-lg">Submit</button>

            </fieldset>
        </form:form>
    </div>
    <div class="col-sm-4"></div>

</div>

<script>
    require(["common"], function () {
        require(['base/trs/renderCalendar']);

    });

</script>
<%@ include file="template/footer_inc.jsp" %>
