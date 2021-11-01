## Spring Boot and OAuth2
- **OAuth2 is an authorization** framework that allows the application Web Security to access the resources from the client , so every single file in the app will be protected unless we permit it or authorized the users to access.

this explains the process :

![](ssd.png)

- **so basically ,** we can say it's used to provide access to protected resources over the HTTP protocol.

so the process happens :

- **client asks** for an authorization.

- **Application requests** an Access Token by authenticating with the Authorization Server.

- **if it successfuly authorized** ,the Authorization Server issues an Access Token and sends it to the Application.

the app asks for access by showing the token.

## what annotations we will use ?
**AuthorizationServerConfigurerAdapter** class which implements AuthorizationServerConfigurer interface and use @EnableAuthorizationServer annotation.

@EnableResourceServer annotation and extend ResourceServerConfigurerAdapter class.

@EnableResourceServer