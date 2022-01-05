/* Este programa recibe una cadena de caracteres (palabra clave)
   y regresa un vector con las variables de la palabra clave
   y el abcdario en orden en un vector
*/
import java.util.*;

public class Cuadrado{
       public static String[] abcOrden (String s){

              String [] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"};

              System.out.println("Cadena ingresada = "+s);
              String aux[]=s.split("");
              ArrayList ar = new ArrayList();
              ArrayList al = new ArrayList();
              ArrayList al2 = new ArrayList();
              //quitando el espacio en blanco
              for(int i = 1; i < aux.length; i++){
                    ar.add(aux[i]);
              }
              // Borra del abcdario las palabras que corresponden a las letras de la palabra clave
              for (int i = 0 ; i < ar.size() ; i++ ){
                  for (int j = 0 ; j < abc.length ; j++){
                      if (abc[j].equals((String)ar.get(i))){
                         abc[j] = "";
                      }
                  }
              }
            //agregar al arraylist los valores que no estan en blanco
              for (int i = 0; i< abc.length;i++){
                if(!abc[i].equals(""))
                        al.add(abc[i]);
              }
             //quitando de la palabra las letras repetidas
              for (int i = 0; i< ar.size();i++){
                    if(al2.contains((String)ar.get(i)))
                        System.out.println("agregado  ");
                    else
                        al2.add(ar.get(i));

              }
              String[] afinal =new String[al.size()+al2.size()];
              for( int i= 0; i<al2.size();i++){
                    afinal[i]=(String)al2.get(i);
              }
              for( int i= 0; i<al.size();i++){
                    afinal[i+al2.size()]=(String)al.get(i);
              }
              return afinal;
       }
}