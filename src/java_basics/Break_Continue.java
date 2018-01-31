package java_basics;

public class Break_Continue {

	public static void main(String[] args) {
		
		for (int n =1; n<=100; n++){
			if (n%7==0){
				continue;
			}
			System.out.println(n);
		}
		
	}

}
