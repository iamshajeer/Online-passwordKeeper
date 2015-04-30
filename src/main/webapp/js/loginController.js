	var appController = angular.module('appController', []);
	
	
/*	appController.factory('AccountGroup', ['$resource', 'Data', function ($resource, Data) {
	  return $resource(Data.rootUrl + 'admin/account_groups/:id', {id: '@id'}, 
	    {
	      query: {
	        isArray: true,
	        method: 'GET'
	      },
	      update: {
	        method: 'PUT'
	      }
	    }
	  );
	}]);*/
	
	appController.controller('LoginController', ['$scope','$http', function ($scope,$http,$location) {
		
		url="/LoginValidator";
		
		  $scope.formSubmit = function(item) {
			  $http.post(url).success(function(data, status, headers, config){
					alert("success man");
				}).error(function(data, status, headers, config){
					debugger;
					alert(status);
			
				});
	
			  };
	/*	$http.post("url").success(function(data){
			$scope.menuItem = data;
		}).error(function(){
			console.log("error");
	
		});
	*/
	}]);
	
	  appController.controller('MainController', ['$scope','$http', function ($scope,$http) {
			alert("in");
		  $scope.formSubmit = function(item) {
			  
			  	
			  };
			  
	


/*	$http.post("url").success(function(data){
	$scope.menuItem = data;
}).error(function(){
	console.log("error");

});
*/
}]);