requirejs.config({

    baseUrl: "js",
    paths: {
        'jquery': 'lib/jquery-1.12.0',
        'jquery-ui': 'lib/jquery-ui',
    },
    shim: {

        'jquery-ui': {
            exports: "$",
            deps: ['jquery']
        }
    }
});

require(['jquery', 'jquery-ui'], function ($) {
    //console.log("Loaded " + $);
    return {};
});