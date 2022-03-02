package practiseProjects;

public class strings {
	public static void main(String[] args) {
	
		System.out.println("Methods of Strings");
		
		String sl=new String("Hello Everyone");
		System.out.println(sl.length());

		
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));


		String s1="Guys";
		String s2="Guyz";
		System.out.println(s1.compareTo(s2));

	
		String s4="";
		System.out.println(s4.isEmpty());


		String s5="Guys";
		System.out.println(s1.toLowerCase());
		
	
		String s6="Guyz";
		String replace=s2.replace('d', 'l');
		System.out.println(replace);

	
		String x="Welcome to Bangalore";
		String y="WeLcOmE tO bANgaLoRe";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");

		StringBuffer s=new StringBuffer("Welcome to Bangalore");
		s.append("Enjoy your trip");
		System.out.println(s);

		s.insert(0, 'w');
		System.out.println(s);

		StringBuffer sb=new StringBuffer("Guys");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);


		sb.delete(0, 1);
		System.out.println(sb);
	
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("trip");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Guys"; 
        
        
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
       
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("Everyone"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}


}