class GeometricFigures {
	public static void main (String [] args){
		Polygon p = new Triangle(5, 6, 2, 2, 2);
		System.out.println(p.getArea());
		System.out.println(p.getPerimeter());
		if (p instanceof Triangle){
			Triangle t = (Triangle)p;
			System.out.println(t.hasParallelSides());
		}

		System.out.println("\n##########################################\n");

		p = new Quadrilateral(5, 6, 2, 2, 2, 2);
		System.out.println(p.getArea());
		System.out.println(p.getPerimeter());
		if (p instanceof Quadrilateral){
			Quadrilateral q = (Quadrilateral)p;
			System.out.println(q.hasParallelSides());
		}
	}
}
