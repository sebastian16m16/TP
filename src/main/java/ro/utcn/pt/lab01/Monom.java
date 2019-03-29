package ro.utcn.pt.lab01;


public class Monom {

	float coef;
	int degree;
	Monom next;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(coef);
		result = prime * result + degree;
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monom other = (Monom) obj;
		if (Float.floatToIntBits(coef) != Float.floatToIntBits(other.coef))
			return false;
		if (degree != other.degree)
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		return true;
	}
	
}
