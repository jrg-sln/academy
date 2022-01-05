class TestOwner {
	public static void main (String [] args){
		Employee e = new Employee();
		e.setNombre("Juan");
		e.setSueldo(6000);
		System.out.println("Nombre:" + e.getNombre() + ", sueldo:" + e.getSueldo());
		Owner o = new Owner();
		o.setNombre("Jose");
		o.setSueldo(20000);
		o.setPresupuesto(50000);
		System.out.println("Nombre:" + o.getNombre() + ", sueldo:" + o.getSueldo()+ 
					", presupuesto:" + o.getPresupuesto());
	}
}
