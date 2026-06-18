📦 Microservices Project using Spring Boot 3 + Spring Cloud

A complete microservices-based system built using Spring Boot 3 and Spring Cloud ecosystem, demonstrating real-world distributed system architecture.

📌 Overview

This project implements a microservices architecture with:

API Gateway as a single entry point
Eureka Server for service discovery
Config Server for centralized configuration
Student Microservice
School Microservice
Inter-service communication using OpenFeign
MySQL database for persistence
─────────────────────────────
🧱 Architecture Components
API Gateway → Routes all client requests
Eureka Server → Service registry & discovery
Config Server → Centralized configuration management
Student Service → Manages student data
School Service → Manages school data and fetches students via Feign Client
─────────────────────────────
⚙️ Technologies Used
Java 17
Spring Boot 3
Spring Cloud
Spring Data JPA
Spring Cloud Gateway
Spring Cloud OpenFeign
Eureka Server (Netflix)
Spring Cloud Config Server
MySQL
Maven
─────────────────────────────
👩‍🎓 Student Service
Features:
Add student
Get all students
Get students by school ID
Base URL:
/api/v1/students
─────────────────────────────
🏫 School Service
Features:
Add school
Get all schools
Get school with students (via OpenFeign)
Base URL:
/api/v1/schools
─────────────────────────────
🔗 Inter-Service Communication

Uses OpenFeign for communication between services:

@FeignClient(name = "student-service")
─────────────────────────────
🌐 Eureka Server

Service registry for all microservices.

http://localhost:8761
─────────────────────────────
🚪 API Gateway

Single entry point for all services.

Port: 8222

Routes:
/api/v1/students/** → Student Service
/api/v1/schools/** → School Service
─────────────────────────────
⚙️ Config Server

Centralized configuration server.

Port: 8888

Stores configs for:
student-service
school-service
gateway-service
discovery-service
─────────────────────────────
🗄️ Database (MySQL)

Each service uses MySQL database.

Databases:
student_db
school_db
Configuration:
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
Create Databases:
CREATE DATABASE student_db;
CREATE DATABASE school_db;
─────────────────────────────
🚀 How to Run
1️⃣ Start Config Server
http://localhost:8888
2️⃣ Start Eureka Server
http://localhost:8761
3️⃣ Start Microservices
Student Service (8090)
School Service (8070)
API Gateway (8222)
─────────────────────────────
🧪 API Examples
➕ Create Student
POST /api/v1/students
📥 Get Students by School
GET /api/v1/students/school/{school-id}
🏫 Get School with Students
GET /api/v1/schools/with-students/{school-id}
─────────────────────────────
⭐ Features
Microservices architecture
Service discovery with Eureka
API Gateway routing
Centralized configuration
Inter-service communication (Feign)
MySQL persistence
─────────────────────────────
👨‍💻 Author

Microservices project built for learning Spring Cloud architecture and real-world backend system design
