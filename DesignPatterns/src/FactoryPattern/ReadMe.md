new() -> concrete => programming to implementation
that means if something extra gets added, and we are using new, then we need to modify code
for adding that newly added thing, which would be violation of closed for modification
Coding to implementation means it will work with any class implementing that interface through polymorphism


In the general use of the phrase, a concrete class implementing
a method from a supertype (which could be a abstract class OR 
interface) is still considered to be “implementing the interface” of that supertype.

//All factory patterns encapsulate object creation. The Factory 
Method Pattern encapsulates object creation by letting subclasses
decide what objects to create.//

The Factory Method Pattern defines an interface for creating 
an object, but lets subclasses decide which class to instantiate.
Factory Method lets a class defer instantiation to subclasses.