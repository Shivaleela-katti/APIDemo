package RestAssured.TestingAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class addplaceapi {

		@Test(dataProvider="BooksData")
		public void addBook(String isbn, String aisle)
		{
			RestAssured.baseURI="http://216.10.245.166";
			String res=given().header("Content-Type", "application/json")
			.body(payload.AddBook(isbn,aisle)).when().post("/Library/Addbook.php")
			.then().log().all().assertThat().statusCode(200)
			.extract().response().asString();
			JsonPath js= new JsonPath(res);
			String id=js.get("ID");
			System.out.println(id);
			System.out.println("hello");
		}
		@Test
		public void delete_place_payload_with() {
			System.out.println("delete place api");
		}
}
