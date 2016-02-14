<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<jsp:include page="template/header_inc.jsp">
    <jsp:param name="title" value="${taskmessage}"/>
</jsp:include>

<div class="panel-body">

    <div class="row">


        <table class="table table-hover">
            <tr>
                <th>Description</th>
                <th>Hours</th>
                <th>Hours Added</th>
                <th>Project Description</th>

            </tr>
            <c:forEach items="${tasks}" var="task">

                <tr>
                    <td>${task.description}</td>
                    <td>${task.hours}</td>
                    <td>${task.hoursAdded}</td>
                    <td>${task.projectDescription}</td>

                </tr>

            </c:forEach>

        </table>


    </div>
</div>

<%@ include file="template/footer_inc.jsp" %>