package practiseProjects;

public class callByValue {
	
	int val=120;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		callByValue d = new callByValue();
		System.out.println("Before operation value of data is "+d.val);
		int f= d.operation(100);
		System.out.println("After operation value of data is "+f);
		}

}