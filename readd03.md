## Maps, primitives, File I/O

![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191105111644/Data-types-in-Java.jpg)

- **Primitive Data Types:** A primitive data type is pre-defined by the programming language. The size and type of variable values are specified, and it has no additional methods.uses a small amount of memory to represent a single item of data. All data of the same primitive type are the same size.

- **Non-Primitive Data Types:** These data types are not actually defined by the programming language but are created by the programmer. They are also called “reference variables” or “object references” since they reference a memory location which stores the data.An object is a large chunk of memory that can potentially contain a great deal of data along with methods (little programs) to process that data.

![](https://media.geeksforgeeks.org/wp-content/uploads/Exception-in-java1.png)

- **what is an exception ?** In Java “an event that occurs during the execution of a program that disrupts the normal flow of instructions .


- **The Java runtime system requires** that a method must either catch or specify all checked exceptions that can be thrown by that method. This requirement has several components that need further description: "catch," "specify," "checked exceptions," and "exceptions that can be thrown by that method."



### Using Scanner to read in a file in Java

- **Create an FileInputStream object** by passing the path of the required file to its constructor, as a parameter. Create a Scanner class by passing the above created FileInputStream object. The hasNext() verifies whether the file has another line and the nextLine() method reads and returns the next line in the file.

**ex: while using scanner to read file in java :**

![](https://www.developerhelps.com/wp-content/uploads/2020/07/read.png)