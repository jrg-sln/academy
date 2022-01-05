public class LambdaExpresions {
	public static void main (String [] args) {
		(int a, int b) ­>  a + b;
		(int a) ­> a +  1;
		(int  a, int b) ­> { System.out.println(a + b);  return a + b; } () ­> new ArrayList();
	}
}
