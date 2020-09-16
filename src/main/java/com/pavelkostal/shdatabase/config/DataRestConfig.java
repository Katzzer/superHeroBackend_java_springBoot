package com.pavelkostal.shdatabase.config;

import com.pavelkostal.shdatabase.entity.HeroInformation;
import com.pavelkostal.shdatabase.entity.HeroName;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        HttpMethod[] unsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};

        // this will disable HTTP method PUT, POST and DELETE for HeroInformation
        config.getExposureConfiguration()
                .forDomainType(HeroInformation.class)
                .withItemExposure(((metdata, httpMethods) -> httpMethods.disable(unsupportedActions)))
                .withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(unsupportedActions)));

        // this will disable HTTP method PUT, POST and DELETE for HeroInformation
        config.getExposureConfiguration()
                .forDomainType(HeroName.class)
                .withItemExposure(((metdata, httpMethods) -> httpMethods.disable(unsupportedActions)))
                .withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(unsupportedActions)));
    }
}
