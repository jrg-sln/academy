import java.io.*;
import java.util.Date;

public class SerializeAlumno {

	SerializeAlumno() {
		Alumno al = new Alumno ("Juan",898989,'H',20);
		System.out.println(al);

		try {
			FileOutputStream f = new FileOutputStream("alum.ser");
			ObjectOutputStream s = new ObjectOutputStream(f);
			s.writeObject(al);
			s.close();
		} catch (IOException e) {
			e.printStackTrace ();
		}
	}

	public static void main (String args[]) {
		new SerializeAlumno();
	}
}
