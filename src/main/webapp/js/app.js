
var myApp = angular.module('myApp', [
	'ngRoute',
	'appController'
	]);

myApp.config(['$routeProvider',function ($routeProvider) {

	$routeProvider.
	when('/home', {
		templateUrl: 'views/login.jsp',
		controller: 'LoginController'
	}).
	otherwise({ redirectTo: '/home' });
	
}]);