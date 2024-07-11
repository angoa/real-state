# Inmuebles API

API RESTful para gestionar inmuebles utilizando Spring Boot, H2 y Swagger.

## Requisitos

- Java 17
- Maven

## Ejecución

1. Clonar el repositorio.
2. Navegar al directorio del proyecto.
3. Ejecutar `mvn spring-boot:run`.
4. Acceder a la consola H2 en `http://localhost:8080/h2-console`.
   - JDBC URL: jdbc:h2:mem:inmuebles_db
   - User Name: sa
   - Password: password
5. Acceder a Swagger UI en `http://localhost:8080/swagger-ui.html`.

## Endpoints

- `GET /api/inmuebles` - Obtener la lista de todos los inmuebles.
- `GET /api/inmuebles/{id}` - Obtener los detalles de un inmueble específico por su ID.
- `POST /api/inmuebles` - Crear un nuevo inmueble.
- `PUT /api/inmuebles/{id}` - Actualizar la información de un inmueble existente.
- `DELETE /api/inmuebles/{id}` - Eliminar un inmueble por su ID.
