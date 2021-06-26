# java-sdp
Java Structural Design Pattern Practice

​	

| **Object Scope** | **Class Scope** |
| ---------------- | --------------- |
| Adapter object   | Adapter class   |
| Bridge           |                 |
| Composite        |                 |
| Decorator        |                 |
| Facade           |                 |
| Flyweight        |                 |
| Proxy            |                 |

- **Adapter** :  The adapter design pattern is used to convert an interface of one class into another interface
  expected by the system. Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces. The Adapter Pattern is also known as Wrapper.
  - When to use : When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
  - Check List : 
    - Identify the players: the component(s) that want to be accommodated (i.e. the client), and the component that needs to adapt (i.e. the adaptee).
    - Identify the interface that the client requires.
    - Design a "wrapper" class that can "impedance match" the adaptee to the client.
    - The adapter/wrapper class "has a" instance of the adaptee class.
    - The adapter/wrapper class "maps" the client interface to the adaptee interface.
    - The client uses (is coupled to) the new interface
  - Rules of thumb :
    - Adapter makes things work after they're designed; Bridge makes them work before they are.
    - Bridge is designed up-front to let the abstraction and the implementation vary independently. Adapter is retrofitted to make unrelated classes work together.
    - Adapter provides a different interface to its subject. Proxy provides the same interface. Decorator provides an enhanced interface.
    - Adapter is meant to change the interface of an existing object. Decorator enhances another object without changing its interface. Decorator is thus more transparent to the application than an adapter is. As a consequence, Decorator supports recursive composition, which isn't possible with pure Adapters.
    - Facade defines a new interface, whereas Adapter reuses an old interface. Remember that Adapter makes two existing interfaces work together as opposed to defining an entirely new one.
- Bridge : The bridge design pattern simply separates abstraction from implementation. This design pattern involves creating a bridge between abstraction and implementation The bridge pattern can also be thought of as two layers of abstraction. Bridge pattern Decouples an abstraction so two classes can vary independently.
  - When to use : When we need to make functionality of concrete classes independent from interface implementer classes. Both types of classes can be altered structurally without affecting each other.
  - Check List :
    - Decide if two orthogonal dimensions exist in the domain. These independent concepts could be: abstraction/platform, or domain/infrastructure, or front-end/back-end, or interface/implementation.
    - Design the separation of concerns: what does the client want, and what do the platforms provide.
    - Design a platform-oriented interface that is minimal, necessary, and sufficient. Its goal is to decouple the abstraction from the platform.
    - Define a derived class of that interface for each platform.
    - Create the abstraction base class that "has a" platform object and delegates the platform-oriented functionality to it.
    - Define specializations of the abstraction class if desired.
  - Rules of thumb :
    - Adapter makes things work after they're designed; Bridge makes them work before they are.
    - Bridge is designed up-front to let the abstraction and the implementation vary independently. Adapter is retrofitted to make unrelated classes work together.
    - State, Strategy, Bridge (and to some degree Adapter) have similar solution structures. They all share elements of the "handle/body" idiom. They differ in intent - that is, they solve different problems.
    - The structure of State and Bridge are identical (except that Bridge admits hierarchies of envelope classes, whereas State allows only one). The two patterns use the same structure to solve different problems: State allows an object's behavior to change along with its state, while Bridge's intent is to decouple an abstraction from its implementation so that the two can vary independently.
    - If interface classes delegate the creation of their implementation classes (instead of creating/coupling themselves directly), then the design usually uses the Abstract Factory pattern to create the implementation objects.
