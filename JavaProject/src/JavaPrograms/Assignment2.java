package JavaPrograms;

public class Assignment2 {

	public void method() {
		System.out.println("Default method");
	}
	
	public void method(int a) {
		System.out.println("one parameterized method");
	}
	
	public void method(int a, int b) {
		System.out.println("two parameterized method");
	}
	
	public void method(int a, int b,int c) {
		System.out.println("Three parameterized method");
		this.method();
		this.method(10, 20);
		this.method(10, 20, 30, 40);
		this.method(10);
	}
	
	public void method(int a,int b,int c,int d) {
		System.out.println("four parameterized method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment2 ass =new Assignment2();
		ass.method(10, 20, 30);
	}

}
