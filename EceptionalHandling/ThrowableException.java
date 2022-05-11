package lessionThree.EceptionalHandling;

class userInterface{
	public static void division(int a, int b) {
	try {
		if(b==0) {
			throw new Exception("The Diviser should not be zero");
			//throw keyword is used to throw an exception explicitly, 
			//but, the instance must of throwable class
		}
		int z = a/b;
		System.out.println("The result: "+ z);
			
		}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
}
	


public class ThrowableException {
	public static void main(String args[]) {
		userInterface.division(4, 0);
		userInterface.division(3, 4); 
		userInterface.division(8, 4); 
		//cannot make a static reference to non-static method, thus we have make division method as static
		
		
	}

}
