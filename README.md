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
`/api/v1/schools`

---
## 🌐 Eureka Server

Service registry for all microservices:  
http://localhost:8761  

---

## 🚪 API Gateway

**Port:** 8222  

Routes:
- `/api/v1/students/**` → Student Service  
- `/api/v1/schools/**` → School Service  

---

## ⚙️ Config Server

**Port:** 8888  

Centralized configs for:
- student-service  
- school-service  
- gateway-service  
- discovery-service  

---
## 🚀 How to Run

1️⃣ Start Config Server  
http://localhost:8888  

---

2️⃣ Start Eureka Server  
http://localhost:8761  

---

3️⃣ Start Microservices  
- Student Service (8090)  
- School Service (8070)  
- API Gateway (8222)  

---

## 🧪 API Examples

➕ Create Student  
POST `/api/v1/students`  

📥 Get Students by School  
GET `/api/v1/students/school/{school-id}`  

🏫 Get School with Students  
GET `/api/v1/schools/with-students/{school-id}`  

---

## ⭐ Features

- Microservices architecture  
- Eureka service discovery  
- API Gateway routing  
- Centralized configuration  
- OpenFeign communication  
- MySQL persistence  

---

## 👨‍💻 Author

Built for learning **Spring Cloud Microservices architecture**.
---

