package com.pavelkostal.shdatabase.externalApiCalls;

import com.pavelkostal.shdatabase.service.ApiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SuperHeroApiTest {

    @Autowired
    SuperHeroApi superHeroApi;

    @Test
    void itShouldGetDataFromSuperHeroApi() {
        // Given
        superHeroApi.getDataFromSuperHeroApi("Batman");

        // When

        // Then
    }
}
