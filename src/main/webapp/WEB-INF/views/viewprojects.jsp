<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="template/header_inc.jsp">
    <jsp:param name="title" value="${addprojectmessage}"/>
</jsp:include>


    <div class="row">
        <table class="table table-hover">
            <thead>

            <tr>
                <th>Name</th>
                <th>Description</th>
                <th>Hours</th>
                <th>Invoice sent?</th>
                <th>Add Tasks</th>
            </tr>


            </thead>

            <tbody>
            <c:forEach items="${projects}" var="project">

                <tr>
                    <td>${project.name}</td>
                    <td>${project.description}</td>
                    <td>${project.hours}</td>
                    <td>${project.invoiceSent}</td>
                    <td><a href="/task?projectId=${project.projectId}">Add Task</a></td>
                </tr>

            </c:forEach>
            </tbody>
        </table>

    </div>

<%@ include file="template/footer_inc.jsp" %>