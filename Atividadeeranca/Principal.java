package Atividadeeranca;

public class Principal {

	public static void main(String [] args) {
		Veiculo veiculo = new Veiculo ("Porche", "911", 2023, "branco"); 

		System.out.println("Veiculo"); 

		System.out.println("marca: " + veiculo.getMarca()); 

		System.out.println("modelo: " + veiculo.getModelo());

		System.out.println("ano: " + veiculo.getAno()); 

		System.out.println("cor: " + veiculo.getCor()); 

		Automovel automovel = new Automovel( "ferrari", "ferrari", 2022, "vermelho", 2, "v12"); 

		System.out.println("Automovel"); 

		System.out.println("marca: " + automovel.getMarca()); 

		System.out.println("modelo: " + automovel.getModelo());

		System.out.println("ano: " + automovel.getAno()); 
		
		System.out.println("cor: " + automovel.getCor()); 
		
		System.out.println("numeroPortas: " + automovel.getNumeroPortas()); 
		
		System.out.println("motor: " + automovel.getMotor()); 
		
		
		Moto moto = new Moto( "cj6", "2020", 2020, "azul", 1000 );
		
		System.out.println("Moto"); 

		System.out.println("marca: " + moto.getMarca()); 

		System.out.println("modelo: " + moto.getModelo());

		System.out.println("ano: " + moto.getAno()); 
		
		System.out.println("cor: " + moto.getCor()); 
		
		System.out.println("cilindrada: " + moto.getCilindrada()); 
		
		
		





	}
}
