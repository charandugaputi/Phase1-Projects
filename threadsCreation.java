package practiseProjects;

public class threadsCreation extends Thread 
	{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		threadsCreation tc = new threadsCreation();
	  		tc.start();
	 	}

	}
