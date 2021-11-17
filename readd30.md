## Hash Tables: 

- **What are hash tabels ?** it's a special collection that is used to store items as key and value , so we can pass the key which will always match the index , to a hash function to get the value of that index.

![](https://www.tutorialspoint.com/data_structures_algorithms/images/hash_function.jpg)


### Why do we use them?

* Hold unique values
* Dictionary
* Library

### How to implement it and how it works?

- Every hash-table store data in the form of a (key, value) combination. the key value is hashed into a unique interger , so the table cannot hold two keys with same value. the index is calculated by finding the modulo of the key or the sum of ASCII code (in case of alphanumric) by the size of the table.

**however ,** if we want to insert a value that has the same hashCode which means the same index in the table this would cause a COLLISION. to solve that , there is two ways

- closed addressing (linear probing)
- open addressing

- **consider we want** to use the closed addreisng we will implement this using a linked list so that index of the table will hold a chain of (key, value ) all keys have the same hashCode.

![](https://static.javatpoint.com/ds/images/hash-table.png)