import java.io.*;

public class Leer{
    public static String dato() {
         String sdato = "";
         try {
             // Definir el flujo de caracteres de entrada: flujoE
             InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader flujoE = new BufferedReader(isr);

             // Leer.  La entrada finaliza al pulsar la tecla ENTER.
             sdato = flujoE.readLine( );
          } catch(IOException e) {
             System.err.println("Error: " + e.getMessage( ));
          }
         return sdato.toLowerCase(); //devolver el dato tecleado.
     }

 /*    public static int datoInt(){
          try{
               return Integer.parseInt(dato( ));
          }catch(NumberFormatException e){
               return Integer.MIN_VALUE; // valor más pequeño.
          }
     }

     public static float datoFloat(){
          try{
               Float f = new Float(dato( ));
	           return f.floatValue( );
          }catch(NumberFormatException e){
               return Float.NaN; // No es un número; valor float
          }
     }

     public static double datoDouble(){
          try
            {
               Double d = new Double(dato( ));
	           return d.doubleValue( );
            }
          catch(NumberFormatException e)
            {
               return Double.NaN; // No es un número; valor float
            }
       }*/
 }