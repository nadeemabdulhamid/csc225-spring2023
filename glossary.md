* (Lecture 1)

- **object**<br>
  A "thing" (more concretely, a collection of binary data - bits) in a running program that has some state (representing its "characteristics") and behavior (representing what it can "do"). Objects take up memory in the computer to keep track of their information. Every object has its own space in memory, so each object has a unique identity (even if it has the same characteristics and behavior as another one). Every object in Java is created (constructed) from a class. An object is also referred to as an **instance** of a class. (See [Section 5.1.1 here](https://math.hws.edu/javanotes/c5/s1.html#OOP.1.1).)
  
  The *state* of the object is stored in its **fields**. The behavior of the object is defined by **methods**.

- **instance**<br>
  See **object**.


- **camel case** [w](https://en.wikipedia.org/wiki/Camel_case)<br>
  A way of writing multi-word **identifiers** in Java where the first word starts off with a lowercase letter; all the words are written together with no spaces or dashes in between; and the initial letter of every word after the first word is capitalized, `justLikeThis`.

- **identifier** [w](https://en.wikipedia.org/wiki/Identifier_(computer_languages))<br>
  A collection of symbols that represents a name for _stuff_ (variables, classes, methods) in a program.

- **comment** [w](https://en.wikipedia.org/wiki/Comment_(computer_programming))<br>
   Text within the source code of a program that is ignored by the computer/compiler. Often used to increase readability and clarity of code by explaining something to a human reader of the code. Sometimes comments are used to temporarily disable portions of code from running.
  
- **class** [w](https://en.wikipedia.org/wiki/Class_(computer_programming)) <br>
  A description or blueprint for creating objects. A class definition describes the contents (**fields**) and behavior (**methods**) of objects that are created based on it. When an object is created by a **constructor** of the class, the resulting **object** is also called an **instance** of the class. (A class definition is similar to a structure definition, except that structures _only_ have data fields associated with them, not behavior.)

- **field** [w](https://en.wikipedia.org/wiki/Field_(computer_science)) <br>
  A particular piece of data embedded or encapsulated in a class or object. In the case of a regular field (also called **instance variable**), for each instance of the class there is an instance variable: for example, an `Employee` class may have a `name` field, resulting in one distinct `name` associated with each individual employee object created from that class.

- **constructor** [w](https://en.wikipedia.org/wiki/Constructor_(object-oriented_programming)) <br>
  A special [function](https://en.wikipedia.org/wiki/Function_(computer_programming)) that initializes the contents of a newly created object of a class. In Java, constructors have exactly the same name as the class they are in. Constructors differ from **methods** in that they do not have an explicit return type. They are expected to prepare the object so that it is in a valid state once the constructor is finished.

- **compile** [w](https://en.wikipedia.org/wiki/Compiler) <br>
  The process of translating computer code written in one programming language (the _source_ language) into another language (the _target_ language). A program that carries out this process is called a "compiler." The name "compiler" is primarily used for programs that translate source code from a high-level programming language to a low-level programming language (e.g. assembly language, object code, or machine code) to create an executable program.

  The process of running a Java program involves _compiling_ source code (stored in a `.java` file) to JVM (Java Virtual Machine) bytecode (stored in a `.class` file), and then executing that bytecode using another "just-in-time" compiler that translates the bytecode to the raw machine code for the computer that is being used.


* (Lecture 2)

* (Lecture 3)
- class diagram
- object diagram
- UML
- breakpoint
- instance variable
- interface
- dispatch
- (method) invocation
- inheritance relationship
- containment relationship



