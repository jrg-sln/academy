import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  	static final int PORT = 5432;

  	public Server() {
		Socket service = null;
		DataOutputStream fds = null;
		DataInputStream dis = null;
    		try {
      			ServerSocket server = new ServerSocket(PORT);
     	 		System.out.println("Esperando peticiones por el puerto " + PORT);
      			for (int clients = 0 ; clients < 5; clients++) {
				service = server.accept();
				System.out.println("Se aceptO la conexiOn del cliente " + clients);
				OutputStream writting = service.getOutputStream();
				fds = new DataOutputStream(writting);
				fds.writeUTF("Bienvenido cliente " + clients);
				dis = new DataInputStream(service.getInputStream());
				System.out.println("El cliente " + clients + " dice: " + dis.readUTF());
			}
			System.out.println("Demasiados clientes por hoy.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (fds != null) fds.close();
				if (dis != null) dis.close();
				if (service != null) service.close();
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String [] arg) {
		new Server();
	}
}
