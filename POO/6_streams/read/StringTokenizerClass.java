import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerClass {
	public static void main (String [] leer){
		String text = "";
		try{
			BufferedReader br;
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Escribir texto:");
			text = br.readLine();
			System.out.println("\n\nEl texto separado por espacios es:");
			
			// Se separa el texto por espacios (defecto)
			StringTokenizer st = new StringTokenizer(text);
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}
			br.readLine();
			System.out.println("\n\nEl texto completo es:");
			System.out.println(text);
		} catch (Exception e){ 
			System.out.println("\n\nError al leer de teclado:");
			e.printStackTrace();
		}
	}
}

