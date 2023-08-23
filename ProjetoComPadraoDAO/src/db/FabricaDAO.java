package db;

public class FabricaDAO {
	public static VendedorDAO createVendedorDAO() {
		return new VendedorDAOJDBC(DB.getConnection());
	}
}
