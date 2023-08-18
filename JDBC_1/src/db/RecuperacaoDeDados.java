package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RecuperacaoDeDados {
	public static void main(String[] args) {
		//conectar o banco
		Connection connection = null;
		
		//consulta o banco
		Statement statement = null;
		
		//Resultado da consulta
		ResultSet resultSet = null;
		
		try {
			connection = DB.getConnection();			
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from department");
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Name"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeResulSet(resultSet);
			DB.closeStatement(statement);
			DB.fecharConexao();
		}
	}
}