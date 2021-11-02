## Using WebSocket to build an interactive web application

- **it's a bi-directional that persistent** connection between a web browser and a server.

- **so let's get** started with gradle :

- **at first** we have to Enable WebSocket in Spring by adding the configration and puttiong the annotation @EnableWebSocketMessageBroker to the webSocket class .
- **then create** the message model , as a JSON format , NOTE// By default, Spring will use the Jackson library to convert our model object to and from JSON.
- **create a controller** to handle the message model , in this controller we will create a response message (OutputMessage) , then @SendTo annotation.
- **create a browser** client by creating an HTML page , so we have to import the sockjs and stomp Javascript client libraries -then create a connection function to start the connection btween our endpoint.
and this picture can explain the process briefly :

![](123.png)