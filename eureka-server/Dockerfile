# Utiliza una imagen base con JDK 17
FROM openjdk:17-jdk-slim

# Crea un directorio para la aplicación
VOLUME /tmp

# Copia el archivo JAR de tu aplicación al contenedor
ADD target/eureka-server.jar eureka-server.jar

# Expone el puerto 8761
EXPOSE 8761

# Define el comando para ejecutar tu aplicación
ENTRYPOINT ["java","-jar","/eureka-server.jar"]
