import javax.swing.*;
public class entrada_Numeros {

	public static void main(String[] args) {
		
		String num1=JOptionPane.showInputDialog("Introduce a number");
		
		double num2=Double.parseDouble(num1);
		
		System.out.print("La raiz cuadrada de " + num1 + " es ");
		
		System.out.printf("%1.3f", Math.sqrt(num2));

	}

}
