
public class Loop_II {
    public static void addDigit(int num){
    	int sum=0;
    	while(num>0){
    		int r = num%10;
    		num = num/10;
    		sum = sum+r;
    	}
    	System.out.println(sum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        addDigit(134);
	}

}
