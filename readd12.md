## Spring RequestMapping


![](https://i2.wp.com/springframework.guru/wp-content/uploads/2017/09/mvc.png)


- **This request hadles(Maps)** the http method (request) we must notice that the RequestMapping has no default , so it may map to any http request.

- **Using @RequestMapping** With Producible and Consumable
to use produce : we use @RequestMapping in combination with the @ResponseBody annotation.(Response)

- **To use consume :** we use to consume @RequestMapping in combination with the @RequestBody annotation.(Request)

### RequestMapping With Path Variables
- **Single** @PathVariable ----> ex : @RequestMapping(value = "/ex/foos/{id}", method = GET)
@ResponseBody

- public String getFoosBySimplePathWithPathVariable( @PathVariable String id) {

- **return** "Get a specific Foo with id=" + id;
} Here you can notice that we passed one variable in the path {id}

- **Multiple @PathVariable** ------> ex: @RequestMapping(value = "/ex/foos/{fooid}/bar/{barid}", method = GET)
@ResponseBody

- **public** String getFoosBySimplePathWithPathVariables (@PathVariable long fooid, @PathVariable long barid) {

- **return** "Get a specific Bar with id=" + barid + 
  " from a Foo with id=" + fooid;
}


### RequestMapping With Request Parameters
- it's used to bind a web request parameter to the parameter of the handler method


### @RequestMapping — a Fallback for All Requests

-This is used to implement a fallback for all requests using http methods. we use the (*) to annotate for all requests , ex :

- @RequestMapping(value = "*", method = RequestMethod.GET)

- @ResponseBody

- public String getFallback() {

return "Fallback for GET Requests";
}


this summary 