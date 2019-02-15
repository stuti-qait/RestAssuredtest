package com.qait.practice.rest_assured.basics;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

//import io.restassured.http.ContentType;



public class PositivePostEndPointTest {

	
	//test1 -> check the login credentials if they are right
	@Test
	public void positiveTestEndpointLogin() {
		
		given().
			formParam("uemail" , "stutiswarnkar123@gmail.com").
			formParam("upassword","0123456789qwerty").
			
		when().
			post("http://10.0.21.55:8080/webservice/login").
		then().
			statusCode(200).log().all();
		
		
	}
	
	@Test
	//test2 -> check if a new user can be added 
	public void positiveTestEndpointSignup() {
		given().
			formParam("uname","Sarans Dutta").
			formParam("uemail","d@test.com").
			formParam("upassword","56789io").
		when().
			post("http://10.0.21.55:8080/webservice/signup").
		then().statusCode(200).log().all();		
	}
	
	
	
	//test3 -> check if a new command can be added
	@Test
	public void positiveTestEndpointAddComment() {
		given().
			formParam("uemail","d@test.com").
			formParam("commentbox","this is a test through testNG and rest-assured").
		when().
			post("http://10.0.21.55:8080/webservice/addcomment").
		then().statusCode(200).log().all();		
	}
}
