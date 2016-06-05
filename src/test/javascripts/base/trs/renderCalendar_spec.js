define(['base/trs/renderCalendar'], function (calApp) {


    describe("On visiting the search page", function () {
        var showCalWidget, $startDate, $dueDate, view;

        beforeEach(function () {
            loadFixtures('MyFixture.html');

            // calling the source
            view = new calApp.showCalWidget({
                selector: '#START_DATE',
                selector: '#DUE_DATE'
            });

            $startDate = $("#START_DATE");
            $dueDate = $("#DUE_DATE");
            showCalWidget = jasmine.createSpy(calApp.showCalWidget);
        });


        it("should expose a property with its DOM element", function () {
            expect(view.$element).toExist();
        });


        it("should allow a focusin event for the due date", function () {

            spyEvent = spyOnEvent($dueDate, 'focusin');
            $dueDate.trigger("focusin");

            expect('focusin').toHaveBeenTriggeredOn($dueDate);
            expect(spyEvent).toHaveBeenTriggered();


        });


        it("should allow a focusin event for start date", function () {

            spyEvent = spyOnEvent(view.$element, 'focusin');
            view.$element.trigger("focusin");

            expect('focusin').toHaveBeenTriggeredOn(view.$element);
            expect(spyEvent).toHaveBeenTriggered();


        });

        it("should call the function with start date", function () {
            //showCalWidget($startDate);

            spyOn(calApp, "showCalWidget");
          //   expect(showCalWidget).toHaveBeenCalled();
          //   expect(showCalWidget).toHaveBeenCalled();


        });
        it("should call the function with due date", function () {
            showCalWidget($dueDate);

            //spyOn(calApp, "showCalWidget");
            //  expect(showCalWidget).toHaveBeenCalledWith($startDate);


        });
    });

});
