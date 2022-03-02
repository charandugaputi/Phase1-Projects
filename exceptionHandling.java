package practiseProjects;

public class exceptionHandling {
	public static void main(String[] args){
		int num1,num2,num3;
		num1=10;
		num2=13;

		try{
			num3 = num1/num2;
			System.out.println("Result is "+num3);		  
		}	
		catch(ArithmeticException ae){ 
			System.out.println("Numbers cannot be divided by zero");
		}
		catch(Exception ae1) 
		{
			System.out.println("i am before the subclass exception");
		}
		finally
		{
			System.out.println(" this block will always be executed");
		}

		num3=num1+num2;              
		System.out.println("Result after addition is "+num3);
	}

}