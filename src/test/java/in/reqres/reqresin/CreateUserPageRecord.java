package in.reqres.reqresin;

import in.reqres.model.ReqresPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateUserPageRecord extends TestBase {

    @Test
    public void createUserPageRecord(){
        ReqresPojo reqresPojo = new ReqresPojo();
        reqresPojo.setName("Lalita");
        reqresPojo.setJob("patel");
       // reqresPojo.setEmail("manu154@gmail.com");
       // reqresPojo.setPassword("rhdd3450");

        Response response = given()
                .header("Content-Type","application/json")
                .body(reqresPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
