
public class childMultiLevelInheritance extends childInheritance {

	int c;
	void methodchild2_child(){
		System.out.println("Father class method, var. value: "+c);
	}
	public static void main(String[] args) {
		childMultiLevelInheritance obj= new childMultiLevelInheritance();
		obj.a=17;
		obj.methodParent(); 
		obj.b=8;
		obj.method2_father();;
		obj.c=93;
		obj.methodchild2_child();
		
		
	}
	
}
