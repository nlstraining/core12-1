// Multithreading  or Concurrent programming 
// Multitasking ? working with different application a t time
// Multi-user (Unix many users share same system ) 
// and multitasking? ( windows - single user running multiple applications)
//  Multi-processor system
// Parallel programming?

// Multi-tasking - One processor running many processes (apps) on one processor
 // out of all the processes only one will be active / user interacts 
// each process has separate address , memory and task

// multi-threading: one process and within that one process multiple threads ( child-processes) will be running
// all threads will be running in the same process address space
// A thread is a single sequential flow of execution in a program 
// Therefore Java main method is a thread - main thread
// A thread is an object in Java 

//  while you are browsing you can download too, listen to music too, sent papers for printing
// why you want to start child processes / threads?
// we want to utilize the CPU time more effectively
// Hop-on-hop-off - London

public class TestThreads {

	public static void main(String[] args) {
		
		System.out.println("started main......");
		MyThread mt = new MyThread("first");
		
		mt.start();
	MyThread mt2 = new MyThread("second");
		
		mt2.start();  // mt2.run() never 
		
	//	Thread.currentThread().notify();
	System.out.println("Exiting mai()");
	}

}
