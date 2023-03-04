# DesignPatternImp
At this Repo we will discuss several design pattern with this kind of question what, how, why using selected design pattern so let's jump to the first design pattern

# This Repo Created by :
- [Karim Taha](https://github.com/karimtismail)
- [Martina Naeem](https://github.com/MartinaNaeem)
- [Mohamed Gomaa](https://github.com/mohamedgomaa23722)

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

