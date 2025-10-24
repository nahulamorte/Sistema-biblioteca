# Sistema-biblioteca

# Sistema de Gestión de Biblioteca

Sistema backend para gestión de biblioteca desarrollado con Spring Boot.

## 🚀 Tecnologías

- Java 17
- Spring Boot 3.2
- Spring Data JPA
- PostgreSQL
- Maven
- Docker

## 📋 Funcionalidades

- CRUD de Autores
- CRUD de Libros
- CRUD de Categorías
- CRUD de Usuarios
- Sistema de Préstamos
- Consultas personalizadas

## 🛠️ Instalación

### Requisitos previos

- JDK 17+
- Docker
- Maven





## 📚 Endpoints

### Autores
- `GET /api/autores` - Obtener todos
- `GET /api/autores/{id}` - Obtener por ID
- `POST /api/autores` - Crear
- `PUT /api/autores/{id}` - Actualizar
- `DELETE /api/autores/{id}` - Eliminar

### Libros
- `GET /api/libros` - Obtener todos
- `GET /api/libros/{id}` - Obtener por ID
- `POST /api/libros` - Crear
- `PUT /api/libros/{id}` - Actualizar
- `DELETE /api/libros/{id}` - Eliminar

## 📊 Base de Datos

El proyecto usa PostgreSQL. Configuración en `application.yml`.
