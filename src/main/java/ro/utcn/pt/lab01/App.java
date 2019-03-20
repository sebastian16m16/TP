package ro.utcn.pt.lab01;

import java.util.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class App {
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new MainFrame("Polynomials Calculator");
				frame.setSize(1000, 700);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});





		
	}
}
