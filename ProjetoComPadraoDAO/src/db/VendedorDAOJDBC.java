package db;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendedorDAOJDBC implements VendedorDAO{
	private Connection connection = null;
	
	public VendedorDAOJDBC(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void insert(Vendedor obj) {	
		PreparedStatement preparedStatement = null;
		
		try{
			preparedStatement = connection.prepareStatement(
						"INSERT INTO seller "
						+ "		(Name, Email, BirthDate, BaseSalary, DepartmentId) "
						+ "		VALUES "
						+ "		(?, ?, ?, ?, ?) ",
						Statement.RETURN_GENERATED_KEYS
					);
			preparedStatement.setString(1, obj.getNome());
			preparedStatement.setString(2, obj.getEmail());
			preparedStatement.setDate(3, new java.sql.Date(obj.getDataDeNascimento().getTime()));
			preparedStatement.setDouble(4, obj.getSalarioBase());
			preparedStatement.setInt(5, obj.getDepartamento().getId());
			
			int linha = preparedStatement.executeUpdate();
			
			if (linha > 0) {
				ResultSet resultSet = preparedStatement.getGeneratedKeys();
				if (resultSet.next()) {
					int id = resultSet.getInt(1);
					obj.setId(id);
				}
				
				DB.closeResulSet(resultSet);
			}else {
				throw new DbException("Erro inesperado nenhuma linha preenchido");
			}
					
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(preparedStatement);
		}
	}

	@Override
	public void update(Vendedor obj) {
PreparedStatement preparedStatement = null;
		
		try{
			preparedStatement = connection.prepareStatement(
						"UPDATE seller "
						+ "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
						+ "WHERE Id = ? "
					);
			preparedStatement.setString(1, obj.getNome());
			preparedStatement.setString(2, obj.getEmail());
			preparedStatement.setDate(3, new java.sql.Date(obj.getDataDeNascimento().getTime()));
			preparedStatement.setDouble(4, obj.getSalarioBase());
			preparedStatement.setInt(5, obj.getDepartamento().getId());
			preparedStatement.setInt(6, obj.getId());
			
			preparedStatement.executeUpdate();
					
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(preparedStatement);
		}
	}

	@Override
	public void deleteId(Integer obj) {
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(
						"DELETE FROM seller "
						+ "WHERE Id = ? "
					);
			preparedStatement.setInt(1, obj);
			int linha = preparedStatement.executeUpdate();
			
			if (linha == 0) {
				throw new DbException("Id não existe");
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(preparedStatement);
		}
	}

	@Override
	public Vendedor findById(Integer id) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement
					(
					"SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE seller.Id = ?"
					);
			
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				Departamento departamento = instanciandoDepartamento(resultSet);
				Vendedor vendedor = instanciandoVendedor(resultSet, departamento);
				return vendedor;
			}
			return null;
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatement(preparedStatement);
			DB.closeResulSet(resultSet);
		}
	}

	private Vendedor instanciandoVendedor(ResultSet resultSet, Departamento departamento) throws SQLException {
		Vendedor vendedor = new Vendedor();
		vendedor.setId(resultSet.getInt("Id"));
		vendedor.setNome(resultSet.getString("Name"));
		vendedor.setEmail(resultSet.getString("Email"));
		vendedor.setSalarioBase(resultSet.getDouble("BaseSalary"));
		vendedor.setDataDeNascimento(resultSet.getDate("BirthDate"));
		vendedor.setDepartamento(departamento);
		return vendedor;
	}

	private Departamento instanciandoDepartamento(ResultSet resultSet) throws SQLException {
		Departamento departamento = new Departamento();
		departamento.setId(resultSet.getInt("DepartmentId"));
		departamento.setNome(resultSet.getString("DepName"));
		return departamento;
	}

	@Override
	public List<Vendedor> findaAll() {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(
					"SELECT seller.*,department.Name as DepName " 
					+ "FROM seller INNER JOIN department " 
					+ "ON seller.DepartmentId = department.Id "
					+ "ORDER BY Name "
					);
			
			resultSet = preparedStatement.executeQuery();
			
			List<Vendedor> list = new ArrayList<>();
			Map<Integer, Departamento> map = new HashMap<>();
			
			while (resultSet.next()) {
				Departamento dep = map.get(resultSet.getInt("DepartmentId"));
				
				if (dep == null) {
					dep = instanciandoDepartamento(resultSet);
					map.put(resultSet.getInt("DepartmentId"), dep);
				}
				Vendedor vend = instanciandoVendedor(resultSet, dep);
				list.add(vend);
			}
			return list;
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(preparedStatement);
			DB.closeResulSet(resultSet);
		}
	}

	@Override
	public List<Vendedor> findByDepartment(Departamento departamento) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(
					"SELECT seller.*,department.Name as DepName " 
					+ "FROM seller INNER JOIN department " 
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE DepartmentId = ? "
					+ "ORDER BY Name "
					);
			preparedStatement.setInt(1, departamento.getId());
			resultSet = preparedStatement.executeQuery();
			
			List<Vendedor> list = new ArrayList<>();
			Map<Integer, Departamento> map = new HashMap<>();
			
			while (resultSet.next()) {
				Departamento dep = map.get(resultSet.getInt("DepartmentId"));
				
				if (dep == null) {
					dep = instanciandoDepartamento(resultSet);
					map.put(resultSet.getInt("DepartmentId"), dep);
				}
				Vendedor vend = instanciandoVendedor(resultSet, departamento);
				list.add(vend);
			}
			return list;
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(preparedStatement);
			DB.closeResulSet(resultSet);
		}
	}

}
