package fundamentos;

import java.util.Scanner;

public class tipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String ("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		
	Scanner entrada = new Scanner(System.in);
	
	String s2 = entrada.nextLine();
	System.out.println(s2);
	System.out.println("2" == s2.trim());
	System.out.println("2".equals(s2.trim()));
	
	entrada.close();
	
		
		
	}

}
