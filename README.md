# eureka-client

## Tutorial

- https://www.baeldung.com/spring-cloud-netflix-eureka

## Spring Initializr

### Site
- https://start.spring.io/

### Specifications

- Spring Boot version: 2.1.4

- Group: com.springcloudnetflix
- Artifact: demo

## application.yaml
```
server:
    port: 8761
eureka:
    client:
        registerWithEureka: false
        fetchRegistry: false
```

## Running at
- http://localhost:8761/