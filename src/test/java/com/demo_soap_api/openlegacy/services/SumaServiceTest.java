package com.demo_soap_api.openlegacy.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.openlegacy.tests.api.AbstractApiTest;

@SpringBootTest
@ActiveProfiles({"suma-test"})
public class SumaServiceTest extends AbstractApiTest {

    public SumaServiceTest(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Test
    public void testSumaService() throws Exception {
        String suma_input = "mock/Suma/test_suma-getSuma.input.json";
        String suma_output = "mock/Suma/test_suma-getSuma.output.json";
        super.baseTest(suma_input, suma_output, SumaServiceImpl.class, "getSuma");
    }
}
