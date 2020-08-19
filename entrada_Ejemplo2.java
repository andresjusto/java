import javax.swing.*;
public class entrada_Ejemplo2 {

	public static void main(String[] args) {
		
		String username=JOptionPane.showInputDialog("Introduce tu nombre");
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad, por favor");
		
		int edad_user=Integer.parseInt(edad);
		
		edad_user++;

		System.out.println("Hola " + username + ". Tienes " + edad + " años y el año que viene tendrás " + (edad_user));
	}


}
