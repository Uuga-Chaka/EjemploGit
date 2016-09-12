
public class Bola implements Comparable {

	int radio;

	public Bola(int radio) {
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	@Override
	public int compareTo(Object o) {
		Bola bolita = (Bola) o;
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		Bola bolita = (Bola) obj;
		if (bolita.getRadio() == radio)
			return (bolita.getRadio() == radio);
		else
			return false;
	}

	public int hashCode() {
		return getRadio();
	}
}
