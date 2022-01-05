class TestCircle {
	public static void main (String [] args){
		Circle c1 = new Circle();
		Circle c2 = new Circle();

		c1.setRadius(8.5f);
		c2.setRadius(10.5f);

		Circle circleLargerRadius = c1.getLargerRadius(c2);
		System.out.println("El radio mAs grande es:" + circleLargerRadius.getRadius());

		circleLargerRadius = c2.getLargerRadius(c1);
		System.out.println("El radio mAs grande es:" + circleLargerRadius.getRadius());
	}
}
