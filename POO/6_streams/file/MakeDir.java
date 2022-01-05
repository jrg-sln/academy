import java.io.File;
import java.io.IOException;

class MakeDir {
	public static void main(String [] args) {
		try {
			File dir = new File("directory");
			System.out.println("Exists? " + dir.exists());
			boolean wasCreated = dir.mkdir();
			System.out.println("It was created? " + wasCreated);
			System.out.println("Exists? " + dir.exists());
		} catch(SecurityException e) { 
			System.out.println(e.getMessage());
		}
	}
}

