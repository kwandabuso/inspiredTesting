package apiautomation;

import io.restassured.RestAssured;

public class ReqresGetExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";
        UserResponse response = RestAssured
                .given()
                .when()
                .get("/users/2")
                .then()
                .statusCode(200)
                .extract()
                .as(UserResponse.class);

        System.out.println(response.getData().getEmail());
        System.out.println(response.getData().getFirst_name());
        System.out.println(response.getSupport().getText());

    }

}
