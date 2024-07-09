Project Description:

This Java project integrates with Gutendex API to search for books and stores the results into a PostgreSQL database. It utilizes Spring Boot for backend development, Spring Data JPA for database interaction, and Maven for dependency management.

Features:

Searches for books using Gutendex API based on title queries.
Stores book information (title, author, language, download count) into a PostgreSQL database.
Includes a RESTful API endpoint (/buscar) to search for books and display results.
Command-line interface (CLI) for interactive book searches and display.
Technologies Used:

Java 17
Spring Boot 3.2.7
Spring Data JPA
PostgreSQL
Maven
Setup Instructions:

Ensure Java 17 and PostgreSQL are installed.
Clone the repository from GitHub.
Configure application.properties with your PostgreSQL database settings.
Build the project using Maven: mvn clean install.
Run the Spring Boot application: mvn spring-boot:run.
Access the application at http://localhost:8080.

Descripción del Proyecto:

Este proyecto Java se integra con la API de Gutendex para buscar libros y almacenar los resultados en una base de datos PostgreSQL. Utiliza Spring Boot para el desarrollo del backend, Spring Data JPA para la interacción con la base de datos y Maven para la gestión de dependencias.

Características:

Busca libros utilizando la API de Gutendex basada en consultas de título.
Almacena la información de los libros (título, autor, idioma, número de descargas) en una base de datos PostgreSQL.
Incluye un endpoint API RESTful (/buscar) para buscar libros y mostrar resultados.
Interfaz de línea de comandos (CLI) para búsquedas interactivas de libros y visualización.
Tecnologías Utilizadas:

Java 17
Spring Boot 3.2.7
Spring Data JPA
PostgreSQL
Maven
Instrucciones de Configuración:

Asegúrese de tener instalados Java 17 y PostgreSQL.
Clone el repositorio desde GitHub.
Configure application.properties con la configuración de su base de datos PostgreSQL.
Construya el proyecto usando Maven: mvn clean install.
Ejecute la aplicación Spring Boot: mvn spring-boot:run.
Acceda a la aplicación en http://localhost:8080.
