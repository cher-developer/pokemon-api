FROM openjdk:17-jdk-alpine

#Espacio de Trabajo dentro del contenedor
WORKDIR /app/pokemon-api


#Ruta desde donde se va a copiar el componente . es la carpeta destino = /app, se puede sustituir el . por /app
COPY ./target/pokemon-api-0.0.1-SNAPSHOT.jar .

#Puerto que expone el api
EXPOSE 8080

#Comando para levantar el api dentro del contenedor
ENTRYPOINT ["java", "-jar", "pokemon-api-0.0.1-SNAPSHOT.jar"]