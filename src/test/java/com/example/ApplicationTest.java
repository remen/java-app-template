package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTest {
    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void running_main_does_not_crash() throws Exception {
        ResponseEntity<Map> response = testRestTemplate.getForEntity("/", Map.class);
        assertTrue(response.getStatusCode().is2xxSuccessful());
        assertThat(response.getBody().get("greeting"), equalTo("Hello World"));
    }
}
