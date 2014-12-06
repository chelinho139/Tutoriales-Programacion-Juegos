/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 5 - Mejoras Basicas
 */
import javax.swing.JFrame;


public class tut05JFrame extends JFrame implements Runnable {
	
	
	static final int ANCHO=400,LARGO=400;
	
	boolean condicion;
	Thread threadprincipal;
	
	
	public tut05JFrame(){
		this.setTitle("Tutorial Video Juegos #5");
		this.setBounds(100, 100, ANCHO, LARGO);
		this.setVisible(true);
		this.setResizable(false);
		this.setIgnoreRepaint(true);//
		
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
		
	}
	

	public static void main(String[] args) {
		tut05JFrame ventana = new tut05JFrame();
	}







}
