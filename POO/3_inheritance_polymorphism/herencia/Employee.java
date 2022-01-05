class Employee {
	String nombre;
	float sueldo;

	public void setNombre(String n){
		nombre = n;
	}
	public String getNombre(){
		return nombre;
	}
	public void setSueldo(float s){
		if (s > 0)
			sueldo = s;
	}
	public float getSueldo(){
		return sueldo;
	}
	@Override
	public String toString(){
		return "Nombre: " + nombre + "\nSueldo: " + sueldo;
	}
}
