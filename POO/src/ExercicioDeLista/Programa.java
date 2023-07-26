package ExercicioDeLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<Empregado>();
		
		System.out.print("Quantas pessoas você quer registrar: ");
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id ja existe, tente novamente");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			System.out.println();
			Empregado emp = new Empregado(id, nome, salario);
			
			list.add(emp);
		}
		
		System.out.print("Quantos funcionarios terao aumento : ");
		int idSalario = sc.nextInt();
		
		Empregado empregado = list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
		if (empregado == null) {
			System.out.println("Não exite");
		}else {
			System.out.print("Entra com a porcentagem: ");
			double porcent = sc.nextDouble();
			empregado.aumentarSalario(porcent);
		}
		
		System.out.println();
		System.out.println("Lista de Empregado: ");
		for(Empregado emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	public static Integer posicao(List<Empregado> list, int id) {
		//Dizer qual é a posicao desse id na lista
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static Boolean hasId(List<Empregado> list, int id) {
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
