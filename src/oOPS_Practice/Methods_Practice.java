package oOPS_Practice;

public class Methods_Practice {

	public static void main(String[] args) {
		Methods_Practice obj = new Methods_Practice();
		obj.sum();
		System.out.println(obj.sum1(10, 30));
		System.out.println(obj.calculation(100, "-", 90));

	}
	
	//Method without arguments
	
	public void sum(){
		System.out.println("I am sum method without arguments");
	}
	
	//Method with arguments
	
	public int sum1(int a, int b){
		return (a+b);
		
	}
	
	public int calculation(int a,String operator, int b){
		int value = 0;
		if (operator=="+"){
			value= (a+b);
		} else if (operator=="-"){
			value =(a-b);
		}
		return value;
		
	}

}
