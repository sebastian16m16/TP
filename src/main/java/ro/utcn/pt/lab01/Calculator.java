package ro.utcn.pt.lab01;

public class Calculator {
	
	

	public Polynome add(Polynome p1, Polynome p2) {
		//Add
		Polynome pr = new Polynome();
		Monom temp1 = p1.head;
		Monom temp2 = p2.head;
		int d = 0;

		// ADUNARE POLINOAME
		while(temp1 != null){

			while(temp2 != null){
				
				if(temp1.degree == temp2.degree){
					pr.insert(temp1.coef+temp2.coef, temp1.degree);
					d = 1;
				}
				temp2 = temp2.next;
			}
			if(d == 0){
				pr.insert(temp1.coef, temp1.degree);
			}
			d = 0;
			
			temp2 = p2.head;
			temp1 = temp1.next;
			
		}

		// INSERT DIF din POLYNOMUL 2
		temp1 = p1.head;
		temp2 = p2.head;
		while(temp2 != null){

			while(temp1 != null){
				
				if(temp1.degree == temp2.degree){
					d = 1; 
				}
				temp1 = temp1.next;
			}
			if(d == 0){
				pr.insert(temp2.coef, temp2.degree);
			}
			d =0; 
			temp1 = p1.head;
			temp2 = temp2.next;
			
		}

		return pr;
	}

	public Polynome sub(Polynome p1, Polynome p2) {
		//Add
		Polynome ps = new Polynome();
		Monom temp1 = p1.head;
		Monom temp2 = p2.head;
		int d = 0;

		while(temp1 != null){

			while(temp2 != null){
				
				if(temp1.degree == temp2.degree){
					ps.insert(temp1.coef - temp2.coef, temp1.degree);
					d = 1;
				}
				temp2 = temp2.next;
			}
			if(d == 0){
				ps.insert(temp1.coef, temp1.degree);
			}
			d = 0;
			
			temp2 = p2.head;
			temp1 = temp1.next;
			
		}

		temp1 = p1.head;
		temp2 = p2.head;
		while(temp2 != null){

			while(temp1 != null){
				
				if(temp1.degree == temp2.degree){
					d = 1; 
				}
				temp1 = temp1.next;
			}
			if(d == 0){
				ps.insert(temp2.coef, temp2.degree);
			}
			d =0; 
			temp1 = p1.head;
			temp2 = temp2.next;
			
		}
		return ps;
	}

	public Polynome mul(Polynome p1, Polynome p2) {
		Polynome pr = new Polynome();
		Monom temp1 = p1.head;
		Monom temp2 = p2.head;

		//INMULTIRE POLINOAME
		while(temp1 != null){
			while(temp2 != null){

				pr.insert(temp1.coef * temp2.coef, temp1.degree + temp2.degree);
				temp2 = temp2.next;
			}
			temp2 = p2.head;
			temp1 = temp1.next;
		}

		// ELIMINARE DUPLICATE
		Monom temp3 = pr.head;
		Monom temp4 = pr.head;
		Polynome ps = new Polynome();

		while(temp3 != null){
			while(temp4 != null){
				if(temp3.degree == temp4.degree)
					ps.insert(temp3.coef + temp4.coef, temp3.degree);
					ps.delete(temp4);
				temp4 = temp4.next;
			}
			temp4 = pr.head;
			temp3 = temp3.next;
		}
		
		return ps;
	}
}
