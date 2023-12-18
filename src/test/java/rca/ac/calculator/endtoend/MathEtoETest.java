package rca.ac.calculator.endtoend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MathEtoETest {

    private final TestRestTemplate restTemplate = new TestRestTemplate();

    private int port;

    @Test
    public void testApiEndpoint() {
        String url = "http://localhost:" + port + "/api/doMath";
        String response = restTemplate.getForObject(url, String.class);

        assertEquals("Expected Response", response);
    }
}
