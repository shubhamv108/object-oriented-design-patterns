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


## SOLID
- conventions 
- create maintainable, extensible, flexible s/w 
- SOLID principle provides/helps
  - Testing
  - Modularity
  - Coupling
### Single Responsibility Principle
- A class should have only one reason/responsibility to change.
- class adheres to SRP
  - Identify responsibility
  - Separation of concerns
- Scenarios that violate SRP
    - God class
      - split into smaller classes handling single reposibility
### Open-Closed Principle
- A class should be open for extension but closed for modification
### Liskov-substitution
- Base/Derieved class pointer should be interchangeable
- object of super class should be easily replecable with object of subclass
- subclass should preserve behavior of superclass
- requires
  - Behavorieal Presentation
### Interface seggregation
- A class should not "forced to" implement interfaces or implement interface methods which it does not require
- remove/avoid unnecessary dependencies
- flexibility/dependencies
- What should not do 
  - Avoid bloating 
### Dependency Inversion
- Use interface/abstract class for dependency rather concrete implementation
- loose coupling
- Flexible, easier to test, maintable

##### Inversion of control
- 

## Design Patterns
    - Typical solutions to commonly occurring problems in software design.
    - Blueprints that can be used to customize to solve a particular design problem in your code.
    - Well known way of solving a well known problem. (Template for solving problem)
    - Simpler communication in one phrase

### Object Oriented Design Patterns
- Creational
    
    1.   [Builder](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/builder)
          - Seperate construction of object from its representation.
          - avoiding a constructor with numerous parameters
          - Perform validations
          - Creation of object is easier and resillient
          - Director - any class orchestrates the construction process using builder interface to construct actual objects.
          - Final objects return to client by Director
          - complexity
          - enhancement
          - loose coupling
          - extensibility
    
    2.   [Factory](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/factory)
         - Segregating the logic for creating the object wherever required
    
    3.   [Prototype](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/prototype)
         - Cloning of the object (based on the existing ones)
         - Document Management system (clone document)
         - DB entity (clone db entity)
         - configuration management
    
    4.   [Singleton](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/singleton)
         - Single object getting created throughout the scope of execution.
         - Can achieve thread safety
    5.   [Abstract Factory](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/abstractfactory)
         - Interface for Factory of similar objects without concrete classes

    6.   [Factory Method](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/factorymethod)
    
- Behavioral

    7.   [Strategy](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/strategy)

    8.   [Chain of Responsibility](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/chainofresponsibility)
         - Allows an object to pass through a chain of handler.
         - Handlers will decide either to process or pass the request to next handler.
    
    9.   [Command](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/command)
         - Required when want to convert Actions/Requests/Methods into first class entity(object)
         - Encapsulates the requests as an object which allows parameterization of client
    
    10.  [Observer](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/observer)
         - For notifications
         - Observer
         - Observable
         - One to Many relationship
         - change in 1 leads to chnage in multiple
         - without making tightly coupled
         - dynamic chnages in number of observers and their types
         - when to use
           - Flexibilty & decoupling
           - Real-Time updates
           - Dynamic Relationships
    
    11. [Visitor](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/visitor)
    
    12. [Memento](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/memento)

    13. [Pipes Filters](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/pipesfilters)

    14. [Template Method](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/templatemethod)

    15. [Iterator](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/iterator)

    16. [Null Object](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/nullobject)
 
    17. [Strategy](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/strategy)
        - selecting algorithm or behaviour at runtime
        - encourages composition over inheritance
  
    18. [State]()
        - allow state change when behaviour is going to be chnaged
        - encapsulation of the behavior associated with the state
        - Behavior of a particular classes and entities
        - deals with conditional aspects
        - context - mantains current state of the object

- Structural  
    
    19. [Adapter](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/adapter)
        - Allows objects with incompatible interfaces to work together.
        - Acting as a bridge b/w incompatible interfaces
        - "adpats" the interface of one class to match interface of another class
        - usability
          - Integrate with 3rd party libraries or APIs
          - Legacy System Interoperability
          - Interface Standardization in Large Systems
    
    20. [Decorator](https://github.com/shubham-v/object-oriented-design-patterns/blob/main/src/main/java/decorator/Decorator.java)
        - add additional responsibilities dynamically
        - used with Inheritance
        - used for Open Closed Principle
        - maintains interface to pizza object
        - Structure
          - Component
          - ConcreteComponent
          - Decorator (Wrapper along with Reference to component)
          - Concrete Decorator
        - example: Pizza, Coffee, Premium subscription
    
    21. [Proxy](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/proxy)
        - Placeholder to control and access another object without modifying the code
        - lazy loading of object or initialization on demand
        - control access. example security construct
        - Usage & Usability
          - Adding layer of control over real object
          - lazy loading of expensive operation
          - access control from the object
        - Use cases
          - Caching
          - Logging
          - Login

    22. [Bridge](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/bridge)

    23. [Flyweight](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/flyweight)
  
    24. [Facade](https://github.com/shubham-v/object-oriented-design-patterns/tree/main/src/main/java/facade/Facade.java)
        - Way to hide complexity of a subsystem.
        - "Do not expose what is not necessary" principle
        - loose coupling
        - high level user-friendly interface
        - encourages encapsulation
        - separation of concerns so that client have easiness to use the subsystem

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

## Clean Code Practices
    1.  Names of variables
    2.
    3.  Comments
         eg. counter++; // Adding 1 to counter   X
             counter++; // Incrementing counter
    4.  Cormatting/Indentation
    5.  Avoiding Magic numbers
    6.  Exception
    7.  Duplicate code avoiding (DRY)
    8.  Single Responsibility principle
    9.  Methods/Codebase should be small
    10. Classes should be small
    11. Clean/readable Unit test + cover all scenarios (very important)