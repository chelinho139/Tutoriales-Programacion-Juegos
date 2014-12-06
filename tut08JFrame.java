/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 7 - Primeros Controladores
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;


public class tut08JFrame extends JFrame implements Runnable {
	
	
	static final int ANCHO=400,LARGO=400;
	
	boolean condicion;
	Thread threadprincipal;
	
	
	public tut08JFrame(){
		this.setTitle("Tutorial Video Juegos #6");
		this.setBounds(100, 100, ANCHO, LARGO);
		this.setVisible(true);
		this.setResizable(false);
		this.setIgnoreRepaint(true);//
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		this.addWindowListener(new tut08OyenteVentana(this));
		
		
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
		
		System.exit(0);
		

		
	}
	public void terminarjuego(){
		condicion=false;
	}

	/*Funcion encargada de actualizar el estado del juego*/
	private void update(){
	}
	
	/*Funcion encargada de dibujar en pantalla el estado del juego*/
	private void render(){
		
		Graphics g;
		g= this.getGraphics(); //Agarramos los graficos de la ventana
		
		//Dibujamos algunas cosas
		if (g!=null){
			g.setColor(Color.black);
			g.fillRect(0, 0, ANCHO, LARGO);
			g.setColor(Color.pink);
			g.drawString("HOLA MUNDO!", 150, 100);
				
			Toolkit.getDefaultToolkit().sync(); //syncronizar con la pantalla
				
			g.dispose(); //borramos la variable g
		}
	}
	

	public static void main(String[] args) {
		tut08JFrame ventana = new tut08JFrame();
	}




}
