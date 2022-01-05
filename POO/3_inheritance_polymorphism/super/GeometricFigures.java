class GeometricFigures {
	public static void main (String [] args){
		Polygon p = new Triangle(5, 6, 2, 2, 2);
		System.out.println("new Triangle (5, 6, 2, 2, 2)");
		System.out.println(p);

		p = new Triangle(8, 4);
		System.out.println("new Triangle (8, 4)");
		System.out.println(p);

		p = new Triangle(1, 2, 3);
		System.out.println("new Triangle (1, 2, 3)");
		System.out.println(p);

		p = new Triangle();
		System.out.println("new Triangle ()");
		System.out.println(p);
	}
}
