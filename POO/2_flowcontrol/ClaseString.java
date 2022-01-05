public class ClaseString {
	public static void main (String [] args){
		String cad1 = new String ("hola");
		String cad2 = "hola";
		String cad3 = new String ("hola");
		String cad4 = "hola";

		if (cad1 == cad2){
			System.out.println("cad1 == cad2");
		}
		if (cad1 == cad3){
			System.out.println("cad1 == cad3");
		}
		if (cad2 == cad3){
			System.out.println("cad2 == cad3");
		}
		if (cad2 == cad4){
			System.out.println("cad2 == cad4");
		}
	}
}
