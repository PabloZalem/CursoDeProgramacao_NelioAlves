package db;

import java.util.List;

public interface VendedorDAO {
	void insert(Vendedor obj);
	void update(Vendedor obj);
	void deleteId(Vendedor obj);
	Vendedor findById(Integer id);
	List<Vendedor> findaAll();
	List<Vendedor> findByDepartment(Departamento departamento);
}
