# Abstract Class Example: Bikes in Java

##  Description
This project demonstrates the use of **abstract classes** in Java. 

We define an abstract class `Bike` with an abstract method `run()`.  
Different types of bikes (`HondaBike`, `YamahaBike`) inherit from `Bike` and provide their own implementation of `run()`.

The `Main` class creates objects of these subclasses and calls their `run()` methods to demonstrate **polymorphism**.

---

## Concepts Practiced
- Abstract classes (`abstract class`)  
- Abstract methods (`abstract void run()`)  
- Inheritance (`extends`)  
- Polymorphism (parent class reference, child class object)  
- Method overriding  

---

## ▶ How to Run

1. Compile all Java files:

```bash
javac *.java