import java.io.Serializable;

public class Persona {// implements Serializable {
	String genero;
	int edad;

	public String toString(){
		return genero + " de " + edad + " años.";
	}
}
