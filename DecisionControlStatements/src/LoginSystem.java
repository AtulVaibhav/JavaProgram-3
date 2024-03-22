import java.util.Scanner;

class DB{
   public static final String  userName="admin";
   public static final String  password = "admin";
}

public class LoginSystem {
 
    public static void authenticate(Scanner sc){
    	System.out.println("Enter the username");
    	String userName = sc.next();
    	if(userName.equals(DB.userName)){
    		System.out.println("Enter the password");
    		String password = sc.next();
    		if(password.equals(DB.password)){
    			System.out.println("Welcome "+ userName);
    		}else{
    			System.out.println("Invalid password");
    		}
    	}else{
    		System.out.println("Invalid username");
    	}
    }
	public static void main(String[] args) {
		authenticate(new Scanner(System.in));

	}

}
//Scanner