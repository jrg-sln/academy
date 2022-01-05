import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class FilePrintWriter{
	public static void main (String [] leer){
		String texto = "";
		FileWriter fw = null; 
		BufferedWriter bw = null;
		PrintWriter salida = null;
		try{
			BufferedReader br;
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Escribir texto:");
			texto = br.readLine();
			fw = new FileWriter("print.txt");
			bw = new BufferedWriter(fw);
			salida = new PrintWriter(bw);
			salida.println(texto);
		} catch (IOException ioe){
			System.out.println("\n\nError al abrir o guardar el archivo:");
			ioe.printStackTrace();
		} catch (Exception e){ 
			System.out.println("\n\nError al leer de teclado:");
			e.printStackTrace();
		} finally {
			try {
				if (salida != null)
					salida.close();
			} catch (Exception e){
				System.out.println("Error : " + e.toString());
			}
		}
	}
}
