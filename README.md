## Refactoring
    Remodelling overall app so that new features can fit up or you can optimize overall app for achieving readability, extensibility, ...

## OOPS
#### Abstraction
    Display only essential information and hide details
#### Encapsulation
    Binding data and behaviour into single unit
#### Polymorphism
    Perform same thing in different ways
#### Inheritance
    Sub class inherits properties and methods from base class

## Relations b/w classes
    1. Association
        - Biderictional relationship b/w classes
        - 1 to *
        - * to 1
        - 1 to 1
    2. Composition
        - Part cannot exist without Whole
    3. Aggregation
        - Whole-Part relationship
        - Class contains object of another class but contained object can exist independently
    4. Generatlization
        - IS A relationship
        - like inheritance


## Design Patterns
    - Typical solutions to commonly occurring problems in software design.
    - Blueprints that can be used to customize to solve a particular design problem in your code.
    - Well known way of solving a well known problem. (Template for solving problem)
    - Simpler communication in one phrase

### Object Oriented Design Patterns
- Creational
    
    1.   [Builder](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/builder)
          - Seperate construction of object from its representation.
          - Perform validations
          - Creation of object is easier and resillient
          - Director class orchestrates the construction process using builder interface to construct actual objects.
          - Final objects return to client by Director
    
    2.   [Factory](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/factory)
         - Segregating the logic for creating the object wherever required
    
    3.   [Prototype](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/prototype)
    
    4.   [Singleton](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/singleton)
         - Single object getting created throughout the scope of execution.
         - Can achieve thread safety
    5.   [Abstract Factory](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/abstractfactory)
         - Interface for Factory of similar objects without concrete classes

    6.   [Factory Method](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/factorymethod)
    
- Behavioral

    7.   [Strategy](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/strategy)

    8.   [Chain of Responsibility](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/chainofresponsibility)
    
    9.   [Command](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/command)
    
    10.  [Observer](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/observer)
    
    11. [Visitor](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/visitor)
    
    12. [Memento](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/memento)

    13. [Pipes Filters](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/pipesfilters)

    14. [Template Method](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/templatemethod)

    15. [Iterator](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/iterator)

    16. [Null Object](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/nullobject)
 
    17. [Strategy](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/strategy)
  
    18. [State]()

- Structural  
    
    19. [Adapter](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/adapter)
    
    20. [Decorator](https://github.com/shubham-v/object-oriented-design-patterns/blob/main/src/main/java/decorator/Decorator.java)
    
    21. [Proxy](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/proxy)

    22. [Bridge](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/bridge)

    23. [Flyweight](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/flyweight)
  
    24. [Facade](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/facade/Facade.java)
        - Way to hide complexity of a subsystem.
        - Do not expose what is not necessary

## Enums
    Use when dealing FINITE set of things

## Manager
    POJO manager, if required

## Status
    - as a enum

## Inheritance vs Composition
    - In inheritance - bound to use everything as a part of subclass
    - In composition - it is providing flixibility, encapsulation, easily extensible, easily modifiable, decoupled
    - Composition avoids Diamond problem
### Favour Composition Over Inheritance (FOI Principle)