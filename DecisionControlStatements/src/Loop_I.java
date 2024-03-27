
public class Loop_I {
  public static void printTable(int num){
	  for(int i=1;i<=10;i++){
		  System.out.println(num+" X "+i+"= "+(num*i));
	  }
  }
  
  public static void pow(int x,int y){
	  int sum=1;
	  for(int i=1;i<=y;i++){
		  sum =sum*x;
	  }
	  System.out.println(sum);
  }
  
	public static void main(String[] args) {
		//printTable(2);
        pow(5,3);
	}

}
