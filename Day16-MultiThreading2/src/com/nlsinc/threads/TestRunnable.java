package com.nlsinc.threads;



public class TestRunnable {

	public static void main(String[] args) throws InterruptedException {
	 //    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("started "+ 
	Thread.currentThread().getId() +"#"+ 
	Thread.currentThread().getName() + " its Priority = "+ Thread.currentThread().getPriority());
		
		MyRunnable runnable = new MyRunnable();
		/*Thread t1 = new Thread(runnable, "First Thread");
		Thread t2 = new Thread(runnable, "Seco Thread");
		*/
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
	//	t1.start(); // puts the thread in run() method
		//System.out.println("t1 isAlive() >> "+ t1.isAlive());
		t2.setPriority(Thread.MAX_PRIORITY);// round-robin (quantum)
		t2.setDaemon(true);
;		t2.start();

		System.out.println(t2.getPriority());
		/*try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//Thread.sleep(30000);
		System.out.println("t1 isAlive() >> "+ t1.isAlive());
		//t1.start();
		System.out.println("ending main ......");
		

	}

}
