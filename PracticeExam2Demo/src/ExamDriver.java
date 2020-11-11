import java.util.Scanner;
import java.util.ArrayList;


public class ExamDriver
{
   public static void main(String[] args) throws SSException, EmailException
   {
      String name, ssn = null, email = null, choice;
      int count = 0;
      boolean valid;
      
      @SuppressWarnings("resource")
	  Scanner keyboard = new Scanner(System.in);
      // Create an ArrayList object
      ArrayList<Contact> contacts = new ArrayList<Contact>();
      
      do{
    	//prompt for name,SSN and email
         System.out.print("\nEnter the following information to be add to email list");
         System.out.print("\nName: ");
         name = keyboard.nextLine();
         
         valid = true;
         try {
            System.out.print("SSN: ");
            ssn = keyboard.nextLine();
            
            if(validSSN(ssn))
            {
               System.out.print("This SSN entered is valid");
            }
           
         }
         catch(SSException e)
         {
            System.out.print(e.getMessage());
            valid = false;
         }
         
         try {
            System.out.print("\nEmail: ");
            email = keyboard.nextLine();
            
            if(validEmail(email))
            {
               System.out.print("The Email address entered is Valid");
            }
            
         }
         catch(EmailException e)
         {
            System.out.print(e.getMessage());
            valid = false;
         }
         
         if(valid == false)
         {
            System.out.println("\nContact will not be added to contact list due to an error");
         }
         else
         {
            contacts.add(new Contact(name, ssn, email));
            // will count how many valid contacts added
            count++;
            System.out.println("\nContact will be add to the contact list");
         }
         
         System.out.print("Enter Y or y to continue adding contacts,anything else exit: ");
         choice = keyboard.nextLine();
      
      
      }while(choice.equalsIgnoreCase("y"));
      
      for(Contact i: contacts)
         System.out.println(i);
         
      System.out.print("\nThe number of contacts are " + count);
      
   }
   
   /**
 * @param ssn
 * @throws SSException
 * checks to see if that SSN is valid and throws a SSN Exception
 * if the SSN is invalid
 */
public static boolean validSSN(String ssn) throws SSException
   {
      boolean valid = true;
      
      //check for the conditions and throw an exception
      if(ssn.length() != 11)
      {
         throw new SSException("Wrong number of SSN.");
      }
      else
      {
         for(int i = 0; i < ssn.length(); i++)
         {
            if(i == 3 || i == 6)
            {
               if(ssn.charAt(i) != '-')
                  throw new SSException("Dash in the wrong position");
            }
            else
            {
               if(!Character.isDigit(ssn.charAt(i)))
                  throw new SSException("Contains character that is not a digit");
            }
         }
      }
      return valid;
   }
   
   
   /**
 * @param email
 * @throws EmailException
 * checks to see if that email address is valid and throws am email Exception
 * if the email address is invalid
 * 
 */
public static boolean validEmail(String email) throws EmailException
   {
      boolean valid = true;
      
      //check for the conditions and throw an exception
      if(email.length() < 12)
      {
		 throw new EmailException("email address must contain at least 12 characters");
      }
      else if(!email.endsWith("@csc251.com"))
	  {
		 throw new EmailException("email address domain is incorrect");
        
      }
     return valid; 
   }
} 