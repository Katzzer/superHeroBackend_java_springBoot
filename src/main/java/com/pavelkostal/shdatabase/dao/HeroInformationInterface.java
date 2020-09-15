package com.pavelkostal.shdatabase.dao;

import com.pavelkostal.shdatabase.entity.HeroInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroInformationInterface extends JpaRepository <HeroInformation, Long> {
}

