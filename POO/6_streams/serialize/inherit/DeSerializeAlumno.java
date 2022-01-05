import java.io.*;
import java.util.Date;

public class DeSerializeAlumno {

	DeSerializeAlumno () {
		Alumno al = null;

		try {
			FileInputStream f = new FileInputStream ("alum.ser");
			ObjectInputStream s = new ObjectInputStream(f);
			al = (Alumno) s.readObject();
			s.close();
		} catch (Exception e) {
			e.printStackTrace ();
		}
		System.out.println("Deserializar objecto de alum.ser");
		System.out.println(al);
	}

	public static void main (String args[]) {
		new DeSerializeAlumno();
	}
}
