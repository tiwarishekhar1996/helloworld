package ConstructorTest;

public class Constructor2 {
	
	int value1;
	int value2;
	String value3;
	
	Constructor2(){
		value1 = 50;
		value2 = 30;
		value3 = "Hello";
		System.out.println("Inside default constructor........"+value1+value2+value3);
	}
	
	Constructor2(int a){
		value1 = a;
		System.out.println("Inside second Constructor of parameter a"+a);
	}
	
	Constructor2(int a, String b){
		value1 = a;
		value3 = b;
	}
	public void display() {
		System.out.println("value1--------------"+value1);
		System.out.println("value2--------------"+value2);
		System.out.println("value3--------------"+value3);
	}
	
	
	public static void main(String... s) {
		
		Constructor2 c =  new Constructor2(10,"Hey");
		c.display();
//		Account(int a);
//		Account (int a,int b);
//		Account (String a,int b);
	}

}
