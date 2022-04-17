
public class Arithmetic2 {

	public int sum(int a, int b) {
		
		int c= a+b;
		System.out.println("Sum Result is"+c);
		return c;
	}
	
public int sub(int x, int y) {
		
		int z= x-y;
		System.out.println("Sub Result is"+z);
		return z;
	}

public int multi(int e, int f) {
	
	int g= e*f;
	System.out.println("Multi Result is"+g);
	return g;
}

public void div(int u, int v) {
	
	int w= u/v;
	System.out.println("Final Result is"+w);
}

public static void main(String[] args) {
//  Assignment -2 --> (((((10*2)+2)-2)-2)+2)/2)
	
	Arithmetic2 ob= new Arithmetic2();
	
	int multiResult=ob.multi(10, 2);
	int sumResult=ob.sum(multiResult, 2);
	int subResult= ob.sub(sumResult, 2);
	int subResult2= ob.sub(subResult, 2);
	int sumResult2= ob.sum(subResult2, 2);
	ob.div(sumResult2, 2);
	
}
}
