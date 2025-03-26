package RestAssured.TestingAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
public class DynamicJson {

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
	}
	@DataProvider(name="BooksData")
	public Object[][] getData()
	{
		return new Object[][] {{"fghghd","1177"},{"kdkj","1459"},{"jhdd","1925"}};
	}
	@Test(dataProvider="BooksData")
	public void deleteBook(String isbn, String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		String res=given().header("Content-Type", "application/json")
		.body(payload.AddBook(isbn,aisle)).when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		JsonPath js= new JsonPath(res);
		String id=js.get("ID");
		System.out.println(id);
	}
	@DataProvider(name="BooksData")
	public Object[][] deleteData()
	{
		return new Object[][] {{"fghghd","1177"},{"kdkj","1459"},{"jhdd","1925"}};
	}
}
