package com.qait.practice.rest_assured.basics;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class GetEndPointTest {

	 
	public void testEndpointAllComments() {
		given().
			get("http://10.0.21.55:8080/webservice/allcomments").
		then().
			statusCode(200).
			log().all();
			
	}
	//Test1 -> correct Email address
	@Test
	public void positiveTestEndpointGiveComment() {
		given().
			get("http://10.0.21.55:8080/webservice/comments?uemail=dharmendragupta@qainfotech.com").
		then().
			statusCode(200).
			log().all();
	}
	
	//Test1 -> incorrect Email address
	@Test
	public void negativeTestEndpointGiveComment() {
		given().
		get("http://10.0.21.55:8080/webservice/comments?uemail=mendragupta@qainfotech.com").
	then().
		statusCode(204).
		log().all();
	}
}
