package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InserirDados {
	public static void main(String[] args) {
		Connection connection = null;
		
		PreparedStatement preparedStatement = null;
		
		try {
			connection = DB.getConnection();
			preparedStatement = connection.prepareStatement
					(
						"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)"				
					);
			
			preparedStatement.setString(1, "Pablo Zalem");
			preparedStatement.setString(2, "zalem@hotmail.com");
			
			//Para Data
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			preparedStatement.setDate(3, new java.sql.Date(sdf.parse("07/11/1998").getTime()));
			preparedStatement.setDouble(4, 25000.0);
			preparedStatement.setInt(5, 4);
			
			int row = preparedStatement.executeUpdate();
			System.out.println("Feito" + row);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(preparedStatement);
			DB.fecharConexao();
		}
	}
}
