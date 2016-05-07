require.config({
urlArgs: 'cb='+ Math.random(),
    paths: {
        jquery: "lib/jquery",
        jquery_ui: "lib/jquery-ui",
        "jasmine-jquery": "/spec/javascripts/lib/jasmine-jquery"
    },

    shim: {
        "jasmine-jquery" : ["jquery"]
    }
});

define(['jasmine-jquery'], function () {
    jasmine.getFixtures().fixturesPath = 'spec/javascripts/fixtures';
    //console.log("Loaded " + $);
   // return {};

   return jasmine;
});