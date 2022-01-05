import java.io.InputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.Socket;

public class Client {
  	static final String SERVER = "localhost";
  	static final int PORT = 5432;
  	public Client( ) {
		Socket con = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
    		try{
      			con = new Socket(SERVER, PORT);
      			InputStream read = con.getInputStream();
      			dis = new DataInputStream(read);
      			System.out.println(dis.readUTF());
			dos = new DataOutputStream(con.getOutputStream());
			dos.writeUTF("Gracias por aceptarme.");
    		} catch (Exception e) {
      			System.out.println(e.getMessage());
    		} finally {
			try {
				if (dis != null) dis.close();
				if (dos != null) dos.close();
				if (con != null) con.close();
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
  	}

  	public static void main(String [] arg) {
    		new Client();
  	}
}
