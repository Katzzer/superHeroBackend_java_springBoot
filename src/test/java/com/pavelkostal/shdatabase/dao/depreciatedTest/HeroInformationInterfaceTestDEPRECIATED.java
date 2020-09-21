package com.pavelkostal.shdatabase.dao.depreciatedTest;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class HeroInformationInterfaceTestDEPRECIATED {

    @Ignore
    @Disabled
    @ParameterizedTest
    @CsvSource({
            "http://localhost:8080/api",
            "http://localhost:8080/api/hero-information",
            "http://localhost:8080/api/hero-information/1",
            "http://localhost:8080/api/hero-name-list",
            "http://localhost:8080/api/hero-name-list/1",
            "http://localhost:8080/api/hero-information/search/findByHeroNameId?id=1"
    })
    public void itShouldReturnStatusOKForRequestedApi (String urlTemplate) throws Exception {

        // Given
        HttpUriRequest request = new HttpGet( urlTemplate);

        // When
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );

        // Then
        assertThat(
                httpResponse.getStatusLine().getStatusCode(),
                equalTo(HttpStatus.SC_OK));
    }


    @Nested
    @DisplayName("Test for not allowed method - PUT, POST, DELETE")
    class allTestsForUsersWithToken {

        @Ignore
        @Disabled
        @ParameterizedTest
        @CsvSource({
                "http://localhost:8080/api/hero-information/1",
                "http://localhost:8080/api/hero-name-list/1"
        })
        public void itShouldReturnNotAllowedForHttpPutMethod(String urlTemplate) throws Exception {

            // Given
            HttpUriRequest request = RequestBuilder.create("PUT")
                    .setUri(urlTemplate)
                    .setEntity(new StringEntity("{\"test\":\"data\"}", ContentType.APPLICATION_JSON))
                    .build();

            // When
            HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

            // Then
            assertThat(
                    httpResponse.getStatusLine().getStatusCode(),
                    equalTo(405));
        }

        @Ignore
        @Disabled
        @ParameterizedTest
        @CsvSource({
                "http://localhost:8080/api/hero-information",
                "http://localhost:8080/api/hero-name-list"
        })
        public void itShouldReturnNotAllowedForHttpPostMethod(String urlTemplate) throws Exception {

            // Given
            HttpUriRequest request = RequestBuilder.create("POST")
                    .setUri(urlTemplate)
                    .setEntity(new StringEntity("{\"someValue\":1}", ContentType.APPLICATION_JSON))
                    .build();

            // When
            HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

            // Then
            assertThat(
                    httpResponse.getStatusLine().getStatusCode(),
                    equalTo(405));
        }

        @Ignore
        @Disabled
        @ParameterizedTest
        @CsvSource({
                "http://localhost:8080/api/hero-information/1",
                "http://localhost:8080/api/hero-name-list/1"
        })
        public void itShouldReturnNotAllowedForHttpDeleteMethod(String urlTemplate) throws Exception {

            // Given
            HttpUriRequest request = new HttpDelete("http://localhost:8080/api/hero-name-list/1");

            // When
            HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

            // Then
            assertThat(
                    httpResponse.getStatusLine().getStatusCode(),
                    equalTo(405));
        }
    }

}
