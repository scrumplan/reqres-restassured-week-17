package in.reqres.reqresin;

import in.reqres.model.ReqresPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class SendLoginRecord extends TestBase {

    @Test
    public void sendLoginRecord(){
        ReqresPojo reqresPojo = new ReqresPojo();
        reqresPojo.setEmail("eve.holt@reqres.in");
        reqresPojo.setPassword("cityslicka");

        Response response = given()
                .header("Content-Type","application/json")
                .body(reqresPojo)
                .when()
                .post("/login");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
