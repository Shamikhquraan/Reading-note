## Spring :

![](https://cdn.crunchify.com/wp-content/uploads/2013/02/Simplest-Spring-MVC-tutorial-by-Crunchify.com_.png)


- **The Spring Framework** is one of the most popular application development frameworks for creating enterprise Java applications.

- **The incorporated** best practices and infrastructure support provided by the framework simplifies application buildup and breakdown, allowing developers to spend more time on business logic.

### Serving Web Content with Spring MVC
 -**You will build an application** that has a static home page and that will also accept HTTP GET requests ,It will respond with a web page that displays HTML. The body of the HTML will contain ur HTML code .


### Complete the guide :
 - **You should Download** and unzip the source repository for this guide, or clone it , and you will **cd** into some thing serving web content , and after that creat a web Controller .

### Starting with Spring Initializr:
 -**After that** you can Starting with Spring Initializr by use **pre-pre-initialized** project and click Generate to download a ZIP file or manually by navigating to some thing to pull all the dependencies you need for an application. 
 - **And you will** copmlete your steps and you will an archive of a web application that is configured with your choices.


### About Create a web controller:
- **In Spring’s approach** to building web sites, HTTP requests are handled by a controller. You can easily identify the controller by the **@Controller** annotation.

- **After you done** Make sure you have Thymeleaf on your classpath (artifact co-ordinates: org.springframework.boot:spring-boot-starter-thymeleaf). It is already there in the "initial" and "complete" samples in Github.

### You have just developed a web page by using Spring , but for sure go and search to know the exact informations and the commands.



### Spring Boot Devtools:
* **Spring Boot** gives us the ability to quickly setup and run services.A common feature of developing web applications is coding a change, restarting your application, and refreshing the browser to view the change.


### Run the Application :
- **The Spring Initializr** creates an application class for you. In this case, you need not further modify the class provided by the Spring Initializr. 



### Build an executable JAR:
- **You can run** the application from the command line with Gradle or Maven. You can also build a single executable JAR file that contains all the necessary dependencies, classes, and resources and run that.
* If you use Gradle, you can run the application by using **./gradlew bootRun**.
* If you use Maven, you can run the application by using **./mvnw spring-boot:run**.  


### Test the Application:
- you can visit ur localhost and test maybe the greeting of your App .
* Provide a name query string parameter by visiting **http://localhost:8080/greeting?name=User**.


**And After All Of That** you can Add a Home page of your App by including HTML,CSS and Js , They can be served from your Spring Boot application by dropping them into the right place in the source code.




## Spring MVC and Thymeleaf:
* ### how to access data from templates?

**What is Thymeleaf:**
- **Thymeleaf is** a Java template engine for processing and creating HTML, XML, JavaScript, CSS, and text.
- **Integrating** Thymeleaf With Spring.

* **@Controller classes** are responsible for preparing a model map with data and selecting a view to be rendered. 
**=>** it is transformed into a Thymeleaf context object (part of the Thymeleaf template execution context) that makes all the defined variables available to expressions executed in templates.

### 1.Spring model attributes:
- **Spring MVC calls** the pieces of data that can be accessed during the execution of views model attributes. The equivalent term in Thymeleaf language is context variables.
- **In Thymeleaf,** these model attributes (or context variables in Thymeleaf jargon) can be accessed with the following syntax: ${attributeName}, where attributeName in our case is messages. 

### 2.Request parameters:
- **Request parameters** can be easily accessed in Thymeleaf views. Request parameters are passed from the client to server.

### 3.Session attributes:
- like **mySessionAttribute** ,Similarly to the request parameters, session attributes can be accessed by using the **session** .Or by using **#session**, that gives you direct access to the **javax.servlet.http.HttpSession object: ${#session.getAttribute('mySessionAttribute')}** .


### 4.ServletContext attributes:
- **The ServletContext attributes** are shared between requests and sessions. In order to access ServletContext attributes in Thymeleaf you can use the **#servletContext**.

### 5.Spring beans:
Thymeleaf allows accessing beans registered at the Spring Application Context with the **@beanName** syntax.


**AND That All**



