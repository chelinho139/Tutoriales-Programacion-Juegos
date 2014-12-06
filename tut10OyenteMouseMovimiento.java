import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class tut10OyenteMouseMovimiento implements MouseMotionListener {
	
	tut10JFrame juego;
	
	tut10OyenteMouseMovimiento(tut10JFrame passjuego){
		juego=passjuego;
	}
	
	@Override
	public void mouseDragged(MouseEvent evento) {
		juego.cambiarXY(evento.getX(),evento.getY());

	}

	/*Se llama cuando se mueve el mouse*/
	public void mouseMoved(MouseEvent evento) {
		
		juego.cambiarXY(evento.getX(),evento.getY());
		
		
	}

}






