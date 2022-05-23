
public class Poly_2 extends Polymorphism{

	public void M1(int a, int b) {
		int sub= a-b;
		System.out.println("sub is= "+sub);
		
	}
	
	public static void main(String[] args) {
		Poly_2 p2= new Poly_2();
		p2.M1(2, 1);
	}
}
