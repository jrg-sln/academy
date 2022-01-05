class Factory {
	public static int numEmployee = 5;
	public static void main (String [] args){
		Employee [] factory = new Employee[numEmployee];
		for (int num=0; num<factory.length ; num++) {
			factory[num] = new Employee();
			factory[num].setNombre("Juan " + (num+1));
			factory[num].setSueldo(6000 + 500);
		}

		for (Employee e: factory){
			System.out.println(e + "\n");
		}
		
		Owner o = new Owner();
		o.setNombre("Jose");
		o.setSueldo(20000);
		o.setPresupuesto(50000);
		System.out.println(o);
	}
}
