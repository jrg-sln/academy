class Triangle extends Polygon {
	float sideA, sideB, sideC;

	Triangle (){
		this(0, 0, 0, 0, 0);
	}

	Triangle (float base, float height){
		this(base,  height, 0, 0, 0);
	}

	Triangle (float sideA, float sideB, float sideC){
		this (0, 0, sideA, sideB, sideC);
	}

	Triangle (float base, float height, float sideA, float sideB, float sideC){
		this.base = base;
		this.height = height;
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public final double getArea(){
		return (base * height) / 2;
	}
	
	public double getPerimeter(){
		return sideA + sideB + sideC;
	}

	public String toString(){
		return super.toString() + 
			"\nSide A: " + sideA +
			"\nSide B: " + sideB +
			"\nSide C: " + sideC;
	}
}
