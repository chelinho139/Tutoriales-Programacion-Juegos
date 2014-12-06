import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class tut11OyenteTeclado implements KeyListener {

	tut11JFrame juego;
	
	tut11OyenteTeclado(tut11JFrame passjuego){
		juego=passjuego;
	}
	
	
	@Override
	public void keyPressed(KeyEvent evento) {
		if(evento.getKeyCode()==KeyEvent.VK_LEFT){
			juego.mover_izquierda();
		}
		if(evento.getKeyCode()==KeyEvent.VK_RIGHT){
			juego.mover_derecha();
		}
		if(evento.getKeyCode()==KeyEvent.VK_UP){
			juego.mover_arriba();
		}
		if(evento.getKeyCode()==KeyEvent.VK_DOWN){
			juego.mover_abajo();
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent evento) {
		

	}

	@Override
	public void keyTyped(KeyEvent evento) {

	}

}
