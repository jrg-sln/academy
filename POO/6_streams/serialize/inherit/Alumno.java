import java.io.Serializable;

public class Alumno extends Persona implements Serializable {
	String nombre;
	int numCta;

	public Alumno(){
		nombre = "Ninguno";
		numCta = -10000;
		genero = "Indefinido";
		edad = -1;
	}

	public Alumno(String nombre, int numCta, char c, int edad){
		this.nombre = nombre;
		this.numCta = numCta;
		genero = c=='M'? "Mujer": "Hombre";
		this.edad = edad;
	}

	public String toString(){
		return nombre + " : " + numCta + " -> " + super.toString();
	}
}
