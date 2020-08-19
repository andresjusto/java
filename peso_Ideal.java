//This program wants to tell the user what his ideal weight is according to his height.
import javax.swing.*;
public class peso_Ideal {

	public static void main(String[] args) {
		
		String genero="";
				
				do {
					genero=JOptionPane.showInputDialog("Introduce tu género (H/M)");			
				}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);	
	
	int altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura en CM"));
	
	int pesoideal=0;
	
	if (genero.equalsIgnoreCase("H")) {
		
		pesoideal=altura-110;
		
	}
	else if (genero.equalsIgnoreCase("M")) {
		
		pesoideal=altura-120;
		
	}
	
	System.out.println("Tu peso ideal es " + pesoideal);
	
  }
	
}
