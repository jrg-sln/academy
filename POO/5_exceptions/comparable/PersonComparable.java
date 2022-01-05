public class PersonComparable implements Comparable {
	private String nombre;
	private int edad;

	PersonComparable (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public int compareTo(Object obj){
		return this.nombre.compareTo
			(((PersonComparable)obj).nombre);
	}

	public String toString() {
		return nombre + ":" + edad + "";
	}
}
