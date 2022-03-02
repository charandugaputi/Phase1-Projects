package practiseProjects;

import java.util.Scanner;

public class linearSearch {
	public static void main(String[] args){

        int[] arr = {12,23,45,67,89};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int searchValue = sc.nextInt();
        
        int result = linearing(arr,searchValue);
        if(result==-1){

                System.out.println("number not in the array");
            } else {

                System.out.println("number found at "+result+" and the search key is "+arr[result]);
            }
        }

public static int linearing(int arr[], int x) {

    int arrlength = arr.length;
    for (int i = 0; i < arrlength - 1; i++) {

        if (arr[i] == x) {
            return i;
         }
     }
            return -1;
   }


}