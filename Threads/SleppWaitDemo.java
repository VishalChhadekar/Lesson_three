package lessionThree.Threads;

public class SleppWaitDemo {
	private static Object LOCK = new Object();
	public static void main(String args[]) {
		try {
			Thread.sleep(1000); //lock is held by current thread
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
	        synchronized (LOCK) 
	        {
	            try {
					LOCK.wait(1000);//lock is released by the current thread
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
	        }
		
	}

}

