Design Principle 5: Classes should be open for extension, but closed for modification


Following the Open-Closed Principle usually introduces new levels of abstraction, 
which adds complexity to our code. You want to concentrate on those areas that are 
most likely to change in your designs and apply the principles there.

Decorator Design Pattern:

We have an object, and we can have multiple properties attached to it.
New properties can be added which can be attached



The strategy pattern allows you to change the implementation 
of something used at runtime. The decorator pattern allows 
you augment (or add to) existing functionality with additional functionality at run time.

Think of decorators as Wrappers

1) Decorators have the same supertype as the objects they decorate.
2) You can use one or more decorators to wrap an object.
3) Given that the decorator has the same supertype as the object it
   decorates, we can pass around a decorated object in place of the original (wrapped) object.
4) The decorator adds its own behavior before and/or after 
   delegating to the object it decorates to do the rest of the job.
5) Objects can be decorated at any time, so we can decorate objects dynamically at
   runtime with as many decorators as we like

Problem with normal approach:
If some decorations are repeating or not, there will be multiple combinations of decorators,
which can cause creation of too many classes

And even if one decorator property changes, every combination class will have to be updated.


Inherit by subclassing vs Composition:
by subclassing, behavior is set statically.
Composition makes it dynamic at runtime

By dynamically composing objects, I can
add new functionality by writing new code
rather than altering existing code.

Design Discussion:

1) We are not using composition but using Inheritance:
    We are using it for type matching, not for getting behavior.
    We want our decorator to have same type as object to be decorated.
    So we are not getting behavior by subclassing but by composing objects together
    If we take behavior from inheritance, it would be static nature, then any requiremnet
    would lead to change in code
