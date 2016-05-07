define('trs/showDatePicker', ['jquery'], function ($) {
    "use strict";

    var _handleDatePicker, publicMethods;

    var _showCalWidget = function (e) {
        e.datepicker();
    };

    _handleDatePicker = function () {
        if ($('#START_DATE').length) {
            var startDate = $('#START_DATE');
            startDate.on('focusin', function () {
                _showCalWidget(startDate);
            });

        }


        if ($('#DUE_DATE').length) {
            var dueDate = $('#DUE_DATE');
            dueDate.on('focusin', function () {
                _showCalWidget(dueDate);
            });
        }

    };

    publicMethods = function () {
        _handleDatePicker();

    };

    $(function () {
        publicMethods();
    });

    return publicMethods;

});

