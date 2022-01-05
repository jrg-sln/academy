class Polygon {
	float base, height;

	Polygon(){
		this(0, 0);
	}

	Polygon(float base, float height){
		if (base > 0) 
			this.base = base;
		if (height > 0) 
			this.height = height;
	}
	
	public double getArea(){
		return 0.0d;
	}

	public double getPerimeter(){
		return 0.0d;
	}

	public String toString(){
		return "Base: " + base + "\nHeight: " + height;
	}
}
