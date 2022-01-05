public class A{
	private B be;

	public void setB(B be){
		this.be = be;
	}

	public B getB(){
		return this.be;
	}

	public void queryA() {
		try{
			be.setCe(new C());
			be.queryBe();
		} catch (Exception e){
			System.out.println("Error message: " + e.getMessage());
			System.out.println("Traza del error:");
			e.printStackTrace();
		}
	}
}

