package com.pavelkostal.shdatabase.repository;

import com.pavelkostal.shdatabase.entity.HeroInformation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin({"http://localhost:4200", "http://localhost:8081"})
@RepositoryRestResource(collectionResourceRel = "heroInformation", path="hero-information")
//@Repository
public interface HeroInformationRepository extends JpaRepository <HeroInformation, Long> {

    Page<HeroInformation> findByHeroNameId (@RequestParam("id") Long id, Pageable pageable);

}

