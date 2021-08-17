1. ## What is functional programming?

Functional programming (often abbreviated FP) is the process of building software by composing pure functions, avoiding shared state, mutable data, and side-effects. Functional programming is declarative rather than imperative, and application state flows through pure functions.

 

2. ## What is a pure function and how do we know if something is a pure function?

- It returns the same result if given the same arguments, and It does not cause any observable side effects.

 

3. ## What are the benefits of a pure function?

- You'll always get the same result, as all the code a pure function uses is inside of it or gets past to it as parameters.

 

4. ## What is immutability?

- When talking about data, it means the state of the data cannot be changed after it’s created.

 

5. ## What is Referential transparency?

Referential transparency and referential opacity are properties of parts of computer programs. An expression is called referentially transparent if it can be replaced with its corresponding value without changing the program's behavior
 

## Node JS Tutorial for Beginners #6 - Modules and require()


1. ## What is a module?

- Modules are small-ish certain packages of code and js files that we can use to do specific things, we use them so we don't have to download a metric ton of code everytime, and instead just get this comparatively small number of files.

 

2. ##  What does the word ‘require’ do?

- require() is used to consume modules. It allows you to include modules in your app. You can add built-in core Node. js modules, community-based modules (node_modules), and local modules too.
 

3. ## How do we bring another module into the file the we are working in?
- by assigning a variable to whatever require gets from the the modules.

 

4. ## What do we have to do to make a module available?

- you first have to export it, using module.export = function;