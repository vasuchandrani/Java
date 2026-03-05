# EXPERIMENT – 5

## Aim

Write a program that uses the concept of **unit testing using JUnit**.

**Tools/Apparatus:** Eclipse

---

## Program

- Write a program that will check four test cases:
  - **Adding a student**
  - **Check number of students currently available** (i.e., size of student list)
  - **Remove one student**
  - **Remove all students at a time**

---

## Procedure

- We have created **three Java classes**:
  - `JunitTestCaseExample.java`
  - `TestJunitTestCaseExample.java`
  - `TestRunner.java`

- In the **`JunitTestCaseExample.java`** class, we created the code which we want to test.  
  In this class, we create a **list of names** and four methods to:
  - add an element
  - remove an element
  - get the list's size
  - remove all elements from the list

- In **`TestJunitTestCaseExample.java`**, we write the **test cases** for the `JunitTestCaseExample.java` class.  
  We create an object of the `JunitTestCaseExample` class, and by using its object we test all its methods.  
  We use the **`assertEquals()`** method to check the **actual result with the expected output**.

- We create the **`TestRunner.java`** class to execute the test cases.  
  It contains the **`main()`** method in which we run the `TestJunitTestCaseExample.java` class using the **`runClasses()`** method of **JUnitCore**.

- In this method, we pass the class file of `TestJunitTestCaseExample.java`.  
  The result returned by the `runClasses()` method is stored in a variable of type **Result**.

- Now, we run the **`TestRunner.java`** class to execute the test cases.  
  We get the output **true when the test cases are passed** and **false when the test cases are not passed**.