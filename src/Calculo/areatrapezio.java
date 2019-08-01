package Calculo;

import javax.swing.JOptionPane;

public class areatrapezio {
	public static void main (String[]args) {
		
		double res;
		double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da base inferior:" ));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da base superior:" ));
		double h = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da altura:" ));
		
		res=(B+b)*h/2;
		
		JOptionPane.showMessageDialog(null, "O valor da area do trapezio e: " +res);
		
		System.out.println("O valor da area do trapezio e: " +res);
	}

}
