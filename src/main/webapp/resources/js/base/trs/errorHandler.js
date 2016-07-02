define(['jquery'], function ($) {
    "use strict";

    var errorDisplay = {
        init: function () {
            errorDisplay.displayError();
        },

        displayError: function () {

            var textdanger = $(".text-danger");

            if (textdanger.length) {

                if ($(".form-group").find(textdanger)) {
                    textdanger.parent().find(":input").addClass("field-error");

                }
            }

        }


    };

    errorDisplay.init();

    return {

        errorDisplay: errorDisplay
    }

});
