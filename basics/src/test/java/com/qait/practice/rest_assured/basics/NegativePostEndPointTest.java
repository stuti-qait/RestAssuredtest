package com.qait.practice.rest_assured.basics;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;



public class NegativePostEndPointTest {
	
	//test1:  login test cases
	//@Test
	//test1.1 -> check login authentication when email is wrong
	public void negativeTestEndpointLogin1() {
		
		given().
		formParam("uemail","stutiswarnkar@gmail.com").
		formParam("upassword","0123456789qwerty").
		when().
			post("http://10.0.21.55:8080/webservice/login").
		then().
			statusCode(401).log().all();
	}
	
	
	//test1.2 -> check login authentication when password entered is wrong
	public void negativeTestEndpointLogin2() {
		
		given().
		formParam("uemail","stutiswarnkar123@gmail.com").
		formParam("upassword","56789qwerty").
		when().
			post("http://10.0.21.55:8080/webservice/login").
		then().
			statusCode(400).log().all();
		
	}
	
	//test1.3 -> check login authentication when both email and password are wrong
	public void negativeTestEndpointLogin3() {
		
		given().
		formParam("uemail","hgvcxnb@hsgj.com").
		formParam("upassword","5348xd").
		when().
			post("http://10.0.21.55:8080/webservice/login").
		then().
			statusCode(401).log().all();
		
	}
	
	
	//test2: Add comment test cases
	@Test
	//test2.1 -> enter wrong email to enter the comment
	public void negativeTestEndpointAddComment1() {
		given().
			formParam("uemail", "Stuti.gmail.com").
			formParam("commentbox", "this must fail the test").
		when().
			post("http://10.0.21.55:8080/webservice/addcomment").
		then().
			statusCode(401).log().all();
		
	}
	
	
	
	
	
}
