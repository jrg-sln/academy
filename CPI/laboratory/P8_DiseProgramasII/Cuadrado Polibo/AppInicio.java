import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;

public class AppInicio extends JFrame implements ActionListener, KeyListener {

	JButton boton1;
	JLabel etiqueta1;
	JLabel imagen;
	JTextField texto1;
        String salida;
        AppCuadradoPolibo poli;

	public AppInicio () throws IOException {
		super("Cuadrado de Polibo");
                /*Inicializamos los componentes*/
            	JPanel pnImagen = new JPanel();
            	JPanel pnCampos = new JPanel();
                boton1 = new JButton("Enviar");
                etiqueta1 = new JLabel("Inserte la palabra clave: ");           // Etiqueta
		texto1 = new JTextField();                                      // Texto a introducir
                texto1.setColumns(20);
		imagen = new JLabel(new ImageIcon("fi.jpg"));                   // Imagen de la GUI
                // Inserta en el panel
		pnCampos.add(etiqueta1,BorderLayout.CENTER);                    // Inserta etiqueta 1
		pnCampos.add(texto1,BorderLayout.SOUTH);                        // Inserta texto1
                pnCampos.add(boton1);                                           // Inserta el boton
		/*Estableciendo el Layout del contenedor*/
		pnImagen.setLayout(new BorderLayout());
		/*Añadiendo los componentes al contenedor*/
                pnImagen.add(imagen,BorderLayout.CENTER);
                pnImagen.add(pnCampos,BorderLayout.SOUTH);
                getContentPane().setLayout(new BorderLayout());
		getContentPane().add(pnImagen,BorderLayout.CENTER);
                /*Estableciendo centinelas*/
		boton1.addActionListener(this);
		texto1.addKeyListener(this);
                /*Estableciendo algunas propiedades del JFrame*/
                setSize(500,400);	                                        // Inicia el tamaño del frame
                setLocation(300, 100);	                                        // Inicia la posición del frame
		setResizable(true);	                                        // Impide que se maximice
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	                //Close program return promt
		// Las siguientes lineas cambian el icono del frame
		Image img = ImageIO.read(new File("fi.jpg"));                   // Imagen del ícono
		setIconImage(img);
		setVisible(true);                                               // Hace visible el frame
	}

        /*Evento con el botón*/
	public void actionPerformed(ActionEvent e) {
		/*Si el evento ocurrio en el boton1
		 *se copia el contenido de texto1
		 *en la etiqueta1
		 */
		 System.out.println("en botono = "+  ((JButton)e.getSource()).getLabel()  );
		
                if((((JButton)e.getSource()).getLabel()).equals("Enviar")){


                   String keyWord = texto1.getText();
                   System.out.println("dentro del if "+ keyWord);
                   try{
                       new AppCuadradoPolibo(keyWord);
                       this.setVisible(false);
                   }
                   catch(Exception ex){}
                }
	}

        /*Teclado*/
	public void keyTyped(KeyEvent ke){
	}

	public void keyPressed(KeyEvent event){
	       JTextField tf = (JTextField)event.getSource();
               System.out.println(event.getKeyCode());
               if ((event.getKeyCode() < 8 || ( event.getKeyCode() > 11 && event.getKeyCode() < 65 )  ||  (event.getKeyCode() > 86 && event.getKeyCode() < 88 ) || event.getKeyCode() > 90 ) ){
                   System.out.println("Caracter no válido");
                   MiDialogSwing ref = new MiDialogSwing(new JFrame(),"Caracter no válido !!!","Error",1);
                   String a = tf.getText();
                   if(a.length() > 0){
                       tf.setText(a.substring(0,a.length()-1));
                   }
               } else {
                   if (event.getKeyCode() == 10){
                       try{
                           String keyWord = texto1.getText();
                           new AppCuadradoPolibo(keyWord);
                           setVisible(false);
                       } catch(Exception ex){}
                   }else {
                       System.out.println("Buen caracter");
                   }
               }
	}

	public void keyReleased(KeyEvent ke){
	}

	public static void main (String [] args) {
	       try {
	           JFrame.setDefaultLookAndFeelDecorated(true);
                   AppInicio cuad = new AppInicio();
               } catch (IOException e) {
		   e.printStackTrace();
	       }
	}
}
