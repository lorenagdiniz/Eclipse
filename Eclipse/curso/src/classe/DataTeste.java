package classe;

public class DataTeste {
	public static void main(String[] args) {
	
		Data d1 = new Data();
		d1.dia = 03;
		d1.mes = 03;
		d1.ano = 2019;
		
		Data d2 = new Data();
		d2.dia = 26;
		d2.mes = 05;
		d2.ano = 1988;
		
		
		System.out.println("Théo: " + d1.dia + "/" 
		        + d1.mes + "/" + d1.ano);
		System.out.println("Felipe: " + d2.dia + "/"
				+ d2.mes + "/" + d2.ano);
	}

}
