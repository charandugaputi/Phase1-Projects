package practiseProjects;
class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class constructors {
	public static void main(String[] args) {

		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();

		emp1.display();
		emp2.display();
		}
	}

	class Student{
		int id;
		String name;

		Student(int i,String n)
		{
		id=i;
		name=n;
		}

		void display() {
		System.out.println(id+" "+name);
		}

	public class constructorDemo {
	public static void main(String[] args) {

		Student std1=new Student(15,"John");
		Student std2=new Student(117,"Tom");
		std1.display();
		std2.display();
			}

	}
}