//STRATEGY PATTERN

The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

Design Principle:
DP1 :Identify the aspects of your application that vary and separate them from what stays the same.

that means:
take the parts that vary and encapsulate them, 
so that later you can alter or extend the parts 
that vary without affecting those that don’t.

DP2: Design to an interface, not an implementation.

“Program to an interface” really means “Program to a supertype.”

that means:
We’ll use an interface to represent each behavior—for instance,
FlyBehavior and QuackBehavior—and each implementation of a
behavior will implement one of those interfaces.

Previously: We were locked into using that specific
implementation and there was no room for
changing the behavior (other than writing more code).


Programming to an implementation would be:
Dog d = new Dog();
d.bark();

But programming to an interface/supertype would be:
Animal a = new Dog();
a.makeSound();

Even better, rather than hardcoding the instantiation of the 
subtype (like new Dog()) into the code, assign the
concrete implementation object at runtime:
a = getAnimal();
a.makeSound();


DP3: Favor composition over Inheritance
that means

As you’ve seen, creating systems using composition gives 
you a lot more flexibility. Not only does it let you 
encapsulate a family of algorithms into their own set
of classes, but it also lets you change behavior at runtime as 
long as the object you’re composing with implements the correct behavior interface.

HAS-A can be better than IS-A
The HAS-A relationship is an interesting one: 
each duck has a FlyBehavior and a QuackBehavior
to which it delegates flying and quacking.

When you put two classes together like this 
you’re using composition. Instead of inheriting
their behavior, the ducks get their behavior by 
being composed with the right behavior object.