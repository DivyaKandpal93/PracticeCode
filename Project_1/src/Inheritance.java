
public class Inheritance {

	int a;
	// int a = 5;
	public void methodParent() {
	System.out.println("Parent method 1, var. value is: "+a);
	
	}
	public static void main(String[] args) {
		Inheritance ob1= new Inheritance();
		ob1.methodParent();
	}
}
