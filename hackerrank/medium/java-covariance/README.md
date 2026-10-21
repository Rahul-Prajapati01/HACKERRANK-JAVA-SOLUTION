# Covariant Return Types

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Java allows for [Covariant Return Types](https://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html), which means you can vary your return type as long you are returning a subclass of your specified return type. 	

[Method Overriding](https://docs.oracle.com/javase/tutorial/java/IandI/override.html) allows a subclass to *override* the behavior of an existing superclass method and specify a return type that is some subclass of the original return type. It is best practice to use the `@Override` [annotation](https://docs.oracle.com/javase/tutorial/java/annotations/basics.html) when overriding a superclass method.

Implement the classes and methods detailed in the diagram below:


![image](https://s3.amazonaws.com/hr-assets/0/1523891844-c66f1555af-class.png)

You will be given a partially completed code in the editor where the *main* method takes the name of a state (i.e., `WestBengal`, or `AndhraPradesh`) and prints the national flower of that state using the classes and methods written by you. 

**Note:**  *Do not* use access modifiers in your class declarations.

**Resources**	
[Covariant Return Type](http://c2.com/cgi/wiki?CovariantReturnTypes)	
[Java Covariant Type](https://blogs.oracle.com/sundararajan/entry/covariant_return_types_in_java)

**Input Format**

The locked code reads a single string denoting the name of a subclass of *State* (i.e., `WestBengal`, `Karnataka`, or `AndhraPradesh`), then tests the methods associated with that subclass. You are not responsible for reading any input from stdin.

**Constraints**

 

**Output Format**

Output is handled for you by the locked code, which creates the object corresponding to the input string's class name and then prints the name returned by that class' national flower's *whatsYourName* method. You are not responsible for printing anything to stdout.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T06:14:02.709Z  

```java


class Flower {
    String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-covariance/problem)