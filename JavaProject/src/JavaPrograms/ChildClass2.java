package JavaPrograms;

public class ChildClass2 extends ParentClass2{

	public void name() {
		System.out.println("Child default method");
	}
	
	public void name(int a) {
		
		System.out.println("Child 1 parameterized method");
	}
	
	public void name(int a, int b) {
		super.name();
		super.name(10, 20, 30);
		super.name(10);
		super.name(10, 20);
		System.out.println("Child 2 parameterized method");
		this.name();
		this.name(10, 20, 30);
		this.name(10);
	}
	
	public void name(int a, int b, int c) {
		System.out.println("Child 3 parameterized method");
	}
	public static void main(String[] args) {
		
		ChildClass2 child=new ChildClass2();
		child.name(10,20);
	}

}
