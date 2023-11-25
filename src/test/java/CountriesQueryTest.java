import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import queries.Continents;
import queries.Countries;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class CountriesQueryTest extends BaseTest{

    @Test
    public void shouldReturnStatus200() {

        Response response = Countries.getCountryQuery(requestSpec);

        response.then().
                assertThat().
                statusCode(200).
                log().
                body();
    }

    @Test
    public void shouldVerifyCode() {

        Response response = Countries.getCountryQuery(requestSpec);

        response.then().
                assertThat().
                body("data.country.code" , is("BE"));

    }

}
