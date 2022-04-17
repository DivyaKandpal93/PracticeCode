
public class ConstructorCall {
	
	public ConstructorCall() {
		
		System.out.println("Default constructor");
	}


	public ConstructorCall(int a) {
		this();
		System.out.println("One Parameterized constructor");
	}
	
	public ConstructorCall(int a,int b) {
		this(12);
		System.out.println("Two Parameterized constructor");
	}
	
	public ConstructorCall(int a,int b, int c) {
		this(12,15);
		System.out.println("Three Parameterized constructor");
	}
	
	public static void main(String[] args) {
		ConstructorCall ob= new ConstructorCall(1,2,3);
		
		
		/* ConstructorCall ob1= new ConstructorCall(12);
		ConstructorCall ob2= new ConstructorCall(11,12);
		ConstructorCall ob3= new ConstructorCall(12,15,17); */
		
		
	}
}
