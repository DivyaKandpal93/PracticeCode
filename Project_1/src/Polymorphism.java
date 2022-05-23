
public class Polymorphism {

	public void M1(int a, int b) {
		int sum= a+b;
		System.out.println("sum="+sum);
		
	}
	
	public int M1(int x, int y, int z) {
		int c= x+y+z;
		System.out.println("c:" + c);
		return c;
		
	}
	
	public static void main(String[] args) {
		Polymorphism p= new Polymorphism();
		p.M1(2, 5);
		p.M1(5, 5, 6);
	}
}
