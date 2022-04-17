
public class ConstrCallSeq {
	
	public ConstrCallSeq() {
		this(1,2,3);
		System.out.println("Default constructor");
	}
	
	public ConstrCallSeq(int a) {
		this();
		System.out.println("One Parameterized constructor");
	}
	
	public ConstrCallSeq(int a, int b) {
		this(1);
		System.out.println("Two Parameterized constructor");
	}
	
	public ConstrCallSeq(int a, int b, int c) {
		
		System.out.println("Three Parameterized constructor");
	}
	
	public ConstrCallSeq(int a, int b, int c, int d) {
		this(1,2);
		System.out.println("Four Parameterized constructor");
	}
	
	public static void main(String[] args) {
		ConstrCallSeq ob= new ConstrCallSeq(1,2,3,4);
	}
}
