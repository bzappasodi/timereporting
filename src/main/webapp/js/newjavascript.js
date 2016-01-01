define(['base/app/search_errors', 'lodash'], function (apsSearchErrors, _) {
    describe("On visiting the search page", function () {

        describe("When errors return on submit", function () {
            it("Should add the fieldErrorBorder class to the fields that return with the error class", function () {
                setFixtures("<input type=hidden id='lastName' class='error fieldErrorBorder'/>\n\
                             <input type=hidden id='ssn' class='error fieldErrorBorder'/>\n\
                             <input type=hidden id='authText' class='error fieldErrorBorder'/>");

                _(["#authText", "#ssn", "#lastName"])
                        .each(function (id) {
                            apsSearchErrors.setBorderForErrors($(id));
                            expect($(id)).toHaveClass("fieldErrorBorder");
                        });
            });
        });

        describe("On changing a field value with an error", function () {
            it("Should remove the fieldErrorBorder class on blur", function () {
                setFixtures("<input type=text id='lastName' class='error'/>\n\
                             <input type=text id='ssn' class='error'/>\n\
                             <input type=text id='authText' class='error'/>");

                _(["#authText", "#ssn", "#lastName"])
                        .each(function (id) {
                            $(id).blur(function () {
                                apsSearchErrors.setErrorHandlers($(id));
                                expect($(id)).not.toHaveClass("fieldErrorBorder");
                            });
                        });
            });
        });
    });

});





