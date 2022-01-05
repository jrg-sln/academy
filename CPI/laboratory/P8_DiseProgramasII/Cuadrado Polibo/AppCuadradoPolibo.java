import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;

public class AppCuadradoPolibo extends JFrame implements ActionListener, KeyListener {


	JLabel etiqueta1,etiqueta2;
	JLabel imagen;
	JTextField texto1;
	String clave;
        MetodoPolibo objetoPolico = new MetodoPolibo();
        String salida;

	public AppCuadradoPolibo (String key) throws IOException {

		super("Cuadrado de Polibo");
                /*Inicializamos los componentes*/
            	JPanel pnImagen = new JPanel();
            	JPanel pnCampos = new JPanel();
                etiqueta1 = new JLabel("Escriba la frase a cifrar sin espacios: ");      // Etiqueta
                etiqueta2 = new JLabel(" ",SwingConstants.CENTER);                       // Texto Cifrado
                etiqueta2.setForeground(Color.RED);
		texto1 = new JTextField();                                               // Texto a introducir
                texto1.setColumns(20);
		imagen = new JLabel(new ImageIcon("fi.jpg"));                            // Imagen de la GUI
                // Inserta en el panel
		pnCampos.add(etiqueta1);                                                 // Inserta etiqueta 1
		pnCampos.add(texto1);                                                    // Inserta texto1
		/*Estableciendo el Layout del contenedor*/
		pnImagen.setLayout(new BorderLayout());
		/*Añadiendo los componentes al contenedor*/
                pnImagen.add(imagen,BorderLayout.CENTER);
                pnImagen.add(pnCampos,BorderLayout.SOUTH);
                getContentPane().setLayout(new BorderLayout());
		getContentPane().add(pnImagen,BorderLayout.CENTER);
		getContentPane().add(etiqueta2,BorderLayout.SOUTH);

                /*Estableciendo centinelas*/
		//boton1.addActionListener(this);
		texto1.addKeyListener(this);
		//etiqueta1.addMouseListener(this);

                /*Estableciendo algunas propiedades del JFrame*/
                setSize(500,400);	                                                 // Inicia el tamaño del frame
                setLocation(300, 100);	                                                 // Inicia la posición del frame
		setResizable(true);	                                                 // Impide que se maximice
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	                         //Close program return promt

		// Las siguientes lineas cambian el icono del frame
		Image img = ImageIO.read(new File("fi.jpg"));                            // Imagen del ícono
		setIconImage(img);
		setVisible(true);                                                        // Hace visible el frame
		objetoPolico.insertarKeyWord(key);
	}

        private void evalua(){
            salida = objetoPolico.evaPolibo(texto1.getText());
            if(salida.length()>0){
    	      etiqueta2.setText(salida);
            }else {
               etiqueta2.setText("  ");
            }
        }

        /*Evento con el boton*/
	public void actionPerformed(ActionEvent e) {
		/*Si el evento ocurrio en el boton1
		 *se copia el contenido de texto1
		 *en la etiqueta1
		 */
		/*if(e.getSource()== boton1)
			evalua(); */
	}

        /*Teclado*/
	public void keyTyped(KeyEvent ke){
	}

	public void keyPressed(KeyEvent event){
		JTextField tf = (JTextField)event.getSource();

                     
                     if ( (event.getKeyCode() < 8 || ( event.getKeyCode() > 11 && event.getKeyCode() < 32 ) || ( event.getKeyCode() > 32 && event.getKeyCode() < 65 ) ||  (event.getKeyCode() > 86 && event.getKeyCode() < 88 ) || event.getKeyCode() > 90 ) )
                     {
                        System.out.println("Caracter no válido");
                        MiDialogSwing ref = new MiDialogSwing(new JFrame(),"Caracter no válido !!!","Error",1);
                        String a = tf.getText();
                        if(a.length() > 0)
                        {
                                tf.setText(a.substring(0,a.length()-1));
                        }
                     }
                     else
                         evalua();
	}

	public void keyReleased(KeyEvent ke){
               //evalua();
	}


	public static void main(String...a){
          try{
                       AppCuadradoPolibo app = new AppCuadradoPolibo("hola");

                   }
                   catch(Exception ex){}

        }
}
