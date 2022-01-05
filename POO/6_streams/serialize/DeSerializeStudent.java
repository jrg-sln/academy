import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializeStudent {

	DeSerializeStudent () {
		Student student = null;

		try {
			FileInputStream file = new FileInputStream ("student.ser");
			ObjectInputStream stream = new ObjectInputStream(file);
			student = (Student) stream.readObject();
			stream.close();
		} catch (Exception e) {
			e.printStackTrace ();
		}
		System.out.println("Deserializar objecto de student.ser");
		System.out.println(student);
	}

	public static void main (String args[]) {
		new DeSerializeStudent();
	}
}
