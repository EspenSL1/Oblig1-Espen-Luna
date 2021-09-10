package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakter {

	public static void main(String[] args) {
		
		String karakter = "";

		for(int i = 0; i<10; i++ ) {
			
			String sumTxt = showInputDialog("Poengsum:" );
			int sum = Integer.parseInt(sumTxt);

			if (sum <= 39) {
				 karakter = "F";
			} else if (sum <= 49 && sum >= 40) {
				 karakter = "E";
			} else if (sum <= 59 && sum >= 50) {
				 karakter = "D";
			} else if (sum <= 79 && sum >= 60) {
				 karakter = "C";
			} else if (sum <= 89 && sum >= 80) {
				 karakter = "B";
			} else if (sum <= 100 && sum >= 90) {
				 karakter = "A";
			} else {
				 karakter = "Ugyldig poengsum. Fyll ut igjen.";
				 i--;
			}
			
			showMessageDialog(null, karakter);
			System.out.println("Karakter: " + karakter);
		}

	}

}
