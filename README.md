# IMOB API

### Technical Information
- Java 17
- Spring Boot 3
- PostgreSQL
- Postman
- Docker

### Postman Collection
``` documentation/imobapi.postman_collection ```

### Using Docker to create postgres database

- Access the directory documentation:
```  /docker-imob ```

- Now, execute the following command: 
``` docker-compose up -d. ```

- Then, you can access pgAdmin at ``` http://localhost:89 ``` and log in with the configured email and password.

| Name            | Value               |
|:----------------|:--------------------|
| POSTGRESQL_HOST | http://localhost:89 |
| POSTGRESQL_USER | postgres            |
| POSTGRESQL_PASS | 1205                |
| POSTGRESQL_DB   | imob                |