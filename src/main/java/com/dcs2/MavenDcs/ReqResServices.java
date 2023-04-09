package com.dcs2.MavenDcs;

import static io.restassured.RestAssured.given;

public class ReqResServices {
	public void postMethod() {
		Student student = new Student();
		student.setName("Dhananjay");
		student.setJob("QA");

		given().contentType("application/json").body(student).when().post("https://reqres.in/api/users").then().log()
				.all();

	}
}
