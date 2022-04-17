
public class Arithmetic {
//     Assignment -1 --> ((((10+2)-2)+2)*2)/2)
	//     Assignment -2 --> (((((10*2)+2)-2)-2)+2)/2)
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
	Arithmetic ob= new Arithmetic();
	int sumResult= ob.sum(10, 2);
	int subResult=ob.sub(sumResult, 2);
	int sumResult2= ob.sum(subResult, 2);
	int multiResult= ob.multi(sumResult2, 2);
	ob.div(multiResult, 2);
	
}
}
