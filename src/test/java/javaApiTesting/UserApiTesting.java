package javaApiTesting;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.junit.jupiter.api.Test;
import support.domain.User;

import static io.restassured.RestAssured.given;

public class UserApiTesting {

    @Test
    public void test() {
        RestAssured.defaultParser = Parser.JSON;
        User user = given()
                .get("http://localhost:9999/user/rafael")
                .thenReturn()
                .as(User.class);

        System.out.println(user.getNome());
    }

}
