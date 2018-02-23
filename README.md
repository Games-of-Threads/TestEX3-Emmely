# TEST Assignment 3 - Test Cases
[Assignment description](https://github.com/datsoftlyngby/soft2018spring-test-teaching-material/blob/master/exercises/Test%20Case%20Exercises.pdf)


[embed]emmely_lundberg_test_3.pdf[/embed]


## Description
This exercise is to practise using black box testing techniques. 
It is touching topics such as: Equivalence Classes, Boundary Value Analysis, Decision Table Testing and State Transition Testing.

### Equivalence classes

- 1). Make equivalences classes for the input variable for this method: 
```java
public boolean isEven(int n)
```

Equivalence classes | Test Case
------------------ | ------------------------
n modolus 2 != 0 (n % 2 != 0)  | Odd (False): 53
n modolus 2 == 0 (n % 2 == 0) | Even (True): 56

------------------------

- 2). Make equivalences classes for an input variable that represents a mortgage applicant's salary. 
The valid range is $1000 pr. month to $75,000 pr. month.


Equivalence classes | Test Case
------------------- | ----------------
amount < 1000 | Invalid : 500
1000 <= ammount <= 75000 | Valid: 25000
75000 < ammount | Invalid: 10000000

-------------

- 3). Make equivalences classes for the input variables for this method:

```java
public static int getNumDaysinMonth(int month, int year)
```

Note: Technically, you can calculate all future number of days in a month, and all previous ones as well. 

Equivalance classes       | Test Case
------------------------- | -------------------
0 < month < 13   | Valid: 2
0 > month or month > 13     | Invalid: -3  or 16
0 <= year | Valid : 4018
0 > year | Invalid: -232

-----------------------

### Boundary Analysis
Do boundary value analysis for input value exercise.

- 1).

There is infinite number of boundaries N/2. With Three Value Approach 

Odd | Even | Odd | Even | Odd | Even | Odd
---:| --- | --- | --- | --- | --- | ----
-1 | 0 | 1 | 2 | 9 | 10 | 11


- 2).

Invalid | Valid | Invalid
-----------:|:--------:|:--------
-∞ to 999 | 1000 to 75000 | 75001 to ∞

- 3).

Month

Invalid | Valid  | Invalid
-------:|:------:|:------------
-∞ to 0 | 1 to 12 | 13 to ∞


Year

Invalid | Valid
-------:|:-------
-∞ to 0 | 1 to ∞

----------

### Decision tables

- 1). Make a decision table for example business case. [resource](https://github.com/datsoftlyngby/soft2018spring-test-teaching-material/blob/master/exercises/Test%20Case%20Exercises.pdf)

Conditions:                | Rule 1 | Rule 2 | Rule 3 | Rule 4 |
-------------------------- |:------:|:------:|:------:|:------:|
Doctors Office          | T | T | F | F
Dedutible meet          | T | F | T | F
**Actions/Outcomes:**       | **¤** | **¤** | **¤** | **¤**
50% reimbursed          | Y | - | - | -
80% reimbursed          | - | - | Y | -
0% reimbursed           | - | Y | - | Y

Note: If we want to simplify the Decision Table rule #2 and #4 could be removed because they are invalid cases. 
Depending on the use cases it could be relevant or irrelevant to display invalid cases.

- 2). Make a decision table for leap years.


Conditions:                | Rule 1 | Rule 2 | Rule 3 | Rule 4 | 
-------------------------- |:------:|:------:|:------:|:------:|
Year Divisible by 4        | T | T | T | T |         
Year Divisble by 100       | T | T | F | F |  
Year Divisble by 400       | T | F | T | F | 
**Actions/Outcomes:**      | **¤** | **¤** | **¤** | **¤** | 
Leap year                  | Y | - | Y | Y |

Note: I removed cases where year is not divisble by 4, because that is by default not a leap year. So not relevant in this case.

-----------

### State Transition

- 1). Make a state diagram hat depicts the state of MyArrayListWithBugs.java and show the events that cause a change from one state to another. (ie. transition.)

Action | State | Next state
---------------------:| ----------- | --------------
MyArrayListWithBugs() | S1 | S2
Add(Object o) | S2 | S2
Size() | S2 | S2
Succesfully get(int Index) | S2 | S2
OutOfBounds get(int index) | S2 | S3
Succesfully add(int index, object e) | S2 | S2
OutOfBounds add(int index, object e) | S2 | S3
Succesfully remove(int index) | S2 | S2
OutOfBounds remove(int index) | S2 | S3


S1 = Startstate, S2 = Working, idle, ready state. S3 = Error, exception chrashed state.

![Alt text](Statemachinediagram1.png?raw=true "State Transition Diagram")

----------------------

- 2). Derive test cases from the state diagram

TC# | Test Case 
---:| ----------------------------------------------------
1 | Assert Size 0 -> Add(Object o) -> Assert size 1
2 | Add(object o1) -> Add(object o2) -> Add(object o3) -> Assert size 3 -> assert get(2)==o3
3 | Add(object o1) -> Add(object o2) -> Add(object o3) -> Assert size 3 -> remove(2) -> Assert size 2
4 | Add(object o1) -> Add(object o2) -> Add(object o3) -> Assert size 3 -> remove(2) -> Assert OutofBounds get(2)
5 | Add(object o1) -> Add(object o2) -> Add(object o3) -> Assert size 3 -> Assert OutOfBounds Add(0, o4)
6 | Add(object o1) -> Add(object o2) -> Add(object o3) -> Assert size 3 -> remove(3) -> add(525, o4) -> Assert get(525)==o4 -> assert Size 4
7 | Add(object o1) -> Add(object o2) -> Assert size 2 -> Assert OutOfBounds remove(3)



- 3). Implement automated unit tests running the test cases above.

- 4). Detect, locate and fix as many errors as possible in the class
>- a. 
>- b. 
>- c.
>- d. 

- 5). Consider whether a state table is more useful design technique. Comment on that.

- 6). Make a conclusion where you specify the level of test coverage and argue for your chosen level: