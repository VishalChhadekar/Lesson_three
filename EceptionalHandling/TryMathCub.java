package lessionThree.EceptionalHandling;

public class TryMathCub {
	
	public int cube(int a) {
		return a*a*a;
		
	
	}
	
	public static void main(String args[]) {
		try {
		TryMathCub tm = new TryMathCub();
		int num = Integer.parseInt("One"); //we'll get exception, cause we are passing one, instead we should 1
//		int num = Integer.parseInt("1"); //will work fine
		System.out.println(tm.cube(num));
		
		}
		catch(NumberFormatException e){
			System.out.println("Invalid integer is passed");
		}
		
		
		try {
			TryMathCub tm1 = new TryMathCub();
			int num = 2;
			
			System.out.println(tm1.cube(num));
			}
			catch(NumberFormatException e){
				System.out.println("Invalid integer is passed");
			}
	}

}
