public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);

	}
	
@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println("name = " + getName() + "is @" + i);
		}
	}

}
