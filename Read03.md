# React Docs - lists and keys



## What does .map() return?


![](https://scriptverse.academy/img/tutorials/js-array-map.png)





 **The map functions** transform their input by applying a function to each element and returning a vector the same length as the input. map (), map_if () and map_at () always return a list.

 **The map()** function applies the specified function to every item of the passed iterable, yields the results, and returns an iterator.


## If I want to loop through an array and display each value in JSX, how do I do that in React?



**Arrays are** quite common when using React, typically as a variable stored in your state. Whether it’s an array of integers, strings, or even objects, you’ll likely need to iterate through it at some point in your JSX in order to display each value.. The way you do this is by using the JavaScript function `map`.




## Each list item needs a unique key .




![](https://i.morioh.com/200626/ec9a9e94.jpg)



## What is the purpose of a key?



**Keys help React** identify which items have changed, are added, or are removed. Keys should be given to the elements inside the array to give the elements a stable identity , he best way to pick a key is to use a string that uniquely identifies a list item among its siblings. Most often you would use IDs from your data as keys .





## What is the spread operator?


**JavaScript, spread syntax** refers to the use of an ellipsis of three dots (…) to expand an iterable object into the list of arguments.
The spread operator was added to JavaScript in ES6 (ES2015), just like the rest parameters, which have the same syntax: three magic dots …



## List 4 things that the spread operator can do :


- ### Copying an array
- ### Concatenating or combining arrays
- ### Using Math functions
- ### Using an array as arguments
- ### Adding an item to a list



## Give an example of using the spread operator to combine two arrays :


### Here are a couple basic examples of using … in JavaScript, where I demonstrate copying an array, splitting a string into characters, and combining the properties of two JavaScript objects:

-------------------------------------------------------------------------------------------------


[...["😋😛😜🤪😝"]] // Array [ "😋😛😜🤪😝" ]
[..."🙂🙃😉😊😇🥰😍🤩!"] // Array(9) [ "🙂", "🙃", "😉", "😊", "😇", "🥰", "😍", "🤩", "!" ]

const hello = {hello: "😋😛😜🤪😝"}
const world = {world: "🙂🙃😉😊😇🥰😍🤩!"}

const helloWorld = {...hello,...world}
console.log(helloWorld) // Object { hello: "😋😛😜🤪😝", world: "🙂🙃😉😊😇🥰😍🤩!" }


-------------------------------------------------------------------------------------------------



## Give an example of using the spread operator to add a new item to an array :

-------------------------------------------------------------------------------------------------

const numbers = [37, -17, 7, 0]
console.log(Math.min(numbers)) // NaN
console.log(Math.min(...numbers)) // -17
console.log(Math.max(...numbers)) // 37

-------------------------------------------------------------------------------------------------


## Give an example of using the spread operator to combine two objects into one:


-------------------------------------------------------------------------------------------------
const objectOne = {hello: "🤪"}
const objectTwo = {world: "🐻"}
const objectThree = {...objectOne, ...objectTwo, laugh: "😂"}
console.log(objectThree) // Object { hello: "🤪", world: "🐻", laugh: "😂" }
const objectFour = {...objectOne, ...objectTwo, laugh: () => {console.log("😂".repeat(5))}}
objectFour.laugh() // 😂😂😂😂😂

-------------------------------------------------------------------------------------------------


## In the video, what is the first step that the developer does to pass functions between components?

### Defention function as arrow function below the constructor that had the state and pass the property of object inside constructor in the function.




## In your own words, what does the increment function do?

### Increment the count of the object we want in the state by reach to state count value .



## How can you pass a method from a parent component into a child component?


### through the props .

- When you call the onRef function inside Child-component, you are calling the function passed from the parent component. ... 

## Things I want to know more about,no thing .