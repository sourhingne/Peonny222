package com.dcs2.MavenDcs;
import static io.restassured.RestAssured.given;

import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;

/**
 * Hello world!
 * given --> url--header--->authentication token--> method--> body
 * when--> actions--> method--> get post put delete
 * then --response---statuscode---body
 * url
 * type of metod
 * payload
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      /*given().when().get("https://reqres.in/api/users/2").then().log().all();
      given().when().get("https://reqres.in/api/users/200").then().log().body();// only get body
      given().when().get("https://reqres.in/api/users/3").then().log().status();// only get status
      given().when().get("https://reqres.in/api/users/3").then().log().body().statusCode(200);// only get status*/
     /*  given()
       .contentType("application/json")
       //.header("Content-Type","application/json")
       //.header("Authorization","Bearer 61381400d8091571224e7cd246460a3ea39d55179d14a0e686a198107f3c6525")
       .body("{\r\n"
       		+ "    \"name\": \"morpheus\",\r\n"
       		+ "    \"job\": \"leader\"\r\n"
       		+ "}")
       .when()
       .post("https://reqres.in/api/users")
       .then().log().all();
       
       /*given()
       .delete("https://reqres.in/api/users/1")
       .then()
       .log()
       .all();*/
     
    	
    	
    	/*String jsonString = "{\r\n"
       		+ "  \"name\":\"kiran\",\r\n"
       		+ "  \"cars\":[\r\n"
       		+ "    {\r\n"
       		+ "      \"name\":\"I20\",\r\n"
       		+ "      \"year\":\"2005\"\r\n"
       		+ "    },\r\n"
       		+ "    {\r\n"
       		+ "       \"name\":\"Swift\",\r\n"
       		+ "      \"year\":\"2010\"\r\n"
       		+ "    }\r\n"
       		+ "    ]\r\n"
       		+ "}";
       
       JsonPath js= new JsonPath(jsonString);
       String carname = js.getString("cars[0].name");
       System.out.println("car name:"+carname);
       
       String caryear =js.getString("cars[1].year");
       System.out.println("Year: " +caryear);*/
    	
    	/* String jsonString = "{\r\n"
    	 		+ "    \"data\": {\r\n"
    	 		+ "        \"id\": 2,\r\n"
    	 		+ "        \"name\": \"fuchsia rose\",\r\n"
    	 		+ "        \"year\": 2001,\r\n"
    	 		+ "        \"color\": \"#C74375\",\r\n"
    	 		+ "        \"pantone_value\": \"17-2031\"\r\n"
    	 		+ "    },\r\n"
    	 		+ "    \"support\": {\r\n"
    	 		+ "        \"url\": \"https://reqres.in/#support-heading\",\r\n"
    	 		+ "        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n"
    	 		+ "    }\r\n"
    	 		+ "}";
    	       
    	       JsonPath js= new JsonPath(jsonString);
    	       String name = js.getString("data.name");
    	       System.out.println("person name:"+name);
    	       
    	       String text =js.getString("support.text");
    	       System.out.println("text: " +text);*/
    			
    	
    /*	Employee e= new Employee();  //Serialization and Deserialization
    	e.setName("Sourabh");
    	e.setJob("Tech Lead");*/
    	
    	/*ReqResServices reqResServices=new ReqResServices();
    	reqResServices.postMethod();*/
    	
    	Student student=new Student();
    	student.setName("Dhananjay");
    	student.setJob("QA");
    	
    	/*given()
    	.contentType("application/json")
    	.body(student)
    	.when()
    	.post("https://reqres.in/api/users")
    	.then().log().all();*/
    	
    	
    	

    	given()
    	.contentType("application/json")
    	.body(student).log().all()
    	.when()
    	.post("https://reqres.in/api/users")
    	.then().log().all();
    	
    	
    	

    }
}
