Functional Interface:
    An interface which only contains one abstract method but can have multiple default and static methods
        Runnable        -->     run()
        Callable        -->     call()
        Comparable      -->     compareTo()
        Comparator      -->     compare()

    We use @FunctionalInterface annotation to make that interface as functional interface and if we try to add more than
    1 abstract method, it would throw error


Without lambda expression, we would be forced to use traditional approach of implementing the
interface and over-riding the method.
Lambda methods reduce the code length in applications

Consumer Functional Interface --> in-built functional interface which can be used when an object
                                needs to be consumed.
                                It takes input, performs some operation but doesn't return anything
                                void accept(T t);


Predicate Functional Interface --> for conditional check.
                                boolean test(T t);

Supplier Functional Interface --> when there is no input, but output is expected.
                                T get();
