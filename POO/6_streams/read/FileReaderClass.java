import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass{
	public static void main (String [] escribir){
		String texto = "";
		try {
			BufferedReader br;
			FileReader fr = new FileReader("FileReaderClass.java");
			br = new BufferedReader(fr);
			System.out.println("El texto contenido en el archivo es:");
			String line = br.readLine();
			while (line != null ) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException ioe){
			System.out.println("\n\nError al abrir o leer el archivo:");
			ioe.printStackTrace();
		} catch (Exception e){ 
			System.out.println("\n\nError al leer de teclado:");
			e.printStackTrace();
		}
	}
}

