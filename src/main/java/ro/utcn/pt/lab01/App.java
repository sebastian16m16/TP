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
		p2.insert(5, 3);
		p2.insert(9, 0);
		p2.insert(5, 1);

		p1.printPoly();
		p2.printPoly();

		Polynome p3 = c.add(p1, p2);

		p3.printPoly();

		
	}
}
