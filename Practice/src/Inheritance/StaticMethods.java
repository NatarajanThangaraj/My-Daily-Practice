package Inheritance;

public class StaticMethods {
	static int variable=1234;
	public static void main(String[] args) {
		//Child obj=new Child();
	
		Parent obj=new Parent();
		obj.staticMethod();
	}
}
	class Parent{
		//static int age =30;
		public  static void staticMethod(){
			System.out.println("parent's work");
		}
		public void normalMethod() {
			System.out.println("It is normal Method in parent");
		}
	}
	class Child extends Parent{
		//static int age=20;
		public static void Method() {
			System.out.println("Child study");
		}
		public void normalMethod() {
			System.out.println("It is normal Method in child");
		}
	}


