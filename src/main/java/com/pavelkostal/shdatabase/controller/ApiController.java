package com.pavelkostal.shdatabase.controller;

import com.pavelkostal.shdatabase.externalApiCalls.SuperHeroApi;
import com.pavelkostal.shdatabase.model.SuperHeroModelFromPublicApi;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin({"http://localhost:4200", "http://localhost:8081", "https://pavelkostal-superheroapi.herokuapp.com", "http://superheroapi.pavelkostal.com"})
@AllArgsConstructor
public class ApiController {

//    private HeroNameRepository heroNameRepository;
//    private HeroInformationRepository heroInformationRepository;
    SuperHeroApi superHeroApi;

//    @GetMapping("/hero-name-list")
//    public List<HeroName> getHeroList() {
//        return heroNameRepository.findAll();
//    }
//
//    @GetMapping("/hero-information/search/findByHeroNameId")
//    public HeroInformation findByHeroNameId(@RequestParam(name = "id") long id) {
//        return heroInformationRepository.findById(id).get();
//    }

    @GetMapping("/superheroapi")
    public SuperHeroModelFromPublicApi getHeroFromSuperHeroApi(@RequestParam(name = "hero") String hero) {
        return superHeroApi.getDataFromSuperHeroApi(hero);
    }
}
