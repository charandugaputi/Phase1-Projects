package javaPhase1;
import java.util.Scanner;

public class arithmeticCalculatorProgram {

	public static void main(String[] args) {
		
			char operator;
			double num1,num2;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the operator + - * /");
			operator = sc.next().charAt(0);

			System.out.println("Enter the two input strings ");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();

			sc.close();

			 switch(operator)
			{
			case '+':
			System.out.println(num1+num2);
			break;
			
			case '-':
			System.out.println(num1-num2);
			break;
			
			case '*':
			System.out.println(num1*num2);
			break;
			case '/':
			if(num2!=0)
			System.out.println(num1/num2);
			else
			System.out.println("Divide by zero error");
			break;

			default:
			System.out.println("%c Invalid operator");
			}
			
			

	}

}
