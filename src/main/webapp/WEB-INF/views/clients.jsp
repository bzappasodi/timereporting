<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="template/header_inc.jsp">
    <jsp:param name="title" value="Time reporting client list"/>
</jsp:include>

<div class="panel-body">


    <c:forEach items="${clients}" var="client">
        <div class="row">
            <div class="col-sm-6 col-md-3">

                <div class="caption">
                    <p>${client.name}

                            ${client.address}</p>

                </div>
            </div>
        </div>
    </c:forEach>


</div>
<%@ include file="template/footer_inc.jsp" %>