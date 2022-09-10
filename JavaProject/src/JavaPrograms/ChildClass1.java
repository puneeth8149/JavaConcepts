package JavaPrograms;

public class ChildClass1 extends ParentClass1{

	
	public ChildClass1() {
	this(10, 20);
		System.out.println("child class default constructor");
	}
	
	public ChildClass1(int a) {
		this(10,20,30);
		System.out.println("child class single parameterized constructor");
	}
	
	public ChildClass1(int a, int b) {
		super(10,20);
		System.out.println("child class two parameterized constructor");
	}
	
	public ChildClass1(int a,int b, int c) {
		this();
		System.out.println("child class three parameterized constructor");
	}
	
	public static void main(String[] args) {
		ChildClass1 childclass=new ChildClass1(10);		
	}
}
