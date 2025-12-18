# Project README

## 📌 Project Overview

This project is a **Java-based application** developed using **IntelliJ IDEA** with **MySQL** as the backend database. It demonstrates core concepts of Java programming along with database connectivity using JDBC.

---

## 🛠 Software Requirements

* Java JDK **17 or 21**
* IntelliJ IDEA (Community / Ultimate)
* MySQL Server **8.x**
* MySQL Workbench
* MySQL Connector/J (JDBC Driver)

---

## 📂 Project Setup

### Step 1: Unzip the Project

1. Right-click the `.zip` file
2. Select **Extract All**
3. Open the extracted folder

---

### Step 2: Open Project in IntelliJ

1. Open **IntelliJ IDEA**
2. Click **File → Open**
3. Select the extracted project folder
4. Wait until indexing completes

---

## 🗄️ Database Configuration (MySQL)

### Start MySQL Server (Using MySQL Workbench)

1. Open **MySQL Workbench**
2. On the home screen, click **Local Instance**
3. Enter your MySQL **password**
4. If the server is stopped, click **Start Server**
5. Server status should show **Running**

---

### Create Database

Open MySQL Workbench and run:

```sql
CREATE DATABASE project_db;
```

### Configure Database Connection

Update the database details in your Java configuration file:

```properties
jdbc.url=jdbc:mysql://localhost:3306/project_db
jdbc.username=root
jdbc.password=your_password
```

### Add MySQL Connector

* Download **MySQL Connector/J**
* Add it to **Project Structure → Libraries** (if not using Maven)

---

## ▶️ How to Run the Project

1. Locate the file containing:

```java
public static void main(String[] args)
```

2. Right-click the file
3. Select **Run**

---

## 📊 Display Data Using MySQL Workbench

To view records stored in the database:

```sql
USE employee_db;
SELECT * FROM employee;
```

### Alternative (Without USE command)

```sql
SELECT * FROM employee_db.employee;
```

---

## ❗ Common Issues & Fixes

### Java SDK Not Found

* Go to **File → Project Structure**
* Set **Project SDK** to JDK 17 or 21

### Database Connection Error

* Ensure MySQL server is running
* Verify database name, username, and password
* Check JDBC driver is added correctly

---

## 📁 Typical Project Structure

```
project-folder/
│── src/
│   └── Main.java
│── lib/ (JDBC driver if used)
│── README.md
```

---

## 👨‍💻 Author

Vivek

---

## ✅ Notes

* Run the project only from **IntelliJ IDEA**
* Do not rename package folders
* Make sure database is created before running

---

Happy Coding 🚀
