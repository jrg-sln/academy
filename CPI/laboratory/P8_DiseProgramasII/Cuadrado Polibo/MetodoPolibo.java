/* Este programa realiza el cuadrado de polibo con la clave que se ingrese,
   así pues, sí la palabra clave ingresda fuera comadre, el cuadrado quedaría así:

         El cuadrado de polibo queda así
              1  2  3  4  5
        --------------------
         1  | c  o  m  a  d
         2  | r  e  b  f  g
         3  | h  i  j  k  l
         4  | n  p  q  s  t
         5  | u  v  x  y  z

         con la palabra clave comadre
*/

import java.lang.*;

public class MetodoPolibo {
   String [][] cuadradoPolibo = new String [5][5];                 // cuadrado va a contener el cuadrado que se va a usar
   static String [][] cuadrado = new String [5][5];

   public void insertarKeyWord (String key){
          Cuadrado cuad = new Cuadrado();
          String [] arr = cuad.abcOrden(key);
          int cont = 0;
          System.out.println("Cuadrado Polibo");
          for (int i = 0 ; i < cuadradoPolibo.length ; i++) {
              for (int j = 0 ; j < cuadradoPolibo[0].length ; j++){
                  cuadrado[i][j] = arr[cont++];
              }
          }
          for (int i = 0 ; i < cuadradoPolibo.length ; i++) {
              for (int j = 0 ; j < cuadradoPolibo[0].length ; j++){
                  System.out.print(cuadrado[i][j]);
              }
              System.out.println();
          }
   }

   public String evaPolibo(String textoLlano){
      String salida = "";
      // Arreglos para el cuadrado de polibo
      String [] texLlano;          // Cadena ingresada en forma de vector
      int [] textoCifrado;         // Código cifrado
      // Letra contiene al cuadrado de polibo
      //String [][] cuadrado = {{"c","o","m","a","d"},{"r","e","b","f","g"},{"h","i","j","k","l"},{"n","p","q","s","t"},{"u","v","x","y","z"}};
      try{

         textoLlano = textoLlano.toLowerCase();
         int tam = textoLlano.split("").length;
         texLlano = new String [tam];
         textoCifrado = new int [2*tam];
         texLlano = textoLlano.split("");
         int m = 0;                                                                  // m es un contador para el vector texto Cifrado
         for (int i = 0 ; i < texLlano.length ; i++){                                // Recorre el vector que contiene la frase a cifrar
             for (int k = 0 ; k < cuadrado.length ; k++){                            // Recorre los renglones del cuadrado de Polibo
                 for (int j = 0 ; j < cuadrado[0].length ; j++){                     // Recorre las columnas del cuadrado de Polibo
                     if (texLlano[i].equals(" ")){                                   // Si hay un espacio salta a la siguiente localidad de texLlano
                         j = cuadrado[0].length;
                         k = cuadrado.length;
                     } else {                                                        // De lo contrario
                         if (texLlano[i].equals(cuadrado[k][j])){                    // Busca texLlano en el cuadrado de polibo y si es igual
                             textoCifrado[m++] = k+1;                                // Localidad de la letra es el número del
                             textoCifrado[m++] = j+1;                                // Texto cifrado
                         }                                                           // De lo contrario no hace nada
                     }
                 }
             }
         }
         int cont = 0;
         for (int l = 0 ; l < textoCifrado.length ; l++ ){
             if (textoCifrado[l]==0){
               l = textoCifrado.length;
             } else {
               if (cont == 5){                                                       // Separa las cifras cada 5 lugares
                   salida += "-" + textoCifrado[l];
                   cont = 0;
               } else {
                   salida += textoCifrado[l];
               }
             }
             cont++;
         }
      } catch(Exception e) {
         System.err.println("\t\tError: " + e.getMessage( ));
      }
      return salida;
   }
}