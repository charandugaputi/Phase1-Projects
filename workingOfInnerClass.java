package javaPhase1;

public class workingOfInnerClass {
	public static void main(String[] args) {
		example exm = new example() {

			@Override  
			public void working() {
				System.out.println("anonymous inner class");// anonymous inner class
			}
		};
		exm.working();

		example1 exm1 = new example1();
		exm1.home(new example() {
			@Override
			public void working() {
				System.out.println();
				System.out.println("Argument based anonymous inner class");
			}

		});

		System.out.println();

		new method().new inner().print();

		System.out.println();

	}

}

interface example{
	public void working();
}

class example1 {
	public void home(example ref) {
	ref.working();}
}

class method{
	class inner{
		public void print() {
			System.out.println("Regular inner class");
		}
	}
}

class method1{
	public void func() {
		class inner{
			public void print() {
				System.out.println("Method local inner class");
			}
		}
		new inner().print();
	}

	}

