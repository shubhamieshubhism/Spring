<div align="center">

# 🌱 Spring & Spring Boot Learning Journey

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge)
![Spring](https://img.shields.io/badge/Spring-Framework-brightgreen?style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-success?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Learning-informational?style=for-the-badge)

📘 **A hands-on repository documenting my journey into Spring & Spring Boot**  
Building backend systems the *right way* — clean, scalable, and production-ready.

</div>

---

## 🎯 Purpose of This Repository

> Learn Spring & Spring Boot **by building real backend applications**,  
> understanding **how things work internally**, not just using annotations.

This repository serves as:
- A **learning notebook**
- A **reference project**
- A **portfolio showcase**

---

## 🧰 Tech Stack (Visual Overview)

| Layer | Technology |
|-----|-----------|
| Language | **Java 21** |
| Framework | **Spring Framework** |
| Backend | **Spring Boot** |
| Web | **Spring MVC / REST APIs** |
| Persistence | **Spring Data JPA / Hibernate** |
| Build Tool | **Maven** |
| Database | **H2 / MySQL / PostgreSQL** |
| Testing | **JUnit / Mockito** |
| Version Control | **Git & GitHub** |

---

## 🧠 Concepts Covered

### 🌿 Spring Core
- Inversion of Control (IoC)
- Dependency Injection
- Bean Scopes & Lifecycle
- Configuration (Annotations vs XML)
- ApplicationContext

### 🚀 Spring Boot
- Auto-Configuration
- Starter Dependencies
- Profiles (dev / test / prod)
- Embedded Tomcat
- Configuration Management

### 🌐 Web & REST APIs
- RESTful Design Principles
- `@RestController`
- Request / Response Mapping
- Exception Handling (`@ControllerAdvice`)
- HTTP Status Management

### 🗄️ Data & Persistence
- JPA & Hibernate
- Entity Mapping
- Relationships
- Pagination & Sorting
- Custom Queries

---

## 🏗️ Project Architecture (Visual)

```text
┌─────────────────────────────┐
│        Controller Layer     │
│  (Handles HTTP Requests)    │
└──────────────┬──────────────┘
               │
┌──────────────▼──────────────┐
│         Service Layer       │
│  (Business Logic)           │
└──────────────┬──────────────┘
               │
┌──────────────▼──────────────┐
│       Repository Layer      │
│  (Database Interaction)     │
└──────────────┬──────────────┘
               │
┌──────────────▼──────────────┐
│           Database          │
└─────────────────────────────┘
