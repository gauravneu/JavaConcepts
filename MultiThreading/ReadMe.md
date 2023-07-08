Concepts Of Multithreading:

Single process can be executed by many threads/many CPUs




Volatile Keyword:
If any variable is volatile, then any update to that field gets flushed to main memory

that means

if any other thread from other CPU has to read that variable, it would be read directly from 
main memory, not from local memory

It also impacts the visibility, if 2 non-volatile variables are getting updated in same block with
volatile one, other 2 variables would also get flushed to main memory