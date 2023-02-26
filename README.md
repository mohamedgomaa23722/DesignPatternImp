# DesignPatternImp
At this Repo we will discuss several design pattern with this kind of question what, how, why using selected design pattern so let's jump to the first design pattern 

## Strategy Design Pattern
  This pattern defines a family of behavior or algorithm to make it interchangeable strategy, let client use any of that behaviors, it follows this pattern :
  - Single Responsibility Principle : each behivior has only one reason to change, e.g paypal modification i will modifing into pay process only  
  - open close Principle : because if we need to change we will create a new behavior without modifing into exist code.
  - interface segregation Principle
  - Liskov Substitution
  - dependency inversion : if we look at the below diagram we will find that User doesn't depend on speceific payment Method 
  - favor Composition over inheritance (new principle) : help us to encapsulate a family of algorithms or behaviors and change it at runtime
  
  ### Class Diagram
  ![Untitled Diagram (6)](https://user-images.githubusercontent.com/62193989/221428559-1537e81e-4a8e-499a-8f5e-2d25bde78de8.jpg)
