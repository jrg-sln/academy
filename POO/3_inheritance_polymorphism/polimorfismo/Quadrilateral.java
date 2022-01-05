class Quadrilateral extends Polygon {
	float sideA, sideB, sideC, sideD;

	Quadrilateral (){}

	Quadrilateral (float ba, float h, float a, float b, float c, float d){
		base = ba;
		height = h;
		sideA = a;
		sideB = b;
		sideC = c;
		sideD = d;
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

	public float getSideD(){
		return sideD;
	}

	public double getArea(){
		return base * height;
	}
	
	public double getPerimeter(){
		return sideA + sideB + sideC + sideD;
	}

	public boolean hasParallelSides(){
                return true;
        }
}
