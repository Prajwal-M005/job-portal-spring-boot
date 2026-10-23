 Job Portal REST API
 
About the Project-
I built this project to practice developing REST APIs using Java and Spring Boot. The application helps manage job listings,
including adding new jobs, viewing job details,updating existing records, deleting jobs, and searching for jobs based on title, company, or location.
While building this project, I got practical experience working with Spring Boot, connecting an application to a MySQL database, and testing APIs using Postman and Swagger.

 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman
- Swagger

What Can It Do?

- Add a new job listing or add multiple jobs.
- View all available job listings or find a job using its ID.
- Update job details or change only selected fields.
- Delete a job listing.
- Search for jobs by title, company name, or location.
- Validate input data and handle application errors.
- Display job listings in pages and sort them by salary.
- Save and retrieve job information from a MySQL database.

 API Endpoints
 
 1. Create a Job

Method: POST
Endpoint: /job/save
Purpose: Add a new job listing.

2. Create Multiple Jobs

Method: POST
Endpoint: /job/saveall
Purpose: Add multiple job listings.

3. Get All Jobs

Method: GET
Endpoint: /job/findall
Purpose: Retrieve all job listings.

4. Get Job by ID

Method: GET
Endpoint: /job/find/{id}
Purpose: Retrieve a job using its ID.

5. Update a Job

Method: PUT
Endpoint: /job/update/{id}
Purpose: Update the complete job details.

6. Partially Update a Job

Method: PATCH
Endpoint: /job/partialupdate/{id}
Purpose: Update selected job fields.

7. Delete a Job

Method: DELETE
Endpoint: /job/delete/{id}
Purpose: Delete a job listing.

8. Search by Job Title

Method: GET
Endpoint: /job/search/title?title=Java
Purpose: Search for jobs by title.

9. Search by Company

Method: GET
Endpoint: /job/search/company?companyName=Infosys
Purpose: Search for jobs by company name.

10. Search by Location

Method: GET
Endpoint: /job/search/location?location=Mysore
Purpose: Search for jobs by location.

11. Pagination

Method: GET
Endpoint: /job/pagination?pageno=0&size=2
Purpose: Retrieve job listings page by page.



 How to Run the Project

1. Install Java and MySQL on your computer.
2. Clone this repository or download the project files.
3. Import the project into Eclipse or another Java IDE.
4. Create the MySQL database and configure the database connection in `application.properties`.
5. Run the Spring Boot application.
6. Use Postman or Swagger to send requests and check the API responses, provided Swagger is configured correctly.

Make sure to configure your own database credentials before running the application.

 What I Learned
 
- Creating REST APIs using Spring Boot.
- Using controllers, services, and repositories to organize application code.
- Performing database operations with Spring Data JPA and MySQL.
- Implementing CRUD operations, search, pagination, and sorting.
- Validating request data and handling exceptions.
- Testing API endpoints using Postman and Swagger.

Developer - Prajwal M
GitHub: https://github.com/Prajwal-M005
Project Repository: https://github.com/Prajwal-M005/job-portal-spring-boot
