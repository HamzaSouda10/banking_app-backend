# 🏦 Spring Boot Banking Application

## 📌 Project Overview
This project is a **backend banking application** built with **Spring Boot**.  
It simulates the main operations of a banking system, including account creation, deposits, withdrawals, transfers, and balance consultation.  

The goal of this Mini project is to demonstrate how to design and implement a **RESTful API** for a banking domain using modern backend practices.


## 📂 Project Structure
This project follows a clean **Spring Boot layered architecture**, ensuring separation of concerns and maintainability:

- **Entity**: Represents the database tables using JPA .
- **DTO (Data Transfer Object)**: Used to transfer data between layers without exposing entities directly.
- **Mapper**: Converts between Entities and DTOs (can be implemented with MapStruct, ModelMapper, or manually).
- **Repository**: Interfaces extending Spring Data JPA for database operations.
- **Service**: Contains the business logic and interacts with repositories.
- **Controller**: Defines REST API endpoints and handles HTTP requests/responses.


---

## ⚙️ Tech Stack
- **Java 17**
- **Spring Boot 3.3.4**
- **Spring Data JPA** (Hibernate)
- **Spring Web (REST API)**
- **MYSQL** (for persistence, configurable)
- **Lombok** (boilerplate reduction)
- **Maven** (build & dependency management)

---



## 🔑 Core Features
✅ Create customer accounts  
✅ Open bank accounts (current / savings)  
✅ Deposit money into an account  
✅ Withdraw money from an account  
✅ Transfer money between accounts  
✅ Track transaction history  
✅ Get account balance  

