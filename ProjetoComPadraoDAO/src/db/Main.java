package db;

import java.util.List;

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
	}
}
