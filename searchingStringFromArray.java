package javaPhase1;
import java.util.Scanner;

public class searchingStringFromArray {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many people you need");
		number = input.nextInt();
		input.skip(System.lineSeparator());
		String []names=new String[number];
		for(int value=0; value<number; value++) {
			System.out.println("Enter name of  member"+(value+1));
			names [value]=input.nextLine();
				}
		input.close();
		System.out.println("members are:");
		for(int value =0; value<number; value++) {
			System.out.println(names[value]);
		}
		
		

	
	

	}



	}


