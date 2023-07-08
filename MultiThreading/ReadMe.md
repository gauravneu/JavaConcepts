Concepts Of Multithreading:

Single process can be executed by many threads/many CPUs




Volatile Keyword:
If any variable is volatile, then any update to that field gets flushed to main memory

that means

if any other thread from other CPU has to read that variable, it would be read directly from 
main memory, not from local memory

Volatile visibility Guarantee : At a time when you are writing/reading a volatile variable,
any other variable visible to thread will also get flushed to main memory.
So you need not declare all variables as volatile,just one is enough.

Volatile happens Before Guarantee:
If there is instruction before volatile variable,it will definitely get executed before volatile variable instruction.
The instructions above can change their order in themselves,
but they can't change order with volatile variable instruction.

Similarly, for read volatile variable is read first and then others are read. The ordering can't be changed.
Ref: https://youtu.be/oY14UyP61F8 16:12

Volatile keyword alone is not enough. It needs "synchronized" keyword.

Synchronized Visibility Guarantee:
For variables inside synchronized block, everytime thread reads these values,
these values would be refreshed from main memory.

Ref: https://youtu.be/oY14UyP61F8 19:07

