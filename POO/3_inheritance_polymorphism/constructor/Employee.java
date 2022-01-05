class Employee {
	String nombre;
	float sueldo;

	Employee(String n){
		setNombre(n);
	}

	Employee(String n, float s){
		setNombre(n);
		setSueldo(s);
	}

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
	public String toString(){
		return "Nombre: " + nombre + "\nSueldo: " + sueldo;
	}
}
