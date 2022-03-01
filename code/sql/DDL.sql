

CREATE TABLE `imdb`.`movie` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(255) NULL,
  `year` INT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `imdb`.`actor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  `gender` VARCHAR(1) NULL,
  `birthday` DATETIME NULL,
  PRIMARY KEY (`id`));
CREATE TABLE `director` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `imdb`.`actor_in_movie` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `actor_id` INT NULL,
  `movie_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `actor_id_idx` (`actor_id` ASC) VISIBLE,
  INDEX `movie_id_idx` (`movie_id` ASC) VISIBLE,
  CONSTRAINT `actor_id`
    FOREIGN KEY (`actor_id`)
    REFERENCES `imdb`.`actor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `movie_id`
    FOREIGN KEY (`movie_id`)
    REFERENCES `imdb`.`movie` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
