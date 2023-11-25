import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import queries.Continents;
import static org.hamcrest.Matchers.*;

public class ContinentsQueryTest extends BaseTest{

    @Test
    public void shouldReturnStatus200() {

        Response response = Continents.getContinentQuery(requestSpec);

        response.then().
                assertThat().
                statusCode(HttpStatus.SC_OK).
                log().body();
    }

    @Test
    public void shouldVerifyName() {

        Response response = Continents.getContinentQuery(requestSpec);

        response.then().
                assertThat().
                body("data.continent.name" , is("Europe"));

    }
}
