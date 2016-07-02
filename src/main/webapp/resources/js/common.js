requirejs.config({

    baseUrl: "/resource/js/",
    paths: {
        jquery: "lib/jquery-1.12.0",
        jquery_ui: "lib/jquery-ui"
    }

});

require(['jquery', 'jquery_ui'], function ($) {

    $(window).unload(function () {
        $(window).unbind('unload');
   });
  console.log("Loaded " + $);
   return {};
});