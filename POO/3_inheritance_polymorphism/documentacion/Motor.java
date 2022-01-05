package flotilla.airplane;

/**
 * Clase que crea un motor de avi&oacute;n.
 * @author Jorge A. Solano
 * @author jorge.a.solano@hotmail.com
 * @version 1
 * @see Visita: <a href="microsoft.fi-b.unam.mx" target=_blank>LMSR</a>
 */
public class Motor {
	/** M&eacute;todo que permite iniciar el motor
	 * @param Ninguno
	 * @return Ninguno
	 * @exception Ninguna
	 */ 
	public void start(){
		System.out.println("Arranca motor.");
	}
	/** M&eacute;todo que permite detener el motor
	 * @param Ninguno
	 * @return Ninguno
	 * @throws Nada
	 */ 
	public void stop(){
		System.out.println("Detiene motor.");
	}
}
