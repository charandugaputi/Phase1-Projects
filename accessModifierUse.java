package javaPhase1;

public class accessModifierUse {

	public static void main(String[] args) {
		
		
		defaultAccessSpecifier def = new defaultAccessSpecifier();
		def.display();
		

		privateAccessSpecifier priv = new privateAccessSpecifier();
		//priv.view() is not accessible ;    
		//error as private methods  cannot be accessed
}
}

class defaultAccessSpecifier{
	void display() {
		System.out.println("Class with Default Access specifier");
	}


}

class privateAccessSpecifier{

	private void view(){
		System.out.println("Class with Private Access Specifier");
		
	}
	



	}


