package com.pavelkostal.shdatabase.dao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

//@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
//@WebMvcTest(HeroInformationInterface.class)
//@ComponentScan({"com.pavelkostal.shdatabase.*"})
public class HeroInterfaceTest {

    @Autowired
    private MockMvc mockMvc;

    @ParameterizedTest
    @CsvSource({
            "/api",
            "/api/hero-information",
            "/api/hero-information/1",
            "/api/hero-name-list",
            "/api/hero-name-list/1",
            "/api/hero-information/search/findByHeroNameId?id=1"
    })
    public void itShouldReturnStatusOKForRequestedApi(String urlTemplate) throws Exception{
        mockMvc.perform(get(urlTemplate))
                .andExpect(status().isOk());
    }

    @Nested
    @DisplayName("Test for not allowed method - PUT, POST, DELETE")
    class allTestsForUsersWithToken {

        @ParameterizedTest
        @CsvSource({
                "http://localhost:8080/api/hero-information/1",
                "http://localhost:8080/api/hero-name-list/1"
        })
        public void itShouldReturnNotAllowedForHttpPutMethod(String urlTemplate) throws Exception {
            mockMvc.perform(put(urlTemplate)
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"test\":\"data\"}"))
                    .andExpect(status().is(405));
        }

        @ParameterizedTest
        @CsvSource({
                "http://localhost:8080/api/hero-information",
                "http://localhost:8080/api/hero-name-list"
        })
        public void itShouldReturnNotAllowedForHttpPostMethod(String urlTemplate) throws Exception {
            mockMvc.perform(post(urlTemplate)
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"test\":\"data\"}"))
                    .andExpect(status().is(405));
        }

        @ParameterizedTest
        @CsvSource({
                "http://localhost:8080/api/hero-information/1",
                "http://localhost:8080/api/hero-name-list/1"
        })
        public void itShouldReturnNotAllowedForHttpDeleteMethod(String urlTemplate) throws Exception {
            mockMvc.perform(delete(urlTemplate)
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"test\":\"data\"}"))
                    .andExpect(status().is(405));
        }
    }
}
