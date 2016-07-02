define(['jquery'], function ($) {
    "use strict";
    $(document).ready(function () {
        $.getJSON("resource/js/base/trs/infoData.json", function (result) {
            $.each(result, function (i, field) {
                $("#json-data").append(field + " ");
            });
        });
    });
});

