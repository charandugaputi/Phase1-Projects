package practiseProjects;

public class binarySearch { 
	public static  void main(String[] args){

    int[] arr = {10,20,30,40,50,60,70,80,90,19,45};
    int key = 50;
    int arrlength = (arr.length-1);  
    binarySearch(arr,0,key,arrlength);
}

public static void binarySearch(int[] arr, int start, int key, int length){

    int midValue = (start+length)/2;       
    while(start<=length){

        if(arr[midValue]<key){
            start = midValue + 1;
        } else if(arr[midValue]==key){
            System.out.println("number is found at index :"+midValue);
            break;
        }else {

            length=midValue-1;
        }
        midValue = (start+length)/2;
    }
        if(start>length){

            System.out.println("number is not found");
        }      
}

}