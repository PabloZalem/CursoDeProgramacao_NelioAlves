package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletarDados {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = DB.getConnection();
			preparedStatement = connection.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?"
					);
			preparedStatement.setInt(1, 5);
			
			int linha = preparedStatement.executeUpdate();
			System.out.println("Feito: " + linha);
		}
		catch(SQLException e) {
			throw new DbIntegrationException(e.getMessage());
		}
		finally {
			DB.closeStatement(preparedStatement);
			DB.fecharConexao();
		}
	}
}
