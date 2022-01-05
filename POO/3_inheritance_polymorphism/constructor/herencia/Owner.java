class Owner extends Employee {
	float presupuesto;

	Owner (String n, float s, float p){
		nombre = n;
		sueldo = s;
		presupuesto = p;
	}

	Owner (String n, float s){
		nombre = n;
		sueldo = s;
	}

	Owner (String n){
		nombre = n;
	}

	public void setPresupuesto(float p){
		if (p > 0)
			presupuesto = p;
	}

	public float getPresupuesto(){
		return presupuesto;
	}

	public String toString(){
		String s = super.toString();
		return "Nombre: " + nombre + 
			"\nSueldo: " + sueldo +
			", presupuesto:" + presupuesto;
	}
}
