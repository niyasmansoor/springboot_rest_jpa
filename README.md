A demo for doing CRUD operations using spring boot , jpa , rest using in memory H2 database

Install
-------

 - Download this eclipse project from this repo
 
 - Extract to eclipse workspace
 
 - Import this project in ecipse
 

Build & Run
-----------

 - Right click on the project -> Run As -> Spring Boot App
 
 - Spring boot will build , start the application and listen to the port 8080
 
 - Use soap ui to test the application as below.
 
   Create Employee : http://localhost:8080/employee/create 
   
     -- Pass Employee object as json string as part of request body
     
   Find Employee http://localhost:8080/employee/get/{id}
     
     -- Pass employee id (type long) as path variable
   
   Update Employee http://localhost:8080/employee/update/{id}
    
      -- Pass employee id (type long) as path variable and Employee object as json string as part of request body
   
   Delete Employee http://localhost:8080/employee/delete/{id}
     
     -- Pass employee id (type long) as path variable   
    
     
     
