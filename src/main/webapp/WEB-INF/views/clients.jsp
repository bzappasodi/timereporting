<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="template/header_inc.jsp">
  <jsp:param name="title" value="Time reporting client list"/>
</jsp:include>

<div class="panel-body">

    <div class="row">
        <c:forEach items="${clients}" var="client">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">

                <div class="caption">
                    <p>${client.name}

                    ${client.address}</p>

            </div>
            </div>
        </c:forEach>
    </div>

</div>
<%@ include file="template/footer_inc.jsp" %>