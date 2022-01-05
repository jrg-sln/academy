import java.io.File;

class Rename {
	public static void main(String [] args) {
		try {
			File file = new File("elif.txt");
			File rename = new File("file.txt");
			if (rename.exists()) {
				System.out.println("It was renamed? " + rename.renameTo(file));
			}
			File dir = new File("yrotcerid");
			rename = new File("directory");
			if (rename.exists()) {
				System.out.println("It was renamed? " + rename.renameTo(dir));
			}
		} catch(Exception e) { 
			System.out.println(e.getMessage());
		}
	}
}

