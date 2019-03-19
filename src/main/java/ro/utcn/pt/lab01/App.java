package ro.utcn.pt.lab01;

import java.util.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {
	public static void main(String[] args) {
		Polynome p1 = new Polynome();
		Polynome p2 = new Polynome();
		Calculator c = new Calculator();

		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new JFrame("Polynomials Calculator");
				frame.setSize(700, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});





		// p1.insert(-10, 2);
		// p1.insert(-4, 6);
		// p1.insert(9, 0);
		
		
		// p2.insert(15, 10);
		// p2.insert(5, 6);
		// p2.insert(9, 2);
		
		// p1.printPoly();
		// p2.printPoly();
		
		// System.out.println("Suma polinoamelor: ");
		// Polynome p3 = c.add(p1, p2);
		// p3.printPoly();

		// System.out.println("Diferenta polinoamelor: ");
		// Polynome p4 = c.sub(p1, p2);
		// p4.printPoly();

		// System.out.println("Produsul polinoamelor: ");
		// Polynome p5 = c.mul(p1, p2);
		// p5.printPoly();
		
		// System.out.println("Raportul polinoamelor: ");
		// Polynome p6 = c.div(p1, p2);
		// p6.printPoly();

		// System.out.println("P1 derivat: ");
		// Polynome p7 = c.deriv(p1);
		// p7.printPoly();

		// System.out.println("P2 derivat: ");
		// Polynome p8 = c.deriv(p2);
		// p8.printPoly();

		// System.out.println("P2 integrat: ");
		// Polynome p9 = c.integr(p1);
		// p9.printPoly();
		
		// System.out.println("P2 integrat: ");
		// Polynome p10 = c.integr(p2);
		// p10.printPoly();


		
	}
}
