import java.io.File;
import java.io.IOException;

class CreateFile {
	public static void main(String [] args) {
		try {
			File file = new File("file.txt");
			System.out.println("Exists? " + file.exists());
			boolean wasCreated = file.createNewFile();
			System.out.println("It was created? " + wasCreated);
			System.out.println("Exists? " + file.exists());
		} catch(IOException e) { 
			System.out.println(e.getMessage());
		}
	}
}

