package ro.utcn.pt.lab01;

public class Calculator {
	
	

	public Polynome add(Polynome p1, Polynome p2) {
		//Add
		Polynome pr = new Polynome();
		Monom temp1 = p1.head;
		Monom temp2 = p2.head;
		int d = 0;

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

		while(temp1 != null){
			while(temp2 != null){

				pr.insert(temp1.coef * temp2.coef, temp1.degree + temp2.degree);
				temp2 = temp2.next;
			}
			temp2 = p2.head;
			temp1 = temp1.next;
		}
		
		return pr;
	}
}
