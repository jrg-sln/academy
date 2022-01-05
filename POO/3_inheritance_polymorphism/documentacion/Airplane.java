package flotilla.airplane;

/**
 * Clase que crea un avi&oacute;n con cierto n&uacute;mero de motores
 * @author Jorge A. Solano
 * @author jorge.a.solano@hotmail.com
 * @version 1
 * @see Visita: <a href="microsoft.fi-b.unam.mx" target=_blank>LMSR</a>
 */
public class Airplane {
	public Motor [] motors;

	/** M&eacute;todo constructor sin argumentos
 	* @param Ninguno
 	* @exception Ninguna
 	*/
	public Airplane(){}

	/** M&eacute;todo constructor que inicia los motores del avi&oacute;n
 	* @param numMotores que indica el n&uacute;mero de motores del avi&oacute;n
 	* @throws Nada
 	*/
	public Airplane(int numMotors){
		motors = new Motor[numMotors];
		for (int cont=0 ; cont<numMotors ; cont++){
                        motors[cont] = new Motor();
                }
	}
}
