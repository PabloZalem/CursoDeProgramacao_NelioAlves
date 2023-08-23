package db;

import java.util.List;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartamentoDAO departmentDao = FabricaDAO.createDepartamentoDAO();

		System.out.println("=== TEST 1: findById =======");
		Departamento dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: findAll =======");
		List<Departamento> list = departmentDao.findaAll();
		for (Departamento d : list) {
			System.out.println(d);
		}

		System.out.println("\n=== TEST 3: insert =======");
		Departamento newDepartment = new Departamento(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());

		System.out.println("\n=== TEST 4: update =======");
		Departamento dep2 = departmentDao.findById(1);
		dep2.setNome("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteId(id);
		System.out.println("Delete completed");

		sc.close();
	}
}
