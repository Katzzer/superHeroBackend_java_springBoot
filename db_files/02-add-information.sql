-- -----------------------------------------------------
-- Schema super-hero-films
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `super-hero-films`;

CREATE SCHEMA `super-hero-films`;
USE `super-hero-films` ;

-- -----------------------------------------------------
-- Table `super-hero-films`.`hero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `super-hero-films`.`hero` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `hero_name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table `super-hero-films`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `super-hero-films`.`informations` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `film_name` VARCHAR(255) DEFAULT NULL,
  `actor_name` VARCHAR(255) DEFAULT NULL,
  `csfd_url` VARCHAR(255) DEFAULT NULL,
  `csfd_rating` BIGINT(2) DEFAULT NULL,
  `category_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `sh_name` (`category_id`),
  CONSTRAINT `sh_name` FOREIGN KEY (`category_id`) REFERENCES `hero` (`id`)
) 
ENGINE=InnoDB
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Categories
-- -----------------------------------------------------

INSERT INTO hero(hero_name) VALUES ('Batman');
INSERT INTO hero(hero_name) VALUES ('Ironman');
INSERT INTO hero(hero_name) VALUES ('Spiderman');
INSERT INTO hero(hero_name) VALUES ('Thor');
INSERT INTO hero(hero_name) VALUES ('Captain America');
INSERT INTO hero(hero_name) VALUES ('Thanos');

-- -----------------------------------------------------
-- Informations
-- -----------------------------------------------------
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Batman Begins', 'Christian Bale','https://www.csfd.cz/film/136224-batman-zacina/prehled/', 86, 1);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Batman', 'Michael Keateon','https://www.csfd.cz/film/1069-batman/prehled/', 81, 1);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Iron Man', 'Robert Downey Jr.','https://www.csfd.cz/film/223262-iron-man/prehled/', 82, 2);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Iron Man 2', 'Robert Downey Jr.','https://www.csfd.cz/film/242570-iron-man-2/prehled/', 82, 2);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Spider-Man', 'Tobey Maguire','https://www.csfd.cz/film/7563-spider-man/prehled/', 76, 3);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Spider-Man 2', 'Tobey Maguire','https://www.csfd.cz/film/116933-spider-man-2/prehled/', 74, 3);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Thor', 'Chris Hemsworth','https://www.csfd.cz/film/234300-thor/prehled/', 75, 4);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Thor: The Dark World', 'Chris Hemsworth','https://www.csfd.cz/film/299231-thor-temny-svet/prehled/', 72, 4);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Thor: Ragnarok', 'Chris Hemsworth','https://www.csfd.cz/film/374525-thor-ragnarok/prehled/', 82, 4);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Captain America: The First Avenger', 'Chris Evans','https://www.csfd.cz/film/227773-captain-america-prvni-avenger/prehled/', 68, 5);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Captain America: The Winter Soldier', 'Chris Evans','https://www.csfd.cz/film/303069-captain-america-navrat-prvniho-avengera/prehled/', 78, 5);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Avengers', 'Josh Brolin','https://www.csfd.cz/film/241997-avengers/prehled/', 83, 6);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Guardians of the Galaxy', 'Josh Brolin','https://www.csfd.cz/film/320638-strazci-galaxie/prehled/', 82, 6);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Avengers: Age of Ultron', 'Josh Brolin','https://www.csfd.cz/film/317410-avengers-age-of-ultron/prehled/', 73, 6);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Avengers: Infinity War', 'Josh Brolin','https://www.csfd.cz/film/393331-avengers-infinity-war/prehled/', 86, 6);
INSERT INTO INFORMATIONS (FILM_NAME, ACTOR_NAME, CSFD_URL, CSFD_RATING, CATEGORY_ID) VALUES ('Avengers: Endgame', 'Josh Brolin','https://www.csfd.cz/film/393332-avengers-endgame/prehled/', 83, 6);