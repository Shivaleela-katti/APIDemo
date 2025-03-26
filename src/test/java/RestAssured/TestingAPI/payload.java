package RestAssured.TestingAPI;

public class payload {

	public static String AddBook(String isbn, String aisle)
	{
		String payload1= "{\r\n" +
	"\r\n" +
"\"name\": \"Learn apium automation with java\",\r\n" +"\"isbn\": \""+isbn+"\",\r\n" +"\"aisle\": \""+aisle+"\", \r\n" +"\"author\" :\"John Foe\" \r\n" + "}\r\n" +
 "\r\n" + "";

				return payload1;
	}
}
