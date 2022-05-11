package lessionThree.Threads;

//code to demonstrate how multi-threading works.
class mythread1 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (i < 500) {
			System.out.println("Making dinner");
			i++;
		}
	}
}

//another class 
class mythread2 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (i < 500) {
			System.out.println("Chatting on phone!");
			i++;
		}
	}
}

public class ExtendThreadClass {
	public static void main(String args[]) {
		mythread1 m1 = new mythread1();
		mythread2 m2 = new mythread2();

		m1.start(); // internally start() method calling to run() method from Thread class
		m2.start();

	}
}