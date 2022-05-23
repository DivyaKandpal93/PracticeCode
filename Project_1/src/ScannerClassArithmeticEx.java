import java.util.Scanner;

public class ScannerClassArithmeticEx {

	// ((((x1+x2)-x3)+x4)*x5)/x6)--> give input using scanner class
	// e.g. ((((5+6)-6)+4)*4)/6)= 6
public int sum(int x1, int x2) {
	
		int c= x1+x2;
		System.out.println("Sum Result is"+c);
		return c;
	}
	
public int sub(int x3, int x4) {
	
		int z= x3-x4;
		System.out.println("Sub Result is"+z);
		return z;
	}

public int multi(int x5, int x6) {
	
	int g= x5*x6;
	System.out.println("Multi Result is"+g);
	return g;
}

 public void div(int x7, int x8) {
	
	int w= x7/x8;
	System.out.println("Final Result is"+w);
}  
public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	System.out.println("please give input and press enter");
	int a= s.nextInt();
	
	System.out.println("please give input and press enter");
	int b= s.nextInt();
	
	System.out.println("please give input and press enter");
	int c= s.nextInt();
	
	System.out.println("please give input and press enter");
	int d= s.nextInt();
	
	System.out.println("please give input and press enter");
	int e= s.nextInt();
	
	System.out.println("please give input and press enter");
	int f= s.nextInt();
	
	ScannerClassArithmeticEx data= new ScannerClassArithmeticEx();
	
	int sum1= data.sum(a, b);
	int sub= data.sub(sum1, c);
	int sum2= data.sum(sub, d);
	int mul= data.multi(sum2, e);
	data.div(mul, f);
	s.close();
	
	
}
	
}
