package com.pavelkostal.shdatabase;

import com.pavelkostal.shdatabase.entity.HeroInformation;
import com.pavelkostal.shdatabase.entity.HeroName;
import com.pavelkostal.shdatabase.repository.HeroInformationRepository;
import com.pavelkostal.shdatabase.repository.HeroNameRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class SuperHeroDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperHeroDatabaseApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(HeroInformationRepository heroInformationRepository, HeroNameRepository heroNameRepository) {
		return args -> {
			HeroName batman = new HeroName("Batman");
			HeroName ironman = new HeroName("Ironman");
			HeroName spiderman = new HeroName("Spiderman");
			HeroName thor = new HeroName("Thor");
			HeroName captainAmerica = new HeroName("Captain America");
			HeroName thanos = new HeroName("Thanos");

			List<HeroName> listOfHeroNames = new ArrayList<>();
			listOfHeroNames.add(batman);
			listOfHeroNames.add(ironman);
			listOfHeroNames.add(spiderman);
			listOfHeroNames.add(thor);
			listOfHeroNames.add(captainAmerica);
			listOfHeroNames.add(thanos);
			heroNameRepository.saveAll(listOfHeroNames);

			HeroInformation film1 = new HeroInformation(batman, "Batman Begins", "Christian Bale", "https://www.csfd.cz/film/136224-batman-zacina/prehled/", 86);
			HeroInformation film2 = new HeroInformation(batman, "Batman", "Michael Keateon","https://www.csfd.cz/film/1069-batman/prehled/", 81);
			HeroInformation film3 = new HeroInformation(ironman, "Iron Man", "Robert Downey Jr.","https://www.csfd.cz/film/223262-iron-man/prehled/", 82);
			HeroInformation film4 = new HeroInformation(ironman, "Iron Man 2", "Robert Downey Jr.","https://www.csfd.cz/film/242570-iron-man-2/prehled/", 82);
			HeroInformation film5 = new HeroInformation(spiderman, "Spider-Man", "Tobey Maguire","https://www.csfd.cz/film/7563-spider-man/prehled/", 76);
			HeroInformation film6 = new HeroInformation(spiderman, "Spider-Man 2", "Tobey Maguire","https://www.csfd.cz/film/116933-spider-man-2/prehled/", 74);
			HeroInformation film7 = new HeroInformation(thor, "Thor", "Chris Hemsworth","https://www.csfd.cz/film/234300-thor/prehled/", 75);
			HeroInformation film8 = new HeroInformation(thor, "Thor: The Dark World", "Chris Hemsworth","https://www.csfd.cz/film/299231-thor-temny-svet/prehled/", 72);
			HeroInformation film9 = new HeroInformation(thor, "Thor: Ragnarok", "Chris Hemsworth","https://www.csfd.cz/film/374525-thor-ragnarok/prehled/", 82);
			HeroInformation film10 = new HeroInformation(captainAmerica, "Captain America: The First Avenger", "Chris Evans","https://www.csfd.cz/film/227773-captain-america-prvni-avenger/prehled/", 68);
			HeroInformation film11 = new HeroInformation(captainAmerica, "Captain America: The Winter Soldier", "Chris Evans","https://www.csfd.cz/film/303069-captain-america-navrat-prvniho-avengera/prehled/", 78);
			HeroInformation film12 = new HeroInformation(thanos, "Avengers", "Josh Brolin","https://www.csfd.cz/film/241997-avengers/prehled/", 83);
			HeroInformation film13 = new HeroInformation(thanos, "Guardians of the Galaxy", "Josh Brolin","https://www.csfd.cz/film/320638-strazci-galaxie/prehled/", 82);
			HeroInformation film14 = new HeroInformation(thanos, "Avengers: Age of Ultron", "Josh Brolin","https://www.csfd.cz/film/317410-avengers-age-of-ultron/prehled/", 73);
			HeroInformation film15 = new HeroInformation(thanos, "Avengers: Infinity War", "Josh Brolin","https://www.csfd.cz/film/393331-avengers-infinity-war/prehled/", 86);
			HeroInformation film16 = new HeroInformation(thanos, "Avengers: Endgame", "Josh Brolin","https://www.csfd.cz/film/393332-avengers-endgame/prehled/", 83);

			List<HeroInformation> listOfFilms = new ArrayList<>();
			listOfFilms.add(film1);
			listOfFilms.add(film2);
			listOfFilms.add(film3);
			listOfFilms.add(film4);
			listOfFilms.add(film5);
			listOfFilms.add(film6);
			listOfFilms.add(film7);
			listOfFilms.add(film8);
			listOfFilms.add(film9);
			listOfFilms.add(film10);
			listOfFilms.add(film11);
			listOfFilms.add(film12);
			listOfFilms.add(film13);
			listOfFilms.add(film14);
			listOfFilms.add(film15);
			listOfFilms.add(film16);

			heroInformationRepository.saveAll(listOfFilms);
		};
	}
}
