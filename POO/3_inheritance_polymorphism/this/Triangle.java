class Triangle extends Polygon {
	float sideA, sideB, sideC;

	Triangle (){
		this(5, 5, 5, 5, 5);
	}

	Triangle (float base, float height){
		this(base,  height, 5, 5, 5);
	}

	Triangle (float sideA, float sideB, float sideC){
		this (5, 5, sideA, sideB, sideC);
	}

	Triangle (float base, float height, float sideA, float sideB, float sideC){
		this.base = base;
		this.height = height;
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public float getSideA(){
		return sideA;
	}

	public float getSideB(){
		return sideB;
	}

	public float getSideC(){
		return sideC;
	}

	public final double getArea(){
		return (base * height) / 2;
	}
	
	public double getPerimeter(){
		return sideA + sideB + sideC;
	}
}
