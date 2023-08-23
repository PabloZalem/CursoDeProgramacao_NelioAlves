package db;

import java.util.List;

public interface DepartamentoDAO {
	void insert(Departamento obj);
	void update(Departamento obj);
	void deleteId(Integer obj);
	Departamento findById(Integer id);
	List<Departamento> findaAll();
}
