package lessionThree.EceptionalHandling;

class userInterfaceOne{
	
	public static void division(int a, int b) throws Exception{
		if(b==0) {
			throw new Exception("The divisior should not be zero");
			
		}
		int x = a/b;
		System.out.println(x);
	}
}

public class ThrowClause {
	public static void main(String args[]) {
		
	try {
		userInterfaceOne.division(3, 0);
	}
	catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	try {
		userInterfaceOne.division(8, 4);
	}
	catch(Exception e) {
			System.out.println(e.getMessage());
		}

	
	}
	

}
