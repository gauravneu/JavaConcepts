Every thread has its own stack which is accessible only by that particular thread

Heap can be accessed by all the threads.
if data has to be shared between threads, it has to be shared through heap.
On thread stack, all local variables are saved and also references of objects and those objects would be on heap.
So for object, they would have their own reference for same object
