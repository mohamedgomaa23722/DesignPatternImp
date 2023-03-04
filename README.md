# DesignPatternImp
At this Repo we will discuss several design pattern with this kind of question what, how, why using selected design pattern so let's jump to the first design pattern 

## Strategy Design Pattern
  This pattern defines a family of behavior or algorithm to make it interchangeable strategy, let client use any of that behaviors, it follows those Principles :
  - Single Responsibility Principle : each behivior has only one reason to change, e.g paypal modification i will modifing into pay process only  
  - open close Principle : because if we need to change we will create a new behavior without modifing into exist code.
  - interface segregation Principle
  - Liskov Substitution
  - dependency inversion : if we look at the below diagram we will find that User doesn't depend on speceific payment Method 
  - favor Composition over inheritance (new principle) : help us to encapsulate a family of algorithms or behaviors and change it at runtime
  
  ### Class Diagram
  ![Untitled Diagram (6)](https://user-images.githubusercontent.com/62193989/221428559-1537e81e-4a8e-499a-8f5e-2d25bde78de8.jpg)

## Decorator Design Pattern
  This pattern help us to wrapping object inside another object to add additional responsibilities to an object
  dynamically, and it provides flexibility to add new object inherit from abstract class with our new impl or behavior
  over composition, and it follows those principles : 
  - open\close principle : when we try to add new decorator we don't need to modify into exist source code

### Class Diagram
  
  ![decorator](https://user-images.githubusercontent.com/62193989/222762257-9c3fcdb0-6c8c-4087-bba9-0057cfb110e0.jpg)

# Factory Design Pattern

## Definition:
The Factory Design Pattern is a creational design pattern that provides a way to create objects without specifying their concrete types. It defines an interface or an abstract class for creating objects, but lets subclasses decide which class to instantiate. In other words, the Factory pattern provides a way to delegate the instantiation logic to the subclasses.

## Description:
The Factory Design Pattern involves defining an interface for creating an object, but letting the subclasses decide which class to instantiate. The client code creates an object by calling a factory method and passing it the required parameters. The factory method then creates and returns an object of the appropriate type based on the input parameters.

## Usage:
The Factory Design Pattern is useful when we want to create objects that share the same interface or superclass, but differ in their implementation. It provides a centralized place to manage object creation, making it easier to modify the implementation of the objects without affecting the client code. This pattern is commonly used in frameworks where there is a need to create objects with a common interface but different implementations.

## Pros:

Provides a centralized place for object creation, making it easier to manage object creation logic
Reduces coupling between the client code and the objects being created
Allows for easy modification of the object creation logic, without affecting the client code
Enables the creation of objects without exposing the creation logic to the client code

## Cons:

Can lead to an increase in the number of classes in a project
Can result in complex code, especially when dealing with large hierarchies of objects
Can lead to a proliferation of similar factory classes for creating different types of objects

## Types:

- **Simple Factory:** A simple factory is a static method that takes a set of parameters and returns an object of a particular class. It doesn't implement an interface or an abstract class.
- **Factory Method:** A factory method defines an interface for creating objects but allows subclasses to decide which class to instantiate. It uses inheritance to delegate the responsibility of object instantiation to the subclasses.
- **Abstract Factory:** An abstract factory provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is used when there are multiple families of objects to be created and the objects in each family are related to each other.


## Class Diagram

![App Screenshot]([https://via.placeholder.com/468x300?text=App+Screenshot+Here](https://ibb.co/nR8P2ZT))
