# Employee Management System

## Project Overview
The Employee Management System is a Spring Boot web application designed to efficiently manage employee data. It allows users to perform CRUD operations (Create, Read, Update, Delete) on employee records, search for employees by name or department, and view detailed information for each employee. This application is built using modern web development practices with a focus on simplicity and usability.

## Features
1. **Add New Employees:** Fill out a form to add employee details, including name, department, join date, and salary.
2. **Edit Employee Information:** Update existing employee details.
3. **Delete Employees:** Remove an employee record.
4. **Search Functionality:** Search employees by name or department.
5. **View Employee Details:** Access detailed information about individual employees.
6. **Responsive Interface:** Simple and intuitive user interface with Thymeleaf templates and CSS for styling.

## Tech Stack
- **Backend:** Java, Spring Boot
- **Frontend:** Thymeleaf, HTML, CSS
- **Database:** H2 Database
- **Build Tool:** Maven
- **Programming Language:** Java

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/YuvasriP-71225/EmployeeManagement_System.git
cd EmployeeManagement_System
```

### 2. Configure the Database
The application uses the H2 Database with in-memory storage. No additional setup is required for the database.

To access the console:
1. Run the application.
2. Navigate to [H2 Console](http://localhost:8080/h2-console).
3. Enter the JDBC URL, username, and password as configured in the `application.properties` file.

### 3. Build and Run the Application
```bash
mvn clean install
mvn spring-boot:run
```
The application will start running on [http://localhost:8080/employees](http://localhost:8080/employees).

## Endpoints
- **View All Employees:** `GET /employees`
- **Add New Employee:** `GET /employees/add` and `POST /employees/add`
- **Edit Employee:** `GET /employees/edit/{id}` and `POST /employees/edit/{id}`
- **Delete Employee:** `GET /employees/delete/{id}`
- **Search Employee:** `GET /employees/search?keyword={keyword}`
- **View Employee Details:** `GET /employees/{id}`
## Screenshots
View all screenshots here- (screenshots_files)-folder

## Future Enhancements
- **Role-Based Authentication:** Add user roles for Admin and Employee.
- **Export Data:** Option to download employee data as CSV or Excel.
- **Pagination:** Handle large datasets by implementing pagination.

## Contribution Guidelines
Contributions are welcome! Feel free to fork the repository, make changes, and create a pull request.
