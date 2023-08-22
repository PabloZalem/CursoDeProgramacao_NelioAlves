package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transacoes {
	public static void main(String[] args) {
		Connection connection = null;
		Statement preparedStatement = null;
		try {
			connection = DB.getConnection();
			//Nao confirmar as ações automaticamente
			connection.setAutoCommit(false);
			preparedStatement = connection.createStatement(); 
			
			int linhas = preparedStatement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			int linhas_2 = preparedStatement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			//Confirmação da transacao
			connection.commit();
		}
		catch(SQLException e){
			try {
				connection.rollback();
				throw new DbException("Transacao precisou ser voltada, causada por: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Transacao precisou ser voltada, causada por: " + e1.getMessage());
			}
		}
		finally {
			DB.closeStatement(preparedStatement);
			DB.fecharConexao();
		}
	}
}
