
import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountCreation {
    
     Scanner input = new Scanner(System.in);
     
     String username;
     String password;
     String cellPhoneNumber;
     
     public void register (String register) {      
         
         Login login = new Login(username,password,register);
     
     //Username
    System.out.print("Enter username:");
    username =input.nextLine();
    
    if (username.contains("_")&& username.length() <=5) {
        System.out.println("Username successfully captured.");
        
    } else{
        
       System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length");
            return;  
    }
    //Password Validation
    System.out.print("Enter password:");
    password = input.nextLine();
    
    if(login.checkPassword()){
        System.out.println("Password successfully captured.");
        
    }else{
        
          System.out.println("Password must be at least 8 characters, contain a capital letter, a number, and a special character.");
            return;
    }
    //PhoneNumber Validation
    System.out.print("Enter Cell phone number");
    cellPhoneNumber = input.nextLine();
    
    String regex ="^\\+d{11}$";
    
    if(Pattern.matches(regex,cellPhoneNumber)) {
        System.out.println("Cell phone number successfully captured");
        
    } else {
        
        System.out.println("Invalid cell phone number format.Use South African format + and atleast 11 digits.");
          return;
    }
    
    System.out.println("Account created successfully!");
    
    }
    
    public static void main (String[] args) {
        Login account = new Login("","","");
        account.checkPassword();
        account.checkPhoneNumber();
        
        
   
}
}
    
    
