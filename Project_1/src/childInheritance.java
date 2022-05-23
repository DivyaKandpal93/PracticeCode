
public class childInheritance extends Inheritance{
	int b;
	void method2_father(){
		System.out.println("Child method 2, var. value is: "+b);
	}
	public static void main(String[] args) {
		childInheritance ob2= new childInheritance();
		ob2.a=10;
		ob2.methodParent();
		ob2.b=6;
		ob2.method2_father();
		
		
	}
	
}
