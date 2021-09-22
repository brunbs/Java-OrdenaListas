import java.util.ArrayList;


import java.util.List;

public class OrdenaListas {

	public static void main(String[] args) {

		Conta c1 = new Conta(1, 1, "Bruno", 100);
		Conta c2 = new Conta(5, 1, "Cassia", 200);
		Conta c3 = new Conta(3, 2, "Janice", 5000);
		Conta c4 = new Conta(4, 3, "Marco", 12500);
		
		List<Conta> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		
		lista.forEach((Conta conta) -> System.out.println(conta)); //printa cada elemento da lista utilizando expressão lambda
		
		System.out.println("-------------------------------");
		
		//Ordenação dos elementos da lista
		lista.sort((cc1, cc2)-> Integer.compare(cc1.getNumero(), cc2.getNumero())); //utiliza método da classe Integer para comparar
		
		lista.forEach((Conta conta) -> System.out.println(conta));
		
	}

}


