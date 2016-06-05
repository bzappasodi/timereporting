<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>${param.title}</title>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="/resource/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resource/css/jquery-ui.css">
    <link rel="stylesheet" href="/resource/css/overrides.css">


    <script data-main="/resource/js/common" src="/resource/js/lib/require.js"></script>

</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <nav class="navbar navbar-inverse navbar-fixed-top">

                <div class="navbar-header">
                    <c:if test="${not empty sessionScope.currentSessionUser}">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                                data-target="#navbar"
                                aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </c:if>
                    <a class="navbar-brand active" href="#">${param.title}</a>
                </div>
                <c:if test="${not empty sessionScope.currentSessionUser}">
                    <div id="navbar" class="collapse navbar-collapse">
                        <ul class="nav navbar-nav">
                            <li><a href="/viewprojects">View all projects</a></li>
                            <li><a href="/add">Insert a new project</a></li>
                            <li><a href='/addnewclients'>Insert a new client</a></li>
                            <li><a href='/viewtasks'>View tasks</a></li>
                            <a href="<c:url value="/j_spring_security_logout" />"
                               class="btn btn-danger btn-mini pull-right">logout</a>
                        </ul>
                    </div>
                </c:if>
                <!--/.nav-collapse -->

            </nav>
            <h1>${param.title}</h1>

        </div>
    </div>
</section>
<div class="container">
