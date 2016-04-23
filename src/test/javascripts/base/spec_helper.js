/**
 * Created by williamzappasodi on 2/18/16.
 */
require.config({
    paths: {
        jquery: "lib/jquery-1.12.0",
        jquery_ui: "lib/jquery-ui",
        "jasmine-jquery": "/spec/javascripts/lib/jasmine-jquery"
    },

    shim: {
        "jasmine-jquery" : ["jquery","jquery-ui"]
    }
});

define(['jasmine-jquery'], function () {
   // jasmine.getFixtures().fixturesPath = 'spec/javascripts/fixtures';
    console.log("Loaded " + $);

   // return jasmine;
});