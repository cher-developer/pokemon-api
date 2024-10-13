Api for searh pokemons 

with diferents endpoint
Find List Abilities from Pokemon by Name
http://localhost:8080/pokemons/ability/{pokemonName}
Find List base_experience from Pokemon by Name
http://localhost:8080/pokemons/base_experience/{pokemonName}
Find List id from Pokemon by Name
http://localhost:8080/pokemons/id/{pokemonName}
Find List name from Pokemon by Name
http://localhost:8080/pokemons/name/{pokemonName}
Find List location_area_encounters from Pokemon by Name
http://localhost:8080/pokemons/location_area_encounters/{pokemonName}
Find List location_area_encounters from Pokemon by Name
http://localhost:8080/pokemons/held_item/{pokemonName}


#Comandos para generar la imagen y crear el contenedor
crear la imagen para la api
docker build .

para correr el contener es con

docker run -p 8080:8080 id_contenedor

run to sonarqube
docker run -d --name sonarqube -e SONAR_ES_BOOSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:latest
