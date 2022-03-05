INSERT INTO actor(name,gender,birthday) 
VALUES ('Morgan Freeman','M','1965-01-01');

INSERT INTO actor(name,gender,birthday) 
VALUES ('Kate Winslet','F','1963-10-5'),
('Jennifer Lawrence','F','1990-8-15');

SELECT * FROM actor;

SELECT name FROM actor;
SELECT id,name FROM actor;

SELECT id,name as 'Actor Name',curdate() as 'CURRENT_DATE' FROM actor;

SELECT id,name as 'Actor Name',TIMESTAMPDIFF(YEAR,birthday,CURDATE()) AS age 
FROM actor;

SELECT id,name as 'Actor Name',TIMESTAMPDIFF(YEAR,birthday,CURDATE()) AS age 
FROM actor
WHERE TIMESTAMPDIFF(YEAR,birthday,CURDATE()) < 50;

SELECT id,name as 'Actor Name',TIMESTAMPDIFF(YEAR,birthday,CURDATE()) AS age,gender 
FROM actor
WHERE TIMESTAMPDIFF(YEAR,birthday,CURDATE()) < 50 AND gender='F';

SELECT *
FROM actor
WHERE name like '%Robert%'
ORDER BY birthday;

SELECT *
FROM actor
WHERE name like '%Robert%'
ORDER BY birthday DESC;

SELECT * FROM actor
WHERE birthday <
(
	SELECT birthday FROM actor
	WHERE ID =6
)

SELECT *
FROM actor
WHERE year(birthday) IN (1965,1972);

SELECT *
FROM actor
WHERE exists (
	SELECT * from actor 
	WHERE year (birthday) =1972
);

SELECT *
FROM actor
WHERE exists (
	SELECT * from actor 
	WHERE year (birthday) =1973
);

DELETE FROM actor
WHERE ID in (9,10)

UPDATE actor
SET birthday = '1937-6-1'
WHERE ID=1

UPDATE actor
SET birthday = '1937-6-1',
gender = gender
WHERE ID=1

SELECT *
FROM actor,actor_in_movie
WHERE actor.id = actor_in_movie.actor_id

SELECT * FROM actor
CROSS JOIN actor_in_movie
WHERE actor.id = actor_in_movie.actor_id
AND actor_in_movie.movie_id=2;

SELECT *
FROM actor,actor_in_movie,movie
WHERE actor.id = actor_in_movie.actor_id
AND movie.id = actor_in_movie.movie_id
AND actor_in_movie.movie_id=2;

SELECT actor.name, movie.title
FROM actor,actor_in_movie,movie
WHERE actor.id = actor_in_movie.actor_id
AND movie.id = actor_in_movie.movie_id
AND actor_in_movie.movie_id=2;