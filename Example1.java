package exceptions;

public class Example1 {

	public static void main(String[] args) {
		
		
		//ArithematicException
		System.out.println(10/2);
		System.out.println(10+2);
		System.out.println(10-2);
		System.out.println(10/5);
		System.out.println(10*2);
		try {
			System.out.println(10/0);

		}
		catch (Exception e) {
			//System.out.println(e);
		}
		System.out.println(20/2);
		System.out.println(20*2);
		System.out.println(30-4);
		System.out.println(10-25);


	}

}
