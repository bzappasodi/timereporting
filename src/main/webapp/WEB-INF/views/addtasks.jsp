<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="template/header_inc.jsp">
    <jsp:param name="title" value="Time reporting task list"/>
</jsp:include>

<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">


            <form action="/addtask" method="post" role="form">
                <fieldset>
                    <div class="form-group">
                        <input type="HIDDEN" name="projectId" value="${projectId}"/>
                    </div>

                    <div class="form-group">
                        <input type="text" name="description" class="form-control" id="description"
                               placeholder="Description">
                    </div>

                    <div class="form-group">
                        <input type="text" name="hoursAdded" class="form-control" id="hours-added"
                               placeholder="hours added">
                    </div>

                    <div class="form-group">
                        <input type="text" name="hours" class="form-control" id="hours" placeholder="Hours">
                    </div>

                    <button type="submit" class="btn btn-primary btn-lg">Submit</button>

                </fieldset>

            </form>

        <div class="col-sm-4"></div>

    </div>
</div>


<%@ include file="template/footer_inc.jsp" %>