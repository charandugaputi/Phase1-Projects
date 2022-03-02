package javaPhase1;

public class differentMethodsOfDifferentReturnTypes {

	public static void main(String[] args) {
		
			int addition = addition(12,8);
			System.out.println("The sum of 12 and 8 is "+ addition);

			System.out.println();


			callingMethod cal = new callingMethod();

			System.out.println("Call by value Before is "+cal.value);
			cal.change(200);
			System.out.println("Call by value after is "+cal.value);

			System.out.println();

			area(10,5);

			area(15);
		}

		static int addition(int num1, int num2){

			return num1 * num2;

		}

		static void area(int num1, int num2) {
			System.out.println("The area of rectangle is "+ (num1 * num2));
		}
		static void area(int num1) {
			System.out.println("The area of square is "+ (num1 * num1));
		}

	}

	class callingMethod{
		int value = 100;

		int change(int value) {
			this.value = value + 200;
			return this.value;

	}

}
