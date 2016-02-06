

<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate var="year" value="${now}" pattern="yyyy" />

</div>
</div>
<div id="ft" role="contentinfo">&copy;&nbsp;${year} bzappasodi</div>

</div>
<script>
    $(function() {
        $("#START_DATE").datepicker();
        $("#DUE_DATE").datepicker();
    });
</script>
</body>
</html>