public class Argumentos{
   	public static void main(String args[]){
      		if ( args.length == 0 ){
         		System.out.println("ERROR!, al ejecutar el programa!");
         		System.out.println("Uso: java ForArgs ARG1 ARG2 ...");
      		}

      		for ( int i = 0 ; i < args.length ; i++ ){
         		System.out.println("Parametro " + (i+1) + ": " + args[i]);
      		}
   	}
}
