package ConstructorTest;

public class Constructor1 {
	
	
		int value1;
		int value2;
		
		Constructor1(){
			value1 = 10;
			value2 = 20;
			System.out.println("Inside consctructor");
		}
		
		public void display() {
			System.out.println("Value1 ---------"+value1);
			System.out.println("Value2 ----------"+value2);
		}
		
		public static void main(String... s) {
			Constructor1 c = new Constructor1();
			c.display();
		
		}

}
