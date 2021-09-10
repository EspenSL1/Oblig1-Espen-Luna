package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Fakultet {
	
	public static void main(String[] args) {
		
		while (true) {
			
			String sumTxt = showInputDialog("Tall:" );
			int n = Integer.parseInt(sumTxt);
			
			if (n>0) {
				showMessageDialog(null, n + "! = " +fak(n));
				break;
			} else {
				showMessageDialog(null, "Ugyldig tall");
			}
		}
	}
	
	public static int fak(int n) {
		// 1! = 1 
		if (n==1) {
			return 1;
		}
		// x! = x * (x-1)! 
		return n * (fak(n-1));
	}
}
