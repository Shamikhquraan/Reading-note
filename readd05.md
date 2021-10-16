**Big (O) is what shows the efficiency or the worst case efficiency** of algorithms and it is based on two factors:-

* Running time or the time complexity.
* Memory space or the space complexity.


- **linked list :** is a linear collection of data elements whose order is not given by their physical placement in memory.

- **Time Complexity:** 
- Instead of focusing on units of time, Big-O puts the number of steps in the spotlight. because machines vary in performance The hardware factor is taken out of the equation. Therefore we are not talking about run time, but about time complexity.

**O(1) — Constant**
O(1) means that the algorithm takes the same number of steps to execute regardless of how much data is passed in.

**O(N) — Linear**
An algorithm that is O(N) will take as many steps as there are elements of data. So when an array increases in size by one element, an O(N) algorithm will increase by one step.

**O(N²) — Quadratic**
O(N²) represents the complexity of an algorithm, whose performance is proportional to the square of the size of the input elements. It is generally quite slow:

If the input array has 1 element it will do 1 operation, if it has 10 elements it will do 100 operations, and so on.

**O(logN) — Logarithmic**
Simply put, O(logN) describes an algorithm that its number of operations increases by one each time the data is doubled.

**O(2ᴺ) — Exponential**
Exponential growth means that the algorithm takes twice as long for every new element added.

