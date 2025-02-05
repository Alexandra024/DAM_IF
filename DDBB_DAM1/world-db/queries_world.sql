USE world; -- database

SHOW TABLES;
-- preview tables
SELECT * FROM countrylanguages;
SELECT * FROM country;
SELECT * FROM city;


--
SELECT name,language FROM country
JOIN countrylanguage 
ON country.code = countrylanguage.countrycode;


