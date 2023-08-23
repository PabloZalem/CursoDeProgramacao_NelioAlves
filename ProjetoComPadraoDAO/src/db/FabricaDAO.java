package db;

public class FabricaDAO {
	public static VendedorDAO createVendedorDAO() {
		return new VendedorDAOJDBC(DB.getConnection());
	}
	public static DepartamentoDAO createDepartamentoDAO() {
		return new DepartamentoDAOJDBC(DB.getConnection());
	}
}
