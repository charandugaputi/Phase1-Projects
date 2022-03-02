package practiseProjects;

public class myRunnableThread implements Runnable{
	public void run(){  
	System.out.println("thread is running");  
	}  
	  
	public static void main(String args[]){  
	
	myRunnableThread rt=new myRunnableThread();       
	Thread t1 = new Thread(rt);                    
	t1.start();                                     
 }  

}