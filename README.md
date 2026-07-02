# 🎓 Student Management System

A console-based **Student Management System** built using **Java, JDBC, and MySQL** that performs CRUD operations and demonstrates real-world backend development concepts such as database connectivity, layered architecture, authentication, file handling, and object-oriented programming.

---

## 🚀 Features

✅ Admin Login Authentication  
✅ Add Student Details  
✅ View All Students  
✅ Search Student by ID  
✅ Delete Student  
✅ Generate Student Report (.txt file)  
✅ Store Data in MySQL Database  
✅ Grade Calculation based on Marks  
✅ Modular Package Structure (Industry-style architecture)

---

## 🛠 Tech Stack

- **Java**
- **JDBC (Java Database Connectivity)**
- **MySQL**
- **SQL**
- **VS Code**
- **Object-Oriented Programming (OOP)**
- **File Handling**
- **JSON Configuration**

---

## 📂 Project Structure

src/
│
├── Main.java
│
├── config/
│ └── DBConnection.java
│
├── model/
│ └── Student.java
│
├── dao/
│ └── StudentDAO.java
│
├── service/
│ └── StudentService.java
│
├── util/
│ ├── PerformanceAnalyzer.java
│ └── ReportGenerator.java
│
└── auth/
└── AdminLogin.java

database/
└── student_management.sql

lib/
└── mysql-connector-j.jar

.vscode/
└── settings.json

---

## ⚙️ How It Works

### 1. User Authentication

The admin logs into the system using username and password.

Example SQL Query:

```sql
SELECT * FROM admins WHERE username=? AND password=?
