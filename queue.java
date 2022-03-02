package practiseProjects;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) 
	{
		Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("kerala");
		locationsQueue.add("hyderabad");
		locationsQueue.add("bangalore");
		locationsQueue.add("pune");
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
	}


}