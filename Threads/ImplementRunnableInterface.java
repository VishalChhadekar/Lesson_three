package lessionThree.Threads;

class mythreadrunnable1 implements Runnable{
	public void run() {
		for(int i=0; i<100; i++) {
		System.out.println("This is thread 1");
	}
	}
}

class mythreadrunnable2 implements Runnable{
	public void run() {
		for(int i=0; i<100; i++) {
		System.out.println("This is thread 2");
	}
	}
}
public class ImplementRunnableInterface {
	public static void main(String args[]) {
		mythreadrunnable1 bullet1 = new mythreadrunnable1();
		Thread gun1 = new Thread(bullet1);
		
		mythreadrunnable2 bullet2 = new mythreadrunnable2();
		Thread gun2 = new Thread(bullet2); //putting bullet into gun, to make it useful.
		//created thread and provide runnable to it.
			
		//if we have created obj of a class which implements runnable interface, 
		//then we can't call the start method directly
		gun1.start();
		gun2.start();
	}

}

