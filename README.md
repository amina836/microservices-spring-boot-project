<h1 align="center">📦 Microservices Project using Spring Boot 3 + Spring Cloud</h1>

<p align="center">
A complete microservices-based system demonstrating real-world distributed system architecture using Spring Boot 3 and Spring Cloud.
</p>

---

## 📌 Overview

This project implements a microservices architecture with:

- API Gateway as a single entry point  
- Eureka Server for service discovery  
- Config Server for centralized configuration  
- Student Microservice  
- School Microservice  
- Inter-service communication using OpenFeign  
- MySQL database for persistence  

---

## 🧱 Architecture Components

- 🚪 API Gateway → Routes all client requests  
- 🔍 Eureka Server → Service registry & discovery  
- ⚙️ Config Server → Centralized configuration management  
- 👩‍🎓 Student Service → Manages student data  
- 🏫 School Service → Manages school data + Feign calls  

---

## ⚙️ Technologies Used

- Java 17  
- Spring Boot 3  
- Spring Cloud  
- Spring Data JPA  
- Spring Cloud Gateway  
- Spring Cloud OpenFeign  
- Eureka Server (Netflix)  
- Spring Cloud Config Server  
- MySQL  
- Maven  

---

## 👩‍🎓 Student Service

### Features:
- Add student  
- Get all students  
- Get students by school ID  

### Base URL:
```http
/api/v1/students
