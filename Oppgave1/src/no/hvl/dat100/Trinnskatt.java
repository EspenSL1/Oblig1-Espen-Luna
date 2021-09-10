package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Trinnskatt {

	public static void main(String[] args) {
		
		String bruttoString = showInputDialog("Bruttoinntekt: ");
		int brutto = Integer.parseInt(bruttoString);
		
		double trinn1 = 1.70;
		double trinn2 = 4.00;
		double trinn3 = 13.20;
		double trinn4 = 16.20;
		
		if (brutto > 184000 && brutto <= 260100) {
			showMessageDialog(null, utskrift(trinn1, brutto));

		} else if (brutto > 260100 && brutto <= 651250) {
			showMessageDialog(null, utskrift(trinn2, brutto));
			
		} else if (brutto > 651250 && brutto <= 1021550) {
			showMessageDialog(null, utskrift(trinn3, brutto));
			
		} else if (brutto > 1021550) {
			showMessageDialog(null, utskrift(trinn4, brutto));

		} else {
			showMessageDialog(null, "Sats: 0.0%");
		}
	}
	
	public static String utskrift (double trinn, int brutto) {
		double skatt = ((brutto / 100) * trinn);
		return "Sats: " + trinn + "%\nSkatt: " + skatt + "\nTotal " + (skatt + brutto);
		
	}
}
