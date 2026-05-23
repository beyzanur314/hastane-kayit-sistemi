# 🏥 Hospital Appointment System (HAS) - Spring Boot & MSSQL

This project is a Full-Stack web application that allows patients to book appointments online. It has been developed using Layered Architecture.

## 🚀 Features

* **User Management:** Secure login and new patient registration using T.C. ID Number (National ID) and password.
* **Dynamic Appointment System:** Hierarchical filtering based on City -> District -> Hospital.
* **Live Data:** Up-to-date doctor lists fetched from the backend (Spring Boot) via Fetch API.
* **Appointment Tracking:** Listing active appointments and the ability to cancel them when requested.

## 🛠 Technologies Used

* **Backend:** Java 17, Spring Boot 3.x, Spring Data JPA
* **Frontend:** HTML5, CSS3 (Bootstrap 5), JavaScript (Vanilla ES6+)
* **Database:** Microsoft SQL Server (MSSQL)
* **Tools & Build:** IntelliJ IDEA, Maven, Git/GitHub

## 📁 Project Structure

* `controller/`: The layer where API endpoints are managed.
* `service/`: The layer where business logic is executed.
* `entity/`: Java classes mapping to database tables (`Patient`, `Doctor`, `Appointment`).
* `repository/`: The layer where database queries (Spring Data JPA) are managed.
* `static/`: Frontend source files (`index.html`, CSS, JS).

## 🔧 Installation & Setup

1. Create a database named `HospitalDB` on your SQL Server instance.
2. Update the database credentials (username and password) in the `application.properties` file.
3. Run the project and navigate to `http://localhost:8080` in your browser.
  <img width="536" height="526" alt="image" src="https://github.com/user-attachments/assets/581de2bf-5cd0-4d1a-bd98-7b881414b558" />
