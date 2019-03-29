package ro.utcn.pt.lab01;

import org.junit.Test;

public class AdditionTest{

    @Test
    public void testAdd(){
    	Calculator c = new Calculator();
    	MainFrame m = new MainFrame();
    	
    	String pol1 = "5x^6+4x^3+17x^0";
    	String pol2 = "6x^3+13x^0";
    	
    	Polynome p1 = new Polynome();
    	Polynome p2 = new Polynome();
    	Polynome pr = new Polynome();
    	
    	p1 = m.getPolynomes1(p1, pol1);
    	p2 = m.getPolynomes1(p2, pol2);
    	
    	String myResult = "5x^6 + 10x^3 + 30x^0";
    	
    	pr = m.getPolynomes1(pr, myResult);
    	
    	Polynome restult = c.add(p1,p2);
    	
    	
        assert (restult.equals(pr));
    }
}