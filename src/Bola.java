
public class Bola implements Comparable<Bola> {

	int radio;

	public Bola(int radio) {
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	@Override
	public boolean equals(Object obj) {
		Bola bolita = (Bola) obj;
		if (bolita.getRadio() == radio)
			return (bolita.getRadio() == radio);
		else
			return false;
	}

	@Override
	public int hashCode() {
		return getRadio();
	}

	@Override
	public int compareTo(Bola o) {
		return (int)(radio-o.getRadio());
	}
}
