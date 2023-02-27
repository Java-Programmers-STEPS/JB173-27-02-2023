package exceptions;

public class IndexOfOutBoundsExceptions {
	public static void main(String[] args) {
//StringIndexOutOfBoundsException
		String name = "Sreelakshmi";
		System.out.println(name.length());
		System.out.println(name.charAt(10));
		try {
			System.out.println(name.charAt(20));

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		int array1[]= {2,3,5};
		System.out.println(array1.length);
		
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
		//ArrayIndexOutOfBounds
		System.out.println("ArrayIndexOutOfBounds");
		
		try {
			for(int i=0;i<=array1.length;i++)
			{
				System.out.println(array1[i]);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(array1[5]);
	}

}
