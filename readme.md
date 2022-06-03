# Micro-services using Spring Boot, Docker & Kubernetes

Creating two Micro services for Employee and Departments on Port 9002 & 9001

Setting up a Service Registry using Eureka Server
Listening at Port 8761

## Project Backlog

Implement Resilience 4j CircuitBreaker, Retry and Rate Limiter
Deploy using Docker and kubernetes
Add docker File and make container

### Microservices Architecture

![homepage](images/microservices-architecture.png)

### Eureka Service Registry

![homepage](images/eureka-dashboard.png)

### API Gateway

API gateway is running on http://localhost:9191/

### REST Client POSTMAN Examples

Create departments by using a micro service using the API gateway
![homepage](images/post-department.png)

Create User by using another microservice
![homepage](images/post-employee.png)

Get Employee by calling employee service and that calls department service internally
![homepage](images/get-employee.png)

inspired from https://github.com/shabbirdwd53/Springboot-Microservice
Hysterix has been deprecated and replaced with Resilience4j
