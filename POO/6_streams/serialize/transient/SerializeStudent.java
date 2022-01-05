import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent {

	SerializeStudent() {
		Student student = new Student("Joe", 12345);
		System.out.println(student);

		try {
			FileOutputStream file = new FileOutputStream ("student.ser");
			ObjectOutputStream stream = new ObjectOutputStream (file);
			stream.writeObject (student);
			stream.close();
		} catch (IOException e) {
			e.printStackTrace ();
		}
	}

	public static void main (String args[]) {
		new SerializeStudent();
	}
}
