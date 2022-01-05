import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 12345678L;
	private String name;
	private int id;

	public Student(){
		name = "Ninguno";
		id = -10000;
	}

	public Student(String name, int id){
		this.name = name;
		this.id = id;
	}

	public String toString(){
		return name + " : " + id;
	}
}
