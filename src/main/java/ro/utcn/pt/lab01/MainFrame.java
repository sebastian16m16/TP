package ro.utcn.pt.lab01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
	JButton derivBtn = new JButton("DERIVATE");
	JButton integrBtn = new JButton("INTEGRATION");

	JLabel l1 = new JLabel("P1: ");
	JLabel l2 = new JLabel("P2: ");
	JLabel l3 = new JLabel("RESULT: ");
	JLabel explain = new JLabel("(For the Derivative/Integration functions)");

	//SET FONT
	
	Font font = new Font(null, Font.PLAIN, 20);
	p1.setFont(font);
	p2.setFont(font);
	pr.setFont(font);

	l1.setFont(font);
	l2.setFont(font);
	l3.setFont(font);
	explain.setFont(font);

	addBtn.setFont(font);
	subBtn.setFont(font);
	mulBtn.setFont(font);
	divBtn.setFont(font);
	derivBtn.setFont(font);
	integrBtn.setFont(font);

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
	constraints.gridx = 20;
	add(derivBtn,constraints);
	constraints.gridx = 25;
	add(integrBtn,constraints);
    constraints.gridy = 1;
    add(explain, constraints);
	
	

	//behavior
	addBtn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			p1.append("Apasat!");
		}

	});

}
}
