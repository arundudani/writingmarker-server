package uk.adititec.writingmarker.server;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.web.server.test.client.TestRestTemplate;
import static org.assertj.core.api.Assertions.assertThat;
public class FunctionSampleGcpIntegrationTest {

    private TestRestTemplate rest = new TestRestTemplate();

    @Test
    public void testSample() throws IOException, InterruptedException {
        try (LocalServerTestSupport.ServerProcess process = LocalServerTestSupport.startServer(ServerApplication.class)) {
            String result = rest.postForObject("http://localhost:8080/", "Hello", String.class);
            assertThat(result).isEqualTo("\"HELLO\"");
        }
    }
}
