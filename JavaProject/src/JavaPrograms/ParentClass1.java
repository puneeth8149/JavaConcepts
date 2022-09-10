package JavaPrograms;

public class ParentClass1 {

	
	public ParentClass1() {
		this(10);
		System.out.println("Parent class default constructor");
	}
	
	public ParentClass1(int a) {
		this(10,20,30);
		System.out.println("Parent class single parameterized constructor");
	}
	
	public ParentClass1(int a, int b) {
		this();
		System.out.println("Parent class two parameterized constructor");
	}
	
	public ParentClass1(int a,int b, int c) {
		
		System.out.println("Parent class three parameterized constructor");
	}
}


