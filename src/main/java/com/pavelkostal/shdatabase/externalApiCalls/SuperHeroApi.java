package com.pavelkostal.shdatabase.externalApiCalls;

import com.pavelkostal.shdatabase.model.SuperHeroModelFromPublicApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(
        name = "SuperHeroApi",
        url = "https://superheroapi.com/api/10224137576688592/search"
)

public interface SuperHeroApi {

    @GetMapping("/{name}")
    SuperHeroModelFromPublicApi getDataFromSuperHeroApi(@PathVariable(value = "name") String name);

//    @GetMapping("/{filters}")
//    SuperHeroModelFromPublicApi getActivities(@PathVariable(value = "filters") final String filters);
}
