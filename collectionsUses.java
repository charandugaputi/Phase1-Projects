package javaPhase1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class collectionsUses {

	public static void main(String[] args) {


		
				System.out.println("ArrayList");
				ArrayList<Integer> number=new ArrayList<Integer>();   
			      number.add(1);
			      number.add(11);    	   
			      System.out.println(number);  


			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<String> name = new Vector();
			      name.addElement("david"); 
			      name.addElement("jacob"); 
			      System.out.println(name);
			      for(String nam:name)
			    	  System.out.print(nam+" ");


			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("john");  
			      names.add("josh");  	
			      names.add("james");
			      Iterator<String> itr=names.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  }
			      System.out.println(names);


			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(100);  
			       set.add(200);  
			       set.add(300);
			       set.add(400);
			       set.add(500);
			       System.out.println(set);


			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();  
			       set2.add(10);  
			       set2.add(20);  
			       set2.add(30);
			       set2.add(40);
			       set2.add(50);
			       System.out.println(set2);
			 } 
		
	}


