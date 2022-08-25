package exception;

public class Except1{
	public static void main(String[] args)
	{

		try {
			
			int ar[] = { 1, 2, 3, 4, 5 };      //ArrayIndexOutOfBoundsException
			System.out.println(ar[5]);

			int a = 30, b = 0;                   //ArithmeticException
			int c = a/b;  
			System.out.println ("Result = " + c);

			String str= null;                      //NullPointerException
			System.out.println(str.charAt(0));  

			int num = Integer.parseInt ("aravind") ; //InputMismatchException
			System.out.println(num);   
		}
		catch (Exception e) {
			System.out.println("Exceptions");
            
		}
		finally{
			
			System.out.println("This block is always executed");
		}
	}
}