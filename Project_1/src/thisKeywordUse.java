
public class thisKeywordUse {

int a=5;

public void classA(int a) {
	
	this.a=a;
	System.out.println("value of a"+a);
}
public static void main(String[] args) {
	thisKeywordUse ob= new thisKeywordUse();
	ob.classA(17);
}
}
