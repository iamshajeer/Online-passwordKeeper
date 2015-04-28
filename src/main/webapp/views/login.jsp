	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<div class="container">

    <form name="myForm" novalidate class="col-md-4 col-md-offset-4">
        <h2>{{login.username}}</h2>
        <div class="form-group">
            <input type="email" name="email" ng-model="login.username" required class="form-control input-lg" placeholder="Email">
            <span style="color:red" ng-show="login.email.$dirty && login.username.$invalid">
  <span ng-show="myForm.email.$error.required">Email is required.</span>
  <span ng-show="myForm.email.$error.email">Invalid email address.</span>
  </span>
	
        </div>
        <div class="form-group">
            <input type="password" name="password" required ng-model="login.password" class="form-control input-lg" placeholder="Password">
        </div>

        <div class="form-group">
            <input type="submit" ng-disabled="myForm.user.$dirty && myForm.user.$invalid ||  
myForm.email.$dirty && myForm.email.$invalid" ng-click="formSubmit(login)" class="btn btn-primary btn-lg btn-block" value="Sign In" />
            <span><a href="#">Need help?</a></span> <span class="pull-right"><a
                    href="#">New Registration</a></span>
        </div>
    </form>
</div>
