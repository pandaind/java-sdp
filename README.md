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
- **Bridge** : The bridge design pattern simply separates abstraction from implementation. This design pattern involves creating a bridge between abstraction and implementation The bridge pattern can also be thought of as two layers of abstraction. Bridge pattern Decouples an abstraction so two classes can vary independently.
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
- **Composite** : Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This pattern creates a class that contains group of its own objects.
  - When to use: Composite Pattern should be used when clients need to ignore the difference between compositions of objects and individual objects and needs to handles them in the same way.
    - Has for participants :
      - Component – Component declares the interface for objects in the composition and for accessing and managing its child components. It also implements default behavior for the interface common to all classes as appropriate.
      - Leaf – Leaf defines behavior for primitive objects in the composition. It represents leaf objects in the composition.
      - Composite – Composite stores child components and implements child related operations in the component interface.
      - Client – Client manipulates the objects in the composition through the component interface.
  - Check List :
    - Ensure that your problem is about representing "whole-part" hierarchical relationships.
    - Consider the heuristic, "Containers that contain containees, each of which could be a container." For example, "Assemblies that contain components, each of which could be an assembly." Divide your domain concepts into container classes, and containee classes.
    - Create a "lowest common denominator" interface that makes your containers and containees interchangeable. It should specify the behavior that needs to be exercised uniformly across all containee and container objects.
    - All container and containee classes declare an "is a" relationship to the interface.
    - All container classes declare a one-to-many "has a" relationship to the interface.
    - Container classes leverage polymorphism to delegate to their containee objects.
    - Child management methods [e.g. `addChild()`, `removeChild()`] should normally be defined in the Composite class. Unfortunately, the desire to treat Leaf and Composite objects uniformly may require that these methods be promoted to the abstract Component class. See the Gang of Four for a discussion of these "safety" versus "transparency" trade-offs.
  - Rules of thumb:
    - Composite and Decorator have similar structure diagrams, reflecting the fact that both rely on recursive composition to organize an open-ended number of objects.
    - Composite can be traversed with Iterator. Visitor can apply an operation over a Composite. Composite could use Chain of Responsibility to let components access global properties through their parent. It could also use Decorator to override these properties on parts of the composition. It could use Observer to tie one object structure to another and State to let a component change its behavior as its state changes.
    - Composite can let you compose a Mediator out of smaller pieces through recursive composition.
    - Decorator is designed to let you add responsibilities to objects without sub-classing. Composite's focus is not on embellishment but on representation. These intents are distinct but complementary. Consequently, Composite and Decorator are often used in concert.
    - Flyweight is often combined with Composite to implement shared leaf nodes.
- **Decorator** : The decorator design pattern allows us to assign responsibilities to an object without impacting the class. Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This pattern creates a decorator class which wraps the original class and provides additional functionality keeping the class methods signature intact.
  - When to use : When you want to get rid of too many sub classes by creating separate class for each combination.
  - Check List :
    - Ensure the context is: a single core (or non-optional) component, several optional embellishments or wrappers, and an interface that is common to all.
    - Create a "Lowest Common Denominator" interface that makes all classes interchangeable.
    - Create a second level base class (Decorator) to support the optional wrapper classes.
    - The Core class and Decorator class inherit from the LCD interface.
    - The Decorator class declares a composition relationship to the LCD interface, and this data member is initialized in its constructor.
    - The Decorator class delegates to the LCD object.
    - Define a Decorator derived class for each optional embellishment.
    - Decorator derived classes implement their wrapper functionality - and - delegate to the Decorator base class.
    - The client configures the type and ordering of Core and Decorator objects.
  - Rules of thumb :
    - Adapter provides a different interface to its subject. Proxy provides the same interface. Decorator provides an enhanced interface.
    - Adapter changes an object's interface, Decorator enhances an object's responsibilities. Decorator is thus more transparent to the client. As a consequence, Decorator supports recursive composition, which isn't possible with pure Adapters.
    - Composite and Decorator have similar structure diagrams, reflecting the fact that both rely on recursive composition to organize an open-ended number of objects.
    - A Decorator can be viewed as a degenerate Composite with only one component. However, a Decorator adds additional responsibilities - it isn't intended for object aggregation.
    - Decorator is designed to let you add responsibilities to objects without sub-classing. Composite's focus is not on embellishment but on representation. These intents are distinct but complementary. Consequently, Composite and Decorator are often used in concert.
    - Composite could use Chain of Responsibility to let components access global properties through their parent. It could also use Decorator to override these properties on parts of the composition.
    - Decorator and Proxy have different purposes but similar structures. Both describe how to provide a level of indirection to another object, and the implementations keep a reference to the object to which they forward requests.
    - Decorator lets you change the skin of an object. Strategy lets you change the guts.
- 
