

<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">

<div id="json-data"></div>
    </div>


</div>


<c:set var="now" value="<%= new java.util.Date() %>" />

<div id="ft" role="contentinfo">&copy;&nbsp;<fmt:formatDate pattern="yyyy"
                                                            value="${now}" />
    bzappasodi</div>
</div>

<script>
    require(["common"], function () {
        require(['base/trs/displayInfo']);

    });

</script>
</body>
</html>