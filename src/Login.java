import java.util.regex.Pattern;
import java.util.regex.Matcher;
        
public class Login {
    private String username, password, phoneNumber;
    
    
public Login(String username,String password,String phoneNumber){
    this.username = username;
    this.password = password;
    this.phoneNumber = phoneNumber;
    
}
boolean checkUsername (String username1){
    return (username.contains("_")&& username.length() <=5);
              
}
boolean checkPassword () {
   return (password.length() >=8 &&
       password.matches(".[A-Z].") && 
       password.matches(".\\d.") &&
       password.matches(".!@#^.*"));
}
boolean checkPhoneNumber(){
  String regex =  "^\\+27d{9}$";
        return true;
}
   public String registerUser(String username,String password , String phoneNumber){
    if(checkUsername(username)&& checkPassword() && checkPhoneNumber()){
        System.out.println("Account created successfully!");
        return "Success";

    } else {
        System.out.println("Registration failed. Try again.");
        return "Failed";
    }
    
   }
   boolean LoginUser() {
       return this.username.equals(username) && this.password.equals(password);
   }
}

    
