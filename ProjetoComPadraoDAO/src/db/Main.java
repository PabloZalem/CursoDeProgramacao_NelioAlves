package db;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		VendedorDAO dao = FabricaDAO.createVendedorDAO();
		
		System.out.println("TESTE 1: SELLER findById");
		Vendedor vendedor = dao.findById(3);
		System.out.println(vendedor);
		
		System.out.println("TESTE 2: SELLER findByDepartment");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = dao.findByDepartment(departamento);	
		for (Vendedor vend : list) {
			System.out.println(vend);
		}
		
		System.out.println("TESTE 3: SELLER findAll");
		list = dao.findaAll();	
		for (Vendedor vend : list) {
			System.out.println(vend);
		}
		
		System.out.println("TESTE 4: INSERIR");
		Vendedor novoVendedor = new Vendedor(null, "Michelle", "michelle@michelle.com", new Date(), 4000.0, departamento);
		dao.insert(novoVendedor);
		System.out.println("Inserido um novo ID: " + novoVendedor.getId());
		
		System.out.println("TESTE 5: ATUALIZAR");
		vendedor = dao.findById(1);
		vendedor.setNome("Marcela Franca");
		dao.update(vendedor);
		System.out.println("Atualizado com sucesso");
		
		
		System.out.println("TESTE 6: DELETAR");
		System.out.print("Entra com o ID para testar: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		dao.deleteId(id);
		System.out.println("Deletado com sucesso");
		sc.close();
	}
}
