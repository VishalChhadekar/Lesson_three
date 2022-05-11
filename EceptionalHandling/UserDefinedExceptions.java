package lessionThree.EceptionalHandling;

class MydivisionException extends Exception{
	MydivisionException(String message) {
		super(message);
	}
}


class UserDefinedExceptions
{
    public static void divide(int x, int y) throws MydivisionException {
        if(y == 0)
           throw new MydivisionException("The divisor should not be zero");
        int z = x/y;
            System.out.println((double)z);
    }
    
    public static void main(String[] args)
    {
        try
        {
        divide(6,0);
        
        }catch(MydivisionException e) {
            System.out.println(e.getMessage());
        }
        
        try
        {
        divide(18,6);
        
        }catch(MydivisionException e) {
            System.out.println(e.getMessage());
        }
        finally //finally will execute not matter what
        {
            System.out.print("Thank you using this!");
        }

    }
}