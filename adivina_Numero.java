//This is an illustrative game wich main purpose is to show how to use the "do while". 
//You have to guess a random number from 1 to 100. The program will help you giving clues about introducing a higher or lower number. 

import java.util.*;
public class adivina_Numero {

	public static void main(String[] args) {
		
		int random=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		
	    do  {
	    	intentos++;
	    	System.out.println("Introduce un número entero");
	    	
	    	numero=entrada.nextInt();
	    	
	    	if (random<numero) {
	    		
	    		System.out.println("Más bajo");
	   
	    		
	    	}
	    	else if (random>numero) {
	    		
	    		System.out.println("Más alto");
	    		
	    	}
	    	
	    }while (numero!=random);
		
		System.out.println("Lo has conseguido! Te tomó " + intentos + " intentos.");
		

	}

}
