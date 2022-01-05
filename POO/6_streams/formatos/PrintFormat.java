public class PrintFormat {
	public static void main(String [] args){
		int i1 = -123;
		int i2 = 12345;

		System.out.println("PRINTF");
		System.out.printf(">%1$(7d< \n",i1);
		System.out.printf(">%0,7d< \n",i2);
		System.out.printf(">%+-7d< \n",i1);
		System.out.printf(">%2$b + %1$5d< \n",i1,false);

		System.out.println("FORMAT");
		System.out.format(">%1$(7d< \n",i1);
		System.out.format(">%0,7d< \n",i2);
		System.out.format(">%+-7d< \n",i1);
		System.out.format(">%2$b + %1$5d< \n",i1,false);
	}
}
