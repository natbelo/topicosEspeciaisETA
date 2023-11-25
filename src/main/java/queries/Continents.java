package queries;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Continents {

    public static Response getContinentQuery(RequestSpecification requestSpecification) {
        return given()
                .spec(requestSpecification)
                .body("{\"query\":\"query consultarContinent {\\r\\n    continent(code: \\\"EU\\\") {\\r\\n        name\\r\\n    \\t\\tcountries {\\r\\n    \\t\\t  name\\r\\n    \\t\\t}\\r\\n    }\\r\\n}\",\"variables\":{}}")
                .when()
                .post();
    }
}

