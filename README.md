# 🔗 One-To-One Unidirectional Mapping – Spring Boot

This project demonstrates a **One-to-One Unidirectional relationship** using **Spring Boot, Spring Data JPA, Hibernate, and MySQL**. It provides RESTful APIs to perform complete CRUD operations and shows how entity relationships are handled in a layered architecture following best backend development practices.

---

## 🚀 Tech Stack

- Java 17  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- MySQL  
- Maven  
- Lombok  
- STS / Eclipse  
- Postman  

---

## 📂 Project Structure

src/main/java  
├── controller → Handles HTTP requests  
├── service → Business logic  
├── repository/dao → Database interaction  
├── entity → JPA entity classes  

src/main/resources  
└── application-example.properties  

---

## 🔗 JPA Mapping

This project uses:

- `@OneToOne`
- `@JoinColumn`

### ✔ Unidirectional Relationship
Only one entity maintains the reference of the other and manages the foreign key.

---

## ⚙️ Features

✔ One-to-One Unidirectional Mapping  
✔ Layered Architecture  
✔ REST API (CRUD operations)  
✔ MySQL Integration  
✔ Clean and maintainable code  
✔ Maven-based project  

---

## ▶️ How to Run the Project

### 1️⃣ Clone the repository

bash
git clone https://github.com/Atharva0421/One-To-One-UniDirectional-Mapping.git

###2️⃣ Configure the database

Create your own application.properties using the reference:

src/main/resources/application-example.properties


Update with your:

Database name

Username

Password

3️⃣ Run the application

Run as Spring Boot App

📌 API Endpoints

| Method | Endpoint      | Description      |
| ------ | ------------- | ---------------- |
| POST   | /save         | Save data        |
| GET    | /getAll       | Get all records  |
| GET    | /getById/{id} | Get record by ID |
| PUT    | /update/{id}  | Update record    |
| DELETE | /delete/{id}  | Delete record    |


🧠 Key Learnings

One-to-One mapping in JPA

Unidirectional vs Bidirectional relationships

Hibernate foreign key management

Spring Boot project structure

GitHub project security (excluding application.properties)

🔒 Security

Sensitive configuration files are not pushed to GitHub.
Use application-example.properties to create your local configuration.

👨‍💻 Author

Atharva Dhawale
GitHub: https://github.com/Atharva0421

