package ro.utcn.pt.lab01;

import java.util.*;

public class App {
	public static void main(String[] args) {
		Polynome p1 = new Polynome();
		Polynome p2 = new Polynome();
		Calculator c = new Calculator();

		p1.insert(-10, 2);
		p1.insert(-4, 6);
		p1.insert(9, 0);
		
		
		p2.insert(15, 10);
		p2.insert(5, 6);
		p2.insert(9, 2);
		
		p1.printPoly();
		p2.printPoly();
		
		System.out.println("Suma polinoamelor: ");
		Polynome p3 = c.add(p1, p2);
		p3.printPoly();

		System.out.println("Diferenta polinoamelor: ");
		Polynome p4 = c.sub(p1, p2);
		p4.printPoly();

		System.out.println("Produsul polinoamelor: ");
		Polynome p5 = c.mul(p1, p2);
		p5.printPoly();



		
	}
}
