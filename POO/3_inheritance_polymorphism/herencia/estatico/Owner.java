class Owner extends Employee {
	float presupuesto;

	public void setPresupuesto(float p){
		if (p > 0)
			presupuesto = p;
	}
	public float getPresupuesto(){
		return presupuesto;
	}
	@Override
	public String toString(){
		return  "Nombre: " + nombre + 
			"\nSueldo: " + sueldo + 
			", presupuesto:" + presupuesto;
	}
}
