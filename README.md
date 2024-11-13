Overview
This project is a microservices-based application built with Java Spring Boot. The application demonstrates the architecture and deployment of microservices, covering key functionalities such as service discovery, API gateway routing, and inter-service communication. Each microservice has a specific domain and communicates via REST APIs.

Project Structure
The project is organized into three microservices and related components:

Service Discovery (Eureka Server): Manages service registration and discovery for inter-service communication.
API Gateway (Spring Cloud Gateway): Routes client requests to appropriate microservices.
Config Server: Centralized configuration management for all microservices
Inventory: Handles specific business logic.
Product: Complements product by handling related functions (e.g., product Service).
Order: Complements order by handling related functions (order service) .Additional business functionality.

Technologies Used
Java 17
Spring Boot 3.x
Spring Cloud (Eureka, Config Server, Gateway)
Docker (for containerization)
MySQL (database for persistence layer)
Swagger (API documentation)
Junit & Mockito (unit testing)

Prerequisites
Before setting up the project, ensure you have the following installed:

Java 17 or higher
Maven or Gradle
Docker (for containerized deployment)
Git
MySQL

Accessing Services :
Inventory service :- http://localhost:8080
Product service   :- http://localhost:8082
Order             :- http://localhost:8081
