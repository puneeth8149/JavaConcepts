package JavaPrograms;

public class Assignment1 {

	public Assignment1() {
		this(10, 20, 30);
		System.out.println("default constructor");
	}
	
	public Assignment1(int a) {
		this();
		System.out.println("one parameterized constructor");
	}
	
	public Assignment1(int a, int b) {
		this(10);
		System.out.println("two parameterized constructor");
	}
	
	public Assignment1(int a, int b, int c) {
		System.out.println("Three parameterized constructor");
	}
	
	public Assignment1(int a, int b, int c, int d) {
		this(10,20);
		System.out.println("four parameterized constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment1 ass= new Assignment1(10,20,30,40);
	}

}
