package controle;

import java.util.Scanner;
public class WhileIndeterminado {
 
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
	    String digite = ""; 
		
		while(!digite.equalsIgnoreCase ("Sair")) { 
			 System.out.println("Digite algo: ");
			 digite = entrada.next(); 
			 
			
		}
		
		
		entrada.close();
		
}
}
