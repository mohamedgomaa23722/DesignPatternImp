# DesignPatternImp
At this Repo we will discuss several design pattern with this kind of question what, how, why using selected design pattern so let's jump to the first design pattern

# This Repo Created by :
- [Karim Taha](https://github.com/karimtismail)
- [Martina Naeem](https://github.com/MartinaNaeem)
- [Mohamed Gomaa](https://github.com/mohamedgomaa23722)

## Strategy Design Pattern
  This pattern defines a family of behaviors or algorithms to make it interchangeable strategy, let the client use any of that behaviors, and it follows those Principles :
  - Single Responsibility Principle : each behivior has only one reason to change, e.g paypal modification i will modifing into pay process only  
  - open close Principle : if we need to change we will create a new behavior without modifing into exist code.
  - interface segregation Principle
  - Liskov Substitution
  - dependency inversion : if we look at the below diagram we will find that User doesn't depend on speceific payment Method 
  - favor Composition over inheritance (new principle) : help us to encapsulate a family of algorithms or behaviors and change it at runtime
  
  ### Class Diagram
  ![Untitled Diagram (6)](https://user-images.githubusercontent.com/62193989/221428559-1537e81e-4a8e-499a-8f5e-2d25bde78de8.jpg)

## Decorator Design Pattern
  This pattern help us to wrapping object inside another object to add additional responsibilities to the wrapper object
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

[![image](https://www.linkpicture.com/q/d45ec9b0-e04b-43a3-904d-db5fc6fc8e70.jpg)](https://www.linkpicture.com/view.php?img=LPic64037aa633b3077275748)

# Singleton Design Pattern

## Definition

Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global point of access to this instance.

## Description

In software engineering, the Singleton pattern is a design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system. The concept is sometimes generalized to systems that operate more efficiently when only one object exists, or that restrict the instantiation to a certain number of objects. The term comes from the mathematical concept of a singleton.

The Singleton pattern is implemented by creating a class with a method that creates a new instance of the class if one doesn't exist. If an instance already exists, it simply returns a reference to that object. To ensure that the object cannot be instantiated any other way, the constructor is made private. The class can also provide a way to access the singleton instance through a static method that returns a reference to the instance.

## Usage

Singleton pattern is mostly used in multithreaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.

## UML

![alt text](https://github.com/karimtismail/Design-Pattern/blob/main/src/main/java/org/patterns/creational/singleton/uml.png)

## Pros

The Singleton pattern has several benefits, including:
- **Single instance:** Only one instance of the class is created, which ensures that the class is not duplicated unnecessarily.
- **Global access:** The single instance can be accessed from anywhere in the code, which makes it easy to use and maintain.
- **Lazy initialization:** The singleton is only created when it is first accessed, which can improve performance.

## Cons

The Singleton pattern also has some drawbacks, including:
- **Global state:** The singleton object represents global state, which can make it difficult to reason about the behavior of the system.
- **Tight coupling:** The Singleton pattern can lead to tight coupling between classes, which can make it difficult to modify the system later on.
- **Testing difficulties:** Because the Singleton object is global, it can be difficult to write unit tests that isolate the behavior of individual classes.

## Types

There are three main types of Singleton pattern implementation:

- **Classic Singleton (Eager Singleton)**
    - The classic Singleton implementation ensures that only one instance of the class is created and provides a global point of access to this instance. This type of Singleton is implemented by creating a private constructor, a private static instance variable, and a public static method that returns the instance.
    - The Classic Singleton type is the most common and simple implementation of Singleton pattern. However, it is not thread-safe, which can lead to issues in multi-threaded environments.

- **Lazy Singleton**
    - The lazy Singleton implementation delays the creation of the singleton instance until it is actually needed, improving performance by avoiding unnecessary object creation.
    - This type of Singleton is implemented by creating a private constructor and a private static instance variable, but without creating the instance variable until it is actually needed. The public static method that returns the instance creates the instance if it hasn't been created yet, and returns the existing instance if it has.
    - The Lazy Singleton type is useful in situations where the object creation is expensive or time-consuming, and where the object is not needed immediately. However, it is important to ensure that the Lazy Singleton is thread-safe, as the delayed creation can lead to issues in multi-threaded environments.

- **Thread-safe Singleton**
    - The thread-safe Singleton implementation ensures that only one instance of the class is created and provides a global point of access to this instance, while also being safe for use in multi-threaded environments.
    - This type of Singleton is implemented using techniques such as double-checked locking, synchronized methods, or volatile variables to ensure that the instance is only created once and that it is safe for use in multi-threaded environments.

## Examples

### Database Connection Example

The DatabaseConnection class has a private constructor and a private static instance variable instance. The class also has an instance variable connection which is of type Connection from the java.sql package. The url, username, and password variables contain the details required to connect to the database.

The constructor is private, which means it cannot be accessed outside the class, and it initializes the connection instance variable using the DriverManager.getConnection() method. If the getConnection() method is called and the connection is closed, a new connection is created.

The getInstance() method is a static method that returns the instance of the DatabaseConnection class. If instance is null, a new instance is created. If instance is not null, the getConnection() method is called to check if the connection is closed. If it is, a new instance is created.

![alt text](https://github.com/karimtismail/Design-Pattern/blob/main/src/main/java/org/patterns/creational/singleton/databaseConnectionExample/uml.png)

### Product Catalog Example

The Product class is a simple Java class with private instance variables for id, name, description, and price. It also has public getter and setter methods for each of the instance variables. This class represents a product in a product catalog.

The ProductCatalog class is an implementation of the Singleton design pattern for a product catalog. It has a private static instance variable instance, which is the only instance of the class. The class also has a private instance variable products, which is a Map containing all the products in the catalog. The constructor is private, which means it cannot be accessed outside the class, and it initializes the products map.

The getInstance() method is a static method that returns the instance of the ProductCatalog class. If instance is null, a new instance is created. This implementation ensures that only one instance of the ProductCatalog class is created and provides global access to that instance.

The class also has methods to add a product to the catalog, get a product by its ID, and get a list of all products in the catalog. These methods are synchronized to prevent multiple threads from accessing the products map at the same time, which could lead to data inconsistencies.

### Shopping Cart Example

The ShoppingCart class is an implementation of the Singleton design pattern for a shopping cart. It has a private static instance variable instance, which is the only instance of the class. The class also has a private instance variable items, which is a list of items in the shopping cart. The constructor is private, which means it cannot be accessed outside the class, and it initializes the items list.

The getInstance() method is a static method that returns the instance of the ShoppingCart class. If instance is null, a new instance is created. This implementation ensures that only one instance of the ShoppingCart class is created and provides global access to that instance.

The class also has methods to add and remove items from the cart, get a list of all items in the cart, and get the total price of all items in the cart.

The Item class is a simple Java class with private instance variables for name and price. It also has public getter and setter methods for each of the instance variables. This class represents an item in the shopping cart. When an item is added to the shopping cart, an instance of the Item class is created with the name and price of the item.

![alt text](https://github.com/karimtismail/Design-Pattern/blob/main/src/main/java/org/patterns/creational/singleton/shoppingCartExample/uml.png)
