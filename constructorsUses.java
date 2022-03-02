package javaPhase1;

public class constructorsUses {
	
	int Id;
	String name;
	void display() {
		System.out.println(Id +" : "+ name);
	}
	

		public static void main(String[] args) {
			constructorsUses emp1 = new constructorsUses();
			emp1.display();
			//default constructor gave values 0 and null



			paraConstructor emp2 = new paraConstructor(12345, "David");

		}

	}
	class paraConstructor{
		int id1;
		String name;
		paraConstructor(int id1,String name) {// parameterized constructor
			this.id1 = id1;
			this.name = name;
			System.out.println(id1 +" : "+ name);

	}

}
