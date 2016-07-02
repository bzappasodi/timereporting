    define(['jquery'], function ($) {


        "use strict";

    var calApp = {
        init: function () {

            calApp._handleDatePicker();

        },

        _showCalWidget: function (e) {

            this.$element = $(e.selector);
            this.$element.datepicker();
        },

        _handleDatePicker: function () {

            var startDate = $('#START_DATE'), dueDate = $('#DUE_DATE');

            if (startDate.length) {
                startDate.focusin(function () {
                    calApp._showCalWidget(startDate);
                });
            }

            if (dueDate.length) {
                dueDate.focusin(function () {
                    calApp._showCalWidget(dueDate);
                });
            }
        }

    };

    calApp.init();

    return {
        calApp: calApp,
        handleDatePicker: calApp._handleDatePicker,
        showCalWidget: calApp._showCalWidget
    }

});
