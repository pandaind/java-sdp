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
- **Facade** : The facade design pattern creates an interface that is served as an interface to other interfaces within a system or subsystem. Facade pattern adds an interface to existing system or group of sub systems to hide its complexities. This pattern involves a single class which provides interface with simplified methods required by client and delegates calls to methods of existing system classes.
  - When to use : When application needs a simplified interface to the overall functionality of a complex subsystem.
  - Check List :
    - Identify a simpler, unified interface for the subsystem or component.
    - Design a 'wrapper' class that encapsulates the subsystem.
    - The facade/wrapper captures the complexity and collaborations of the component, and delegates to the appropriate methods.
    - The client uses (is coupled to) the Facade only.
    - Consider whether additional Facades would add value.
  - Rules of thumb :
    - Facade defines a new interface, whereas Adapter uses an old interface. Remember that Adapter makes two existing interfaces work together as opposed to defining an entirely new one.
    - Whereas Flyweight shows how to make lots of little objects, Facade shows how to make a single object represent an entire subsystem.
    - Mediator is similar to Facade in that it abstracts functionality of existing classes. Mediator abstracts/centralizes arbitrary communications between colleague objects. It routinely "adds value", and it is known/referenced by the colleague objects. In contrast, Facade defines a simpler interface to a subsystem, it doesn't add new functionality, and it is not known by the subsystem classes.
    - Abstract Factory can be used as an alternative to Facade to hide platform-specific classes.
    - Facade objects are often Singletons because only one Facade object is required.
    - Adapter and Facade are both wrappers; but they are different kinds of wrappers. The intent of Facade is to produce a simpler interface, and the intent of Adapter is to design to an existing interface. While Facade routinely wraps multiple objects and Adapter wraps a single object; Facade could front-end a single complex object and Adapter could wrap several legacy objects.
- **Fly Weight** : Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found. Flyweight pattern is used to reduce the number of objects created and to decrease memory footprint and increase performance.
  - When to use: Flyweight pattern is used when we need to create a large number of similar objects (which are immutable). This reduces memory foot print and keeps app away  from java.lang.OutOfMemoryError.
  - Check List:
    - Ensure that object overhead is an issue needing attention, and, the client of the class is able and willing to absorb responsibility realignment.
    - Divide the target class's state into: shareable (intrinsic) state, and non-shareable (extrinsic) state.
    - Remove the non-shareable state from the class attributes, and add it the calling argument list of affected methods.
    - Create a Factory that can cache and reuse existing class instances.
    - The client must use the Factory instead of the new operator to request objects.
    - The client (or a third party) must look-up or compute the non-shareable state, and supply that state to class methods.
  - Rules of thumb:
    - Whereas Flyweight shows how to make lots of little objects, Facade shows how to make a single object represent an entire subsystem.
    - Flyweight is often combined with Composite to implement shared leaf nodes.
    - Terminal symbols within Interpreter's abstract syntax tree can be shared with Flyweight.
    - Flyweight explains when and how State objects can be shared.
- **Proxy** : Proxy, in the Java context, is defined as having the authority to represent another object. Proxy means ‘on behalf of’ or 'representing’ or ‘in place of’ are literal meanings of proxy and that directly explains Proxy Design Pattern. A proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes.
  - When to use: 
    - When creation of object is expensive or heavy weight, which means, when a deep object graph is required in the object creation process, then a high weigh proxy objects
    - With basic required fields is created and used until the actual object is not required.
  - Check List:
    - Identify the leverage or "aspect" that is best implemented as a wrapper or surrogate.
    - Define an interface that will make the proxy and the original component interchangeable.
    - Consider defining a Factory that can encapsulate the decision of whether a proxy or original object is desirable.
    - The wrapper class holds a pointer to the real class and implements the interface.
    - The pointer may be initialized at construction, or on first use.
    - Each wrapper method contributes its leverage, and delegates to the wrapper object.
  - Rules of thumb:
    - Adapter provides a different interface to its subject. Proxy provides the same interface. Decorator provides an enhanced interface.
    - Decorator and Proxy have different purposes but similar structures. Both describe how to provide a level of indirection to another object, and the implementations keep a reference to the object to which they forward requests.
