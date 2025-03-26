package RestAssured.TestingAPI;


import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import Pojo.AddPlaceAPI;
import Pojo.Location;

//import io.cucumber.java.en.Given;

public class AddPlace{

	
		// TODO Auto-generated method stub
//	RequestSpecification res;
//	ResponseSpecification resspec;
//	Response response;
//	TestDataBuild data=new TestDataBuild();
	@Test
	public void add_place_payload_with() {
			AddPlaceAPI p = new AddPlaceAPI();
			p.setAccuracy(50);
			p.setAddress("29, side layout, cohen 09");
			p.setLanguage("French-IN");
			p.setName("Frontlines houses");
			p.setPhone_number("(+91) 90351456790");
			List<String> mylist=new ArrayList<String>();
			mylist.add("shoe park");
			mylist.add("shop");
			p.setWebsite("http://google.com");
			Location loc=new Location();
			loc.setLat(-38.383494);
			loc.setLng(33.427362);
			p.setLocation(loc);
			
			String res=
					given().log().all().queryParam("key","qaclick123").
					body(p)
					.when().post("https://rahulshettyacademy.com/maps/api/place/add/json")
			.then().assertThat().statusCode(200).extract().response().asString();
	    
			String responseString=res.toString();
			System.out.println(responseString);
//
//			System.out.println(res.getBody().asString());
//			
		}
	@Test
	public void delete_place_payload_with() {
		System.out.println("delete place api");
	}
	}

	


