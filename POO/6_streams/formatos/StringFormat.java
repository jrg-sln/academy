public class StringFormat {
	public static void main(String [] args){
		String n = "Jav";
		int a = 25;
		float y = 100.344f;
		System.out.println("Formato de cadenas");
		String s = String.format("%s %5d%n %o%n %f",n,a,a,y);
		System.out.println(s);
	}
}

