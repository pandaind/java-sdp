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
- 
