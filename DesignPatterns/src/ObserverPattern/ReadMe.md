Observer Pattern:

Publishers + Subscribers = Observer Pattern

People can register or deregister and depending on that they get updates.

Observers update something, anytime subject has an update.

The Observer Pattern defines a one-to-many relationship between a set of objects.

When the state of one object changes, all of its dependents are notified.

Because the subject is the sole owner of that data, the observers are dependent on the subject to update them when the
data changes. This leads to a cleaner OO design than allowing many objects to control the same data.

Design Principle 4: Strive for loosely coupled designs between objects that interact