
# Sample Spring Boot Backend
-----------------------------------------------

> This is a Spring boot application. It exposes a REST API using Swagger which can be accessed at 
http://localhost:8080/swagger-ui.html#/news-controller. 

> For changing the server url, port include a properties file.

## To Install and Run
-----------------------------------------------

    mvn install
And then run as a Java Application and navigate to 


    http://localhost:8080/swagger-ui.html#/news-controller

> Note: MySQL installation and setup is required before you run the app. Use the queries below to set up your data base.

    CREATE database newsapi;

    CREATE TABLE news ( id int(11) NOT NULL AUTO_INCREMENT, title varchar(50) DEFAULT NULL, content text, author varchar(50) DEFAULT NULL, image varchar(150) DEFAULT NULL, date timestamp NULL DEFAULT NULL, source varchar(100) DEFAULT NULL, PRIMARY KEY (id) ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

    INSERT INTO newsapi.news (id, title, content, author, image, date, source) VALUES (2, "Govt declares help", "Govt decided to extend help to flood victims", "Sam", "lskjlkdj", "24/09/12", "ABC News")
    
    
-----------------------------------------------
## REST APIs exposed by the app (As seen in Swagger ui)
-----------------------------------------------

![Alt text](Swagger_UI_REST_APIs-1.jpg?raw=true )

![Alt text](Swagger_UI_REST_APIs-2.jpg?raw=true )

![Alt text](Swagger_UI_REST_APIs-3.jpg?raw=true )

![Alt text](Swagger_UI_REST_APIs-4.jpg?raw=true )

![Alt text](Swagger_UI_REST_APIs-5.jpg?raw=true )
