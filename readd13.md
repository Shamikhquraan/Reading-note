## Read: 13 - Related Resources and Integration Testing

### Related data in Spring (focus on the relationship annotations, not the curl requests):

- **how to work** with relationships between entities in Spring Data REST.

- 2. **One-to-One Relationship**
- 2.1. **The Data Model**
- **Let's define two entity** classes Library and Address having a one-to-one relationship, using the @OneToOne annotation. The association is owned by the Library end of the association.

- **The @RestResource annotation** is optional and can be used to customize the endpoint.
- **We must be careful** to have different names for each association resource. Otherwise, we will encounter a JsonMappingException with the message: “Detected multiple association links with same relation type! Disambiguate association”.

- **The association name defaults** to the property name and can be customized using the rel attribute of @RestResource annotation.

- **The @RestResource annotation is** optional and can be used to customize the endpoint.

- **We must be careful to have different names** for each association resource. Otherwise, we will encounter a JsonMappingException with the message: “ **Detected multiple association links with same relation type!** Disambiguate association”.
The association name defaults to the property name and can be customized using the rel attribute of @RestResource annotation.
- **We can resolve this by specifying a different value** for the rel attribute or by omitting the RestResource annotation so that the resource name defaults to secondaryAddress.


### 2.2. The Repositories :
- **In order to** expose these entities as resources, for ex :creat interface library etends CrudRepository:
* public interface LibraryRepository extends CrudRepository<Library, Long> {} .
* public interface AddressRepository extends CrudRepository<Address, Long> {} .


## 2.3.
## after that u are :
###  Creating the Resources :
by adding alibrary instance to work , The API returns the JSON object . 
double-qoute character inside the string represent JSON body **at windows** .
after that the resbonse will received with association resourse has been expoed at liprary endpoint .

**so** before we creating the association we will send GET request to the endpoit that will return empty object .
**Now the result** of the POST request is a JSON object .



## Now .. 
### Creating the Associations :
**After persisting** both instances, we can establish the relationship by using one of the association resources.
**...To remove the Associations** , we can call the endpoint with DELETE method, making sure to use the association resource of the owner of the relationship.

## what 
### One-to-Many Relationship analysis !!
In systems analysis, a one-to-many relationship is a type of cardinality that refers to the relationship between two entities A and B in which an element of A may be linked to many elements of B, but a member of B is linked to only one element of A. For instance, think of A as books, and B as pages.


## and there is 
### The Data Model..
To exemplify a one-to-many relationship.

## also
### we need creat Repository ..

and after that dealing with this data , how ever there is alot thing to do also , like **Testing the One-to-One Relationship** , **Testing the One-to-Many Relationship** ,  and thats it :)

![](https://miro.medium.com/max/1000/0*_9PeCmUm1wKuEShk.png)
### Spring MVC Test Configuration
- Let's now introduce how to configure and run the Spring enabled tests.

### Enable Spring in Tests with JUnit 5
by adding the @ExtendWith annotation to our test classes and specifying the extension class to load. 

### The WebApplicationContext Object
WebApplicationContext provides a web application configuration. It loads all the application beans and controllers into the context.
### Verify Test Configuration.after all . 


- **WebApplicationContext** and MockMvc object creation, which played an important role in calling the endpoints of the application.

- Looking further, we covered how we can send GET and POST requests with variations of parameter passing and how to verify the HTTP response status, header, and content.

- As a closing remark, we did also evaluate some limitations of MockMvc. Knowing those limitations can guide us to make an informed decision about how we're going to implement our tests.


