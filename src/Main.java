import processing.core.*;

public class Main extends PApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Logica log;

	public static void main(String[] args) {

		// ejercicioUno();
		Main.main("Main");
		// ejercicioDos();
	}

	public void setup() {
		size(400, 200);
		log = new Logica(this);
		// log.ejercicioUno();
	}

	public void draw() {
		// log.ejercicioDos();
		background(255);
		fill(0);
		text("descomentar(?) los metodos en el keyPressed", 10, 20);
		text("para poder ejecutar cada ejercicio", 10, 40);

	}

	public void keyPressed() {

		// log.ejercicioUno();
		 log.ejercicioDos();
		//log.ejercicioTres();
	}

}
