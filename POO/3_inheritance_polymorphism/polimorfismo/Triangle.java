class Triangle extends Polygon {
	float sideA, sideB, sideC;

	Triangle (){}

	Triangle (float ba, float h, float a, float b, float c){
		base = ba;
		height = h;
		sideA = a;
		sideB = b;
		sideC = c;
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

	public boolean hasParallelSides(){
		return false;
	}
}
