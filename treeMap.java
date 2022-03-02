package practiseProjects;

import java.util.TreeMap;

public class treeMap {
public static void main(String[] args) {
    	
        TreeMap<String, Integer> marks = new TreeMap<String, Integer>();
        marks.put("Student1", 111);
        marks.put("Student6", 222);
        marks.put("Student2", 333);
        marks.put("Student4", 444);
        
        for(String key: marks.keySet()){
			System.out.println(key  +" : "+ marks.get(key));
        }
    }

}