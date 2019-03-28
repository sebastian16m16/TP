package ro.utcn.pt.lab01;

import com.sun.xml.internal.bind.v2.model.core.ID;

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
		Monom temp3 = ps.head;
		
		while(temp3 != null) {
			if(temp3.coef == 0)
				ps.delete(temp3);
			temp3 = temp3.next;
		}
		ps.arrangePoly();
		
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
		

		//ARANJARE POLINOM
		Monom temp3 = pr.head;
		while(temp3 != null){
			Monom temp4 = temp3.next;
			while(temp4 != null){
				if(temp3.degree == temp4.degree){
					temp3.coef = temp3.coef + temp4.coef;
					pr.delete(temp4);
				}
				temp4 = temp4.next;
			}
			temp3 = temp3.next;
		}

		return pr;
	}

	public Polynome deriv(Polynome p1){
		Monom temp1 = p1.head;
		Polynome pr = new Polynome();

		while(temp1 != null){

			pr.insert(temp1.coef * temp1.degree, temp1.degree-1);
			temp1 = temp1.next;
		}
		return pr;
	}

	public Polynome integr(Polynome p1){
		Monom temp1 = p1.head;
		Polynome pr = new Polynome();

		while(temp1 != null){
			pr.insert(temp1.coef / (temp1.degree + 1), temp1.degree + 1);
			temp1 = temp1.next;
		}

		return pr;
	}

	public String div(Polynome p1, Polynome p2){
		Polynome pr = new Polynome();
		Monom temp2 = p2.head;
		Monom temp1 = p1.head;

		float coef;
		int degree;


		while(temp1.degree >= temp2.degree){
			pr.insert(temp1.coef / temp2.coef, temp1.degree-temp2.degree);
			coef = temp1.coef / temp2.coef;
			degree = temp1.degree-temp2.degree;

			Polynome p_inter = new Polynome();
			
			while(temp2 != null){
				p_inter.insert(temp2.coef * coef, temp2.degree + degree);
				
				temp2 = temp2.next;
			}
			p1 = sub(p1, p_inter);
			temp1 = p1.head;
			temp2 = p2.head;
			if(temp1 == null)
				break;
		}
		
		if(p1.head != null)
			return pr.printPolyString() + "+((" + p1.printPolyString() + 
					")/(" + p2.printPolyString() + "))";
		else
			return pr.printPolyString();
			
	}
	
}
