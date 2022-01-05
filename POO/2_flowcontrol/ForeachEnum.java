public class ForeachEnum {
	public enum Planeta {
		MERCURIO, VENUS, TIERRA, MARTE, JUPITER, SATURNO, URANO, NEPTUNO
	}
	public static void main (String [] a){
		for(Planeta x : Planeta.values()){
			System.out.println(x);
		}
	}
}

