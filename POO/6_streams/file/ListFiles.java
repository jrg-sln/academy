import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class ListFiles {
	public static void main(String [] args) {
		try {
			File dir = new File("directory");
			boolean wasCreated = dir.mkdir();
			if (wasCreated){
				File file = new File("directory/file.txt");
				wasCreated = file.createNewFile();
				if (wasCreated){
					Date date = new Date();
					DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
					File ren = new File("directory/file_" + format.format(date) + ".txt");
					file.renameTo(ren);
					String [] files = dir.list();
					for (String f : files){
						System.out.println(f);
					}
				}
			}
		} catch (IOException e){
			System.out.println(e.getMessage());
		} catch(SecurityException e) { 
			System.out.println(e.getMessage());
		}
	}
}

