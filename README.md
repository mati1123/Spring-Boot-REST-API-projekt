# 📚 Spring Boot REST API – BookAPI

Detta projekt är ett enkelt REST API byggt med **Spring Boot**, som hanterar en bokdatabas med hjälp av **Spring Web**, **MySQL** och **Spring Data JPA**. Projektet innehåller CRUD-funktionalitet för böcker (Create, Read, Update, Delete).

---

## 🛠️ Teknikstack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Postman (för testning)

---

## 📁 Projektstruktur

```
bookapi/
 ├── controller/       # REST API endpoints (BookController)
 ├── model/            # Modellklass Book
 ├── repository/       # BookRepository (interface mot databasen)
 ├── application.properties  # Konfiguration
```

---

## 📌 Funktioner

| HTTP-metod | Endpoint       | Funktion                       |
|------------|----------------|--------------------------------|
| GET        | `/books`       | Hämta alla böcker              |
| GET        | `/books/{id}`  | Hämta en bok via ID            |
| POST       | `/books`       | Skapa en ny bok                |
| PUT        | `/books/{id}`  | Uppdatera en bok               |
| DELETE     | `/books/{id}`  | Radera en bok                  |

---

## 🧪 Testning med Postman

Exempel på JSON-data vid `POST /books`:

```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "publishedDate": "2008-08-01"
}
```

---

## ⚙️ Databaskonfiguration

I `application.properties` (lösenordet är anonymiserat):

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
spring.datasource.username=your-username
spring.datasource.password=your-password
```

---

## ✅ Att köra projektet

1. Starta din MySQL-databas.
2. Ändra `application.properties` med dina riktiga databasuppgifter.
3. Kör projektet i din IDE 

---

## 📌 Syfte

Detta projekt är gjort som övning inom systemutveckling och visar hur man bygger ett backend-API med Java och Spring Boot.

---

## 🧠 Inlärning

Under projektets gång har jag lärt mig:
- Skapa REST-endpoints med @RestController och Spring Web
- Förstå skillnaden mellan GET, POST, PUT, DELETE
- Använda Spring Data JPA för databasoperationer
- Arbeta med MySQL & databaskoppling
- Hantera JSON med @RequestBody och @PathVariable
- Testa API:et med Postman

---
