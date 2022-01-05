import java.util.Scanner;

public class ScannerClass {
	public static void main(String [] args) {
		try {
			String text = "";
			Scanner s = new Scanner(System.in);
			do {
				text = s.nextLine();
				System.out.println(text);
			} while (!text.equals("au revoir"));
			s.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
