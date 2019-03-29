package ro.utcn.pt.lab01;

public class Polynome {

	Monom head;

	public void insert(float d, int degree) {

		Monom monom = new Monom();
		monom.coef = d;
		monom.degree = degree;
		monom.next = null;

		if (head == null) {
			head = monom;
		} else {

			Monom m = head;

			while (m.next != null) {

				m = m.next;
			}
			m.next = monom;

		}
	}

	public void delete(Monom current){
		if(current.coef == head.coef && current.degree == head.degree){
			head = current.next;
			return;
		}else{
			Monom n1 = null;
			Monom n = head;
			while(n.coef != current.coef || n.degree != current.degree){
				
				n1 = n;
				n = n.next;
				}
			
				if(n.coef == current.coef && n.degree == current.degree) {
					n1.next = current.next;
					return;
				}
			
		}
	}

	public int getPolySize() {

		Monom temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	public void arrangePoly() {
		int x;
		float y;
		for (int i = 0; i < getPolySize(); i++) {
			Monom m = head;

			while (m.next != null) {
				if (m.degree < m.next.degree && m.next != null) {

					// switch degrees
					x = m.degree;
					m.degree = m.next.degree;
					m.next.degree = x;
					// switch coefs
					y = m.coef;
					m.coef = m.next.coef;
					m.next.coef = y;
				}
				m = m.next;
			}
		}
	}

	public void printPoly() {

	
		arrangePoly();

		Monom m = head;

		while (m.next != null) {

			if (m.degree == 0) {
				if (m.coef < 0) {
					System.out.print(m.coef);
				} else {
					System.out.print("+" + m.coef);
				}
			} else if (m.degree == 1) {
				if (m.coef < 0) {
					if(m.coef == -1){
						System.out.print("-x");
					}else{
						System.out.print(m.coef + "x");
					}					
				} else {
					if(m.coef == 1){
						System.out.print("+x");
					}else{
						System.out.print("+" + m.coef + "x");
					}					
				}
			} else {
				if (m.coef < 0) {
					if(m.coef == -1){
						System.out.print("-x^" + m.degree);
					}else{
						System.out.print(m.coef + "x^" + m.degree);
					}					
				} else {
					if(m.coef == 1){
						System.out.print("+x^" + m.degree);
					}else{
						System.out.print("+" + m.coef + "x^" + m.degree);
					}
					
				}
			}

			m = m.next;
		}

		if (m.degree == 0) {
			if (m.coef < 0) {
				System.out.print(m.coef);
			} else {
				System.out.print("+" + m.coef);
			}
		} else if (m.degree == 1) {
			if (m.coef < 0) {
				if(m.coef == -1){
					System.out.print("-x");
				}else{
					System.out.print(m.coef + "x");
				}					
			} else {
				if(m.coef == 1){
					System.out.print("+x");
				}else{
					System.out.print("+" + m.coef + "x");
				}					
			}
		} else {
			if (m.coef < 0) {
				if(m.coef == -1){
					System.out.print("-x^" + m.degree);
				}else{
					System.out.print(m.coef + "x^" + m.degree);
				}					
			} else {
				if(m.coef == 1){
					System.out.print("+x^" + m.degree);
				}else{
					System.out.print("+" + m.coef + "x^" + m.degree);
				}
				
			}
		}

		System.out.println();

	}

	public String printPolyString() {

		String rez = "";
		arrangePoly();

		Monom m = head;

		while (m.next != null) {

			if (m.degree == 0) {
				if (m.coef < 0) {
					rez = rez.concat(Float.toString(m.coef));
				} else if(m.coef > 0){
					rez = rez.concat("+" + Float.toString(m.coef));
				}else if(m.coef == 0){
					rez = rez.concat("");
				}
			} else if (m.degree == 1) {
				if (m.coef < 0) {
					if(m.coef == -1){
						rez = rez.concat("-x");
					}else{
						rez = rez.concat(Float.toString(m.coef) + "x");
					}					
				} else if(m.coef > 0){
					if(m.coef == 1){
						rez = rez.concat("+x");
					}else{
						rez = rez.concat("+" + Float.toString(m.coef) + "x");
					}					
				}else if(m.coef == 0){
					rez = rez.concat("");
				}
			} else {
				if (m.coef < 0) {
					if(m.coef == -1){
						rez = rez.concat("-x^" + Integer.toString(m.degree));
					}else{
						rez = rez.concat(Float.toString(m.coef) + "x^" + Integer.toString(m.degree));
					}					
				} else if(m.coef > 0){
					if(m.coef == 1){
						rez = rez.concat("+x^" + Integer.toString(m.degree));
					}else{
						rez = rez.concat("+" + Float.toString(m.coef) + "x^" + Integer.toString(m.degree));
					}
					
				}else if(m.coef == 0){
					rez = rez.concat("");
				}
			}

			m = m.next;
		}

		if (m.degree == 0) {
			if (m.coef < 0) {
				rez = rez.concat(Float.toString(m.coef));
			} else if(m.coef > 0){
				rez = rez.concat("+" + Float.toString(m.coef));
			}else if(m.coef == 0){
				rez = rez.concat("");
			}
		} else if (m.degree == 1) {
			if (m.coef < 0) {
				if(m.coef == -1){
					rez = rez.concat("-x");
				}else{
					rez = rez.concat(Float.toString(m.coef) + "x");
				}					
			} else if(m.coef > 0){
				if(m.coef == 1){
					rez = rez.concat("+x");
				}else{
					rez = rez.concat("+" + Float.toString(m.coef) + "x");
				}					
			}else if(m.coef == 0){
				rez = rez.concat("");
			}
		} else {
			if (m.coef < 0) {
				if(m.coef == -1){
					rez = rez.concat("-x^" + Integer.toString(m.degree));
				}else{
					rez = rez.concat(Float.toString(m.coef) + "x^" + Integer.toString(m.degree));
				}					
			} else if(m.coef > 0){
				if(m.coef == 1){
					rez = rez.concat("+x^" + Integer.toString(m.degree));
				}else{
					rez = rez.concat("+" + Float.toString(m.coef) + "x^" + Integer.toString(m.degree));
				}
				
			}else if(m.coef == 0){
				rez = rez.concat("");
			}
		}

		
		
		return rez;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((head == null) ? 0 : head.hashCode());
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
		Polynome other = (Polynome) obj;
		if (head == null) {
			if (other.head != null)
				return false;
		} else if (!head.equals(other.head))
			return false;
		return true;
	}


}
