import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamClass {
     public static void main (String [] args){
	FileInputStream fis = null;
	byte[] buffer = new byte[81];
	int nbytes;
	try {
	     fis = new FileInputStream("FileInputStreamClass.java");
	     nbytes = fis.read(buffer, 0, 81);
	     while (nbytes != -1) {
	     	String text = new String(buffer, 0, nbytes);
	     	System.out.println(text);
	     	nbytes = fis.read(buffer, 0, 81);
	     }
	} catch (IOException ioe) {
	     System.out.println("Error: " + ioe.toString());
	} finally {
	     try {
		if (fis != null) fis.close();
	     } catch (IOException ioe) {
		System.out.println("Error al cerrar el archivo.");
	     }
	}
     }
}

