import java.util.Scanner;

public class SwitchStatement {
    public static void m1(){
    	System.out.println("m1() method called");
    }
    public static void m2(){
    	System.out.println("m2() method called");
    }
    public static void m3(){
    	System.out.println("m3() method called");
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        System.out.println("1.m1  2.m2   3.m3");
        System.out.println("Select any option-");
        int choice = sc.nextInt();
        switch(choice){
        case 1:m1();
               break;
        case 2:m2();
               break;
        case 3:m3();
               break;
        default:System.out.println("Invalid option");
        }
        System.out.println("Out of switch");
	}

}
