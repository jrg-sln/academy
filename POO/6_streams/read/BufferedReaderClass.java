import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderClass {
        public static void main (String [] args){
                try {
                        String text = "";
                        BufferedReader br;
                        br = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Escriba el texto deseado:");
                        text = br.readLine();
                        System.out.println("El texto escrito fue: " + text);
                } catch (IOException ioe){
                        System.out.println("Error al leer caracteres: \n" + ioe);
                }
        }
}
