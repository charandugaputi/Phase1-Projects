package practiseProjects;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 public class emailValidationProgram {
			
	  public static boolean isValidEmail(String email) {
			   String regex = "^(.+)@(.+)$";
			  //initialize the Pattern object
		       Pattern pattern = Pattern.compile(regex);
		       Matcher matcher = pattern.matcher(email);
		       return matcher.matches();
              }

			   public static void main(String[] args) {
			       List<String> emails = new ArrayList<String>();
			     
			       
			       emails.add("exm@exm.com");      // valid email addresses
			       emails.add("exm123@exm.com");
			       emails.add("exm@exm.exm.exm");
			       
			     
			       
			       
			       emails.add("exm.exm.com");  //invalid email address

			       for (String value : emails) {
			           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid\n"));
			       }
			       
			        System.out.println("\n  ---Check your Email is valid or invalid--- ");

			        
			       System.out.println("  \n  Enter an email to check:");
			       Scanner sc = new Scanner(System.in);
			       String input = sc.nextLine();
			       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
			       
			   }
			   
	}

 