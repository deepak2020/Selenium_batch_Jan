package java_basics;

public class Return {

	public static void main(String[] args) {
	 System.out.println(sum());
	 sum1();

	}
	
	public static int sum(){
		int n = 2+2;
		return n;
	}
	
	public  static void  sum1(){
		int m = sum();
		int x = m*10;
		System.out.println(x);
	}

}
