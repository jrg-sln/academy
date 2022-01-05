public class Student {
	private String name;
	private int number;

	public Student (String name, int number){
		this.name = name;
		this.number = number;
	}

	public String getName(){
		return name;
	}

	public int getNumber(){
		return number;
	}

	public String toString(){
		return name + "-" + number;
	}
}