# State and Props




![](https://miro.medium.com/max/5000/1*XcGM-8E_hGl4fpAr9wJIsA.png)




- ## Based off the diagram, what happens first, the ‘render’ or the ‘componentDidMount’?

 **The Render** it will happens first ,The methods in this section cover the vast majority of use cases you’ll encounter creating React components , as in lifecycle diagram.



- ## What is the very first thing to happen in the lifecycle of React?


**static getDerivedStateFromProps()** The static getDerivedStateFromProps is the first React lifecycle method to be invoked during the updating phase.




## Put the following things in the order that they happen: 
## componentDidMount , render , constructor, componentWillUnmount , React Updates.


These methods are called in the following order from fast to less one in lifecycle events :

- React Updates().

- constructor().

- render().

- componentWillUnmount().

- componentDidMount().



## What does componentDidMount do?


- **This method** is invoked immediately after a component is mounted. If you need to load anything using a network request or initialize the DOM, it should go here.







# React State Vs Props




![](https://res.cloudinary.com/practicaldev/image/fetch/s--t_zLD-td--/c_imagga_scale,f_auto,fl_progressive,h_420,q_auto,w_1000/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/etyobt3pt6c6q286y6lf.jpg)







## What types of things can you pass in the props?



- **Props** in React allows us to pass values from a parent component down to a child component. The values can be any data type, from strings to functions, objects, etc.



## What is the big difference between props and state?


- **The key** difference between props and state is that state is internal and controlled by the component itself while props are external and controlled by whatever renders the component.

In a React component, props are variables passed to it by its parent component. State on the other hand is still variables, but directly initialized and managed by the component , the state can be initialized by props.






## When do we re-render our application?


**React components** automatically re-render whenever there is a change in their state or props. A simple update of the state, from anywhere in the code, causes all the User Interface (UI) elements to be re-rendered automatically.




## What are some examples of things that we could store in state?


**It is highly recommended** that you only put plain serializable objects, arrays, and primitives into your store. It's technically possible to insert non-serializable items into the store, but doing so can break the ability to persist and rehydrate the contents of a store, as well as interfere with time-travel debugging.
When React was first introduced, we were presented with local state. The important thing to know about local state is that when a state value changes, it triggers a re-render.

##these some examples and recommend about what we do when we store some things