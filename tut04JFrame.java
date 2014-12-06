/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 4 - Prmer Ventana con Gameloop
 */
import javax.swing.JFrame;


public class tut04JFrame extends JFrame implements Runnable {
	
	boolean condicion; //para el ciclo while
	Thread threadprincipal;
	
	public tut04JFrame(){
		//Cosas iniciales de la frame
		this.setTitle("Tutorial Video Juegos #4");
		this.setBounds(300, 300, 400, 400);
		this.setVisible(true);
		
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
			try {Thread.sleep(20);} 
			catch (InterruptedException e) {}
		}
	}

	/*Funcion encargada de actualizar el estado del juego*/
	private void update(){
	}
	
	/*Funcion encargada de dibujar en pantalla el estado del juego*/
	private void render(){
	}
	

	public static void main(String[] args) {
		tut04JFrame ventana = new tut04JFrame();
	}







}
