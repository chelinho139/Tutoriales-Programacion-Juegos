/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 6 - Primer Render
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class tut06JFrame extends JFrame implements Runnable {
	
	
	static final int ANCHO=400,LARGO=400; //ancho y largo de la pantalla
	
	boolean condicion;
	Thread threadprincipal;
	
	
	public tut06JFrame(){
		//Cosas iniciales
		this.setTitle("Tutorial Video Juegos #6");
		this.setBounds(100, 100, ANCHO, LARGO);
		this.setVisible(true);
		this.setResizable(false); //no se puede redimensionar
		this.setIgnoreRepaint(true); //no se llama a repaint
		
		threadprincipal = new Thread(this);
		threadprincipal.start();
		
				
	}
	
	/*Game Loop*/
	public void run() {
		System.out.println("Juego Iniciado..");
		condicion=true;
		while(condicion){
			
			update();
			render();
			
			//dormir()
			try {Thread.sleep(20);} //luego vamos a regular
			catch (InterruptedException e) {}
		}
	}

	/*Funcion encargada de actualizar el estado del juego*/
	private void update(){
	}
	
	/*Funcion encargada de dibujar en pantalla el estado del juego*/
	private void render(){
		
		Graphics g;//la clase graphics sirve para dibujar en la pantalla
		
		g= this.getGraphics(); //Agarramos los graficos de la ventana
		
		//Dibujamos algunas cosas
		g.setColor(Color.black);
		g.fillRect(0, 0, ANCHO, LARGO);
		g.setColor(Color.pink);
		g.drawString("HOLA MUNDO!", 150, 100);
		
		Toolkit.getDefaultToolkit().sync(); //syncronizar con la pantalla
		
		g.dispose(); //borramos la variable g
		//ya que la vamos a crear de nuevo en la proxima llamada a render
	}
	

	public static void main(String[] args) {
		tut06JFrame ventana = new tut06JFrame();
	}







}
