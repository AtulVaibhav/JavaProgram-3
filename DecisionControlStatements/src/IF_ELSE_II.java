
public class IF_ELSE_II {
   public static String isPositiveEven(int num){
	   if(num>0 && num%2==0){
		   return num+" is a positive even number";
	   }else{
		   return num+" is not a positive even number";
	   }
   }
   
   public static String check(int num){
	   if(num>0){
		   if(num%2==0){
			   return num+" is a positive even number";
		   }
	   }else{
		   return num+" is not a positive even number";
	   }
	   return "";
   }
	public static void main(String[] args) {
	  //System.out.println(isPositiveEven(6));
		System.out.println(check(6));

	}

}
