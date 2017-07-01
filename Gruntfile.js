module.exports = function(grunt) {

        grunt.initConfig({
        jasmine : {
            // Your project's source files
            src :  'webapp/resources/js/base/**/*.js',
            // Your Jasmine spec files
            specs : 'test/javascripts/base/trs/*.js',
            // Your spec helper files
            helpers : 'test/javascripts/base/*.js'
        }
    });

    // Register tasks.
    grunt.loadNpmTasks('grunt-jasmine-runner');

    // Default task.
    grunt.registerTask('default', 'jasmine');



};

