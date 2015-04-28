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
	
	appController.controller('LoginController', ['$scope','$http', function ($scope,$http) {
	
		  $scope.formSubmit = function(item) {
			  
			  	console.log(item);
			  };
			  
	
		
		
	/*	$http.post("url").success(function(data){
			$scope.menuItem = data;
		}).error(function(){
			console.log("error");
	
		});
	*/
	}]);