
public class Break_Continue {
    public static void m1(){
    	for(int i=1;i<=10;i++){
    		if(i==6) break;
    		System.out.println(i);
    	}
    	System.out.println("Out of loop");
    }
    
    public static void m2(){
    	for(int i=1;i<=10;i++){
    		if(i==6) continue;
    		System.out.println(i);
    	}
    	System.out.println("Out of loop");
    }
	public static void main(String[] args) {
		//m1();
		m2();
	}

}
