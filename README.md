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


Ruta para ver la documentacion de swagger
http://localhost:8080/doc/swagger-ui/index.html

#Comandos para generar la imagen y crear el contenedor
crear la imagen para la api
docker build .

mostrar imagenes
docker images

para correr el contener es con
docker run -d --name pokemon-api -p 8080:8080  id-imagen

1.- descarga la imagen de sonaquebe
docker pull sonarqube



2. run to sonarqube  image
docker run -d --name sonarqube -e SONAR_ES_BOOSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:latest

3. entrar con a la aplicacion localhost:9000
  3.1 user admin
  3.2 password amin
  3.3 Cambiar el password por el desesado
  3.4 en la siguiente linea agregar el usuario y el password
4. comando para ejecutar sonar quebe
mvn  clean verify sonar:sonar -D sonar.toke=ley sonar -D sonar.login=user -D sonar.password=password
