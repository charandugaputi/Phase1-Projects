package javaPhase1;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;


public class usesOfMap {

	public static void main(String[] args) {
					
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(1,"john");    
			      hm.put(2,"jacob");    
			      hm.put(3,"david");   

			      System.out.println("\n Elements of Hashmap are ");  
			      for(Map.Entry m:hm.entrySet()){    
			       System.out.println(m.getKey()+" "+m.getValue());    
			      }



			      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  

			      ht.put(4,"zack");  
			      ht.put(5,"jack");  
			      ht.put(6,"james");  
			      ht.put(7,"joe");  

			      System.out.println("\n Elements of HashTable are ");  
			      for(Map.Entry n:ht.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }





			      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			      map.put(8,"roy");    
			      map.put(9,"joseph");    
			      map.put(10,"michael");       

			      System.out.println("\n Elements of TreeMap are ");  
			      for(Map.Entry l:map.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      } 


			}

		

	}


