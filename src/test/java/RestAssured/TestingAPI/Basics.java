package RestAssured.TestingAPI;
//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import Pojo.AddPlaceAPI;
import Pojo.Location;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class Basics {

	public static void main(String[] args) throws FileNotFoundException {
				
				RestAssured.baseURI="https://rahulshettyacademy.com";
//				File file=new File("../TestingAPI/body.json");
//				FileReader fr=new FileReader(file);
//				//JSONObject jo=new JSONObject(fr);
//				String res=
//						given().queryParam("key","qaclick123").
//						header("Content-Type","application/json").body(file)
//						.when().post("maps/api/place/add/json").then().assertThat().statusCode(200).extract().response().asString();
//					System.out.println(res);
//				JsonPath js=new JsonPath(res);//parsing json
//				String placeid=js.getString("place_id");
//				System.out.println(placeid);
				
				
			File file1=new File("../TestingAPI/update.json");	
			String res=
			given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
			.body(file1).when().put("maps/api/place/update/json")
			.then().assertThat().statusCode(200).extract().response().asString();
			JsonPath js=new JsonPath(res);
			System.out.println(res);	
						
	}

}
