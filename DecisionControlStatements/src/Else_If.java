
public class Else_If {
   public static void grade(int avg){
	 if(avg>=80){
		 System.out.println("Distinction");
	 }else if(avg>=60 && avg<80){
		 System.out.println("First division");
	 }else if(avg>=40 && avg<60){
		 System.out.println("Second division");
	 }else{
		 System.out.println("Try next year");
	 }
   }
	public static void main(String[] args) {
		int s1 = 87;
		int s2 = 56;
		int s3 = 67;
		int s4 = 78;
		int s5 = 89;
		
		int avg = (int)(s1+s2+s3+s4+s5)/5;
		System.out.println("Total marks = "+avg);
        grade(avg);
	}

}
