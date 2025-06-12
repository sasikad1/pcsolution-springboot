# 🗄️ PC Solution - Backend (Spring Boot)

This is the **backend API** for the PC Solution full-stack application, built with **Spring Boot**.  
It handles authentication, user management, items, categories, orders, and invoice generation.

---

## 🔗 Features

### 🔐 1. User Management
- Register new users.
- Authenticate users via login.
- Role-based access control (Admin/User).

📸 ![User API](screenshots/backend-user-api.png)

---

### 📦 2. Category & Item APIs
- CRUD operations for categories.
- CRUD operations for items under categories.

📸 ![Category API](screenshots/backend-category-api.png)  
📸 ![Item API](screenshots/backend-item-api.png)

---

### 🛒 3. Order Management
- Create new orders for authenticated users.
- Edit orders by adding/removing items.
- Mark orders as complete.

📸 ![Order API](screenshots/backend-order-api.png)

---

### 📄 4. Invoice Generation
- Generate PDF invoices for completed orders.
- Store invoices for download.

📸 ![Invoice API](screenshots/backend-invoice-api.png)

---

## 🚀 How to Run the Backend

### 1. Clone the backend repository:

```bash
git clone https://github.com/sasikad1/pcsolution-backend.git
cd pcsolution-backend
```

### 2. Open the project in **IntelliJ IDEA** or **VS Code**.

### 3. Make sure you have **JDK 11+** installed.

### 4. Run the Spring Boot application:

- From IDE: Run the main class `com.example.PcSolutionApplication`

- Or from terminal:

```bash
./mvnw spring-boot:run
```
### 5. The backend server will start at:
http://localhost:8080

## 🧪 Testing API Endpoints

You can test the backend API endpoints using **Postman** or directly from the React frontend app.

- **Postman:**  
  Import the API endpoints or manually create requests in Postman to interact with the backend.  
  Make sure to include the **JWT token** in the `Authorization` header for protected routes.

- **React Frontend:**  
  The React app communicates with the backend via these API endpoints.  
  When you run the React frontend (`npm start`), it sends requests to the backend server at `http://localhost:8080`.  

### Example:

- Login endpoint:  
  `POST http://localhost:8080/api/auth/login`  
  with JSON body:
  ```json
  {
    "username": "your-username",
    "password": "your-password"
  }


🔗 API Documentation
You can test API endpoints using Postman or Swagger UI (if configured):
http://localhost:8080/swagger-ui.html (if swagger enabled)

🔐 Authentication
The backend uses JWT token based authentication.

Protects all routes except login and user registration.

Tokens must be passed in Authorization headers for protected endpoints.

📁 Screenshots Folder
All backend-related screenshots should be stored in the /screenshots folder.

👨‍💻 Developed By
Sasika Dilum
📧 Email: sasikadilum40@gmail.com
📍 Gampaha, Sri Lanka

