# Basics

## 1 ADT - Abstract Data Types.
- Any data type that does not have its own implementation, and you are responsible for writing down its own implementation. That is called as an abstract data type.

- Arrays, LinkedList, Stack, Queue, Tree, Graph are not created in the javascript, we have to create the class and implement it as well. 
- > const arr = new Array() is not coming from native javascript and coming from ES6.

- Javascript was made for being a client side language, so it did not included the implementations of these Abstract data structure.

## 2 Algorithm Analysis

- An algorithm is a set of instrcuctions to be followed to solve a problem.Once we have a correct algorithm for a problem, we have to determine the effeciency of that algorithm.There can be more than one solution to solve a problem.

- Each operation in algorithm (or a program) has a cost, each operation take certain time.

### 2.1 General Rules for estimation
- **Loops** - The running time of loops is at most the running time of the statement inside of that loop times the number of iterations.
- **Nested** - Running Time of a nested loop containing a statement multiplied by the product of the size of all loop.
- **Consecutive Statement** - Just add the running times of those consecutive statements.

### 2.2 What to analyze
- An algorithm can require different times to solve different problems of the same size.
- **_Worst Case Analysis_** - the maximum amount of time that an algorithm can take to solve a problem of size n.Normally we find worst case behavious of an algorithm.
- **_Best Case Analysis_** - The minimum amount of time that an algorithm requuire to solve a problem of size n.
- **_Average Case Analysis_** -  The average amount of time that an algorithm require to solve a problem of size n. 

### 2.3 Space Complexity
- space complexity of an algorithm denotes the total space used or needed by the algorithm for its working, for various input sizes.
