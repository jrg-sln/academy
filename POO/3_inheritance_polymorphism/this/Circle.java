class Circle {
	float radius;

	public void setRadius(float radius){
		this.radius = radius;
	}

	public float getRadius (){
		return radius;
	}

	public Circle getLargerRadius(Circle c) {
		if (this.radius > c.radius) 
			return this;
		else 
			return c;
	}
}
