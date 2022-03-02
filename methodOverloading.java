package practiseProjects;

public class methodOverloading {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    
	public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }
	
	public void area(float g,int c)
	{
		System.out.println("prnting the value "+ g + "---" +c);
	}
	
	public void area(int h, float g, char m)
	{
		System.out.println("prnting the value h"+ h + "---g  " + g + "----m"+ m);
	}

    public static void main(String args[])
    {
      methodOverloading ob=new methodOverloading();
      ob.area(10.0f,12);
      ob.area(5);  
    }

}
