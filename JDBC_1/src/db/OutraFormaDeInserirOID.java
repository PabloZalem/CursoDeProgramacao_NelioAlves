package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OutraFormaDeInserirOID {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = DB.getConnection();

			preparedStatement = connection.prepareStatement(
					"insert into department (Name) values ('D1'), ('D2')",
					Statement.RETURN_GENERATED_KEYS
					);
					
			int row = preparedStatement.executeUpdate();
			ResultSet resultSet = preparedStatement.getGeneratedKeys();

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				System.out.println("Feito id: " + id);
			}
			if (row > 0) {

			} else {
				System.out.println("Nenhuma linha foi alterada");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(preparedStatement);
			DB.fecharConexao();
		}
	}
}
