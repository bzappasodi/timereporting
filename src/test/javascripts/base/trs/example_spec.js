define(["base/trs/example"], function(example) {
    describe("example.hello", function() {
        it("should return 'hello jim'", function() {
            expect(example.hello("jim")).toBe("hello jim");
        });
    });
});