import java.util.*;

public class entrada_Ejemplo1 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Por favor, introduce tu nombre ");
		
		String username=entrada.nextLine();
		
		System.out.print("Introduce tu edad ");
		
		int edad=entrada.nextInt();
		
		System.out.print("Hola " + username + " . El año que viene tendrás " + (edad + 1) + " años.");

	}

}
