package ro.utcn.pt.lab01;

import java.util.regex.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);
	

	//Layout
	setLayout(new GridBagLayout());
	
	GridBagConstraints constraints = new GridBagConstraints();

	constraints.gridx = 1;
	constraints.gridy = 1;
	constraints.gridheight = 1;
	constraints.gridwidth = 1;
	constraints.weightx = 5;
	constraints.weighty = 5;
	constraints.insets = new Insets(10, 10, 10, 10);
	constraints.anchor = GridBagConstraints.CENTER;
	constraints.fill = GridBagConstraints.BOTH;

	//Add components
	final JTextField p1 = new JTextField();
	final JTextField p2 = new JTextField();
	final JTextField pr = new JTextField();
	JButton addBtn = new JButton("ADD");
	JButton subBtn = new JButton("SUB");
	JButton mulBtn = new JButton("MUL");
	JButton divBtn = new JButton("DIV");
	JButton derivBtn1 = new JButton("DERIVATE P1");
	JButton integrBtn1 = new JButton("INTEGRATE P1");
	JButton derivBtn2 = new JButton("DERIVATE P2");
	JButton integrBtn2 = new JButton("INTEGRATE P2");
	
	
	
	// ImageIcon image1 = new ImageIcon(getClass().getResource("imag/polynom.png"));
	
	

	JLabel l1 = new JLabel("P1: ");
	JLabel l2 = new JLabel("P2: ");
	JLabel l3 = new JLabel("RESULT: ");
	// JLabel image = new JLabel(image1);


	//SET FONT
	
	Font font = new Font(null, Font.PLAIN, 20);
	p1.setFont(font);
	p2.setFont(font);
	pr.setFont(font);

	l1.setFont(font);
	l2.setFont(font);
	l3.setFont(font);
	

	addBtn.setFont(font);
	subBtn.setFont(font);
	mulBtn.setFont(font);
	divBtn.setFont(font);
	derivBtn1.setFont(font);
	integrBtn1.setFont(font);
	derivBtn2.setFont(font);
	integrBtn2.setFont(font);

	//CONFIGURE LAYOUT

	add(l1, constraints);
	constraints.gridx = 5;
	constraints.gridwidth = 20;
	add(p1,constraints);
	constraints.gridwidth = 1;
	constraints.gridy = 5;
	constraints.gridx = 1;
	add(l2, constraints);
	constraints.gridwidth = 20;
	constraints.gridx = 5;
	add(p2,constraints);
	constraints.gridwidth = 1;
	constraints.gridx = 1;
	constraints.gridy = 10;
	add(l3, constraints);
	constraints.gridwidth = 20;
	constraints.gridx = 5;
	add(pr, constraints);
	constraints.gridwidth = 1;
	constraints.gridx = 1;
	constraints.gridy = 15;
	add(addBtn, constraints);
	constraints.gridx = 5;
	add(subBtn,constraints);
	constraints.gridx = 10;
	add(mulBtn,constraints);
	constraints.gridx = 15;
	add(divBtn,constraints);
	constraints.gridx = 25;
	constraints.gridy = 5;
	add(derivBtn2,constraints);
	constraints.gridx = 30;
	add(integrBtn2,constraints);
	constraints.gridx = 25;
    constraints.gridy = 1;
	add(derivBtn1, constraints);
	constraints.gridx = 30;
	add(integrBtn1, constraints);
	constraints.gridx = 25;
	constraints.gridy = 15;
	// add(image, constraints);
	
	

	//behavior

	// ADD
	addBtn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
			Polynome pol1 = new Polynome();
			Polynome pol2 = new Polynome();

			 pol1 = getPolynomes(pol1, p1);
			 pol2 = getPolynomes(pol2, p2);
			
			//Calculator Object
			Calculator c = new Calculator();
			
			Polynome polr = c.add(pol1, pol2);

			pr.setText(polr.printPolyString());
		}
	});

	//SUB

	subBtn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
			Polynome pol1 = new Polynome();
			Polynome pol2 = new Polynome();

			 pol1 = getPolynomes(pol1, p1);
			 pol2 = getPolynomes(pol2, p2);
			
			//Calculator Object
			Calculator c = new Calculator();
			
			Polynome polr = c.sub(pol1, pol2);

			pr.setText(polr.printPolyString());
		}
	});

	//mul

	mulBtn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
			Polynome pol1 = new Polynome();
			Polynome pol2 = new Polynome();

			 pol1 = getPolynomes(pol1, p1);
			 pol2 = getPolynomes(pol2, p2);
			
			//Calculator Object
			Calculator c = new Calculator();
			
			Polynome polr = c.mul(pol1, pol2);

			pr.setText(polr.printPolyString());
		}
	});

	//div

	divBtn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
			Polynome pol1 = new Polynome();
			Polynome pol2 = new Polynome();

			 pol1 = getPolynomes(pol1, p1);
			 pol2 = getPolynomes(pol2, p2);
			
			//Calculator Object
			Calculator c = new Calculator();
			String rez = c.div1(pol1, pol2);
			pr.setText(rez);
			
		}
	});
	
	//DERIV P1

	derivBtn1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			Polynome pol1 = new Polynome();

			pol1 = getPolynomes(pol1, p1);

			//Calculator object
			Calculator c = new Calculator();
			//Derivate
			Polynome polr = c.deriv(pol1);

			pr.setText(polr.printPolyString());
		}
	});

	//DERIV P2

	derivBtn2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			Polynome pol1 = new Polynome();

			pol1 = getPolynomes(pol1, p2);

			//Calculator object
			Calculator c = new Calculator();
			//Derivate
			Polynome polr = c.deriv(pol1);

			pr.setText(polr.printPolyString());
		}
	});

	//INTEGR P1

	integrBtn1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			Polynome pol1 = new Polynome();

			pol1 = getPolynomes(pol1, p1);

			//Calculator object
			Calculator c = new Calculator();
			//Derivate
			Polynome polr = c.integr(pol1);

			pr.setText(polr.printPolyString());
		}
	});

	//INTEGR P2

	integrBtn2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			Polynome pol1 = new Polynome();

			pol1 = getPolynomes(pol1, p2);

			//Calculator object
			Calculator c = new Calculator();
			//Derivate
			Polynome polr = c.integr(pol1);

			pr.setText(polr.printPolyString());
		}
	});
}

	public Polynome getPolynomes(Polynome pol1, JTextField p1){
		
		//Get polynomes as STRING
		String pn1 = p1.getText();		

		//Create polynomes by monoms
		String[] partsP1 = pn1.split("(?=\\+|\\-)");		
	
		Pattern p = Pattern.compile("([\\d|\\-d]+)x\\^([\\d|\\-\\d]+)");
	
		//add monoms to polynomials
		for(String part1 : partsP1){
			  Matcher m = p.matcher(part1);
			   m.find();
				pol1.insert(Float.parseFloat(m.group(1)), Integer.parseInt(m.group(2)));        
		}
		return pol1;
	}
}
