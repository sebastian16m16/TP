package ro.utcn.pt.lab01;

public class Polynome {
	
	Monom head;
	
	public void insert(int coef, int degree) {
		
		Monom monom = new Monom();
		monom.coef = coef;
		monom.degree = degree;
		monom.next = null;
		
		if(head == null) {
			head = monom;
		}else {
			
			Monom m = head;
			
			while(m.next != null) {
				
				m = m.next;
			}
			m.next = monom;
			
		}
	}
	
	public int getPolySize() { 
     
        Monom temp = head; 
        int size = 0; 
        while (temp != null) 
        { 
            size++; 
            temp = temp.next; 
        } 
        return size; 
    } 
	
	public void arrangePoly() {
		int x, y;
		for(int i=0; i<getPolySize()/2; i++) {
			Monom m = head;
			
			while(m.next != null) {
				if(m.degree < m.next.degree && m.next != null) {
					
					//switch degrees
					x = m.degree;
					m.degree = m.next.degree;
					m.next.degree = x;
					//switch coefs
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
		
		while(m.next != null) {
			
			if(m.degree == 0){
				if(m.coef < 0) {
					System.out.print(m.coef);
				}else {
					System.out.print("+" + m.coef);
				}
			}else if(m.degree == 1){
				if(m.coef < 0) {
					System.out.print(m.coef + "x");
				}else {
					System.out.print("+" + m.coef + "x");
				}
			}else{
				if(m.coef < 0) {
					System.out.print(m.coef + "x^" + m.degree);
				}else {
					System.out.print("+" + m.coef + "x^" + m.degree);
				}
			}
			
			
			m = m.next;
		}
		
		if(m.degree == 0){
			if(m.coef < 0) {
				System.out.print(m.coef);
			}else {
				System.out.print("+" + m.coef);
			}
		}else if(m.degree == 1){
			if(m.coef < 0) {
				System.out.print(m.coef + "x");
			}else {
				System.out.print("+" + m.coef + "x");
			}
		}else{
			if(m.coef < 0) {
				System.out.print(m.coef + "x^" + m.degree);
			}else {
				System.out.print("+" + m.coef + "x^" + m.degree);
			}
		}
		
		System.out.println();

	
	}
	
	
}
