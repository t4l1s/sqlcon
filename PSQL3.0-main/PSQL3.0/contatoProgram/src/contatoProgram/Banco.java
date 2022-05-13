package contatoProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Banco {
	
	String jdbcURL = "jdbc:postgresql://localhost:5433/java";
	String username = "postgres";
	String password = "mysecretpassword";
	
	public Banco(String n, String s, String e) {
		
		
		try {
			//abre conexao com o servidor
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
						
			String sql = "INSERT INTO contato (frist_name, last_name, email) VALUES(?, ?,?)";
			
			//Statement statement = connection.createStatement();
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, n);
			statement.setString(2, s);
			statement.setString(3, e);
			
			int rows = statement.executeUpdate();
			
			//fecha conexao com o servidor
			connection.close();
		} catch (SQLException erro) {
			//deu bosta fí
			System.out.println("Erro na conexao com o servidor");
			erro.printStackTrace();
		}
	}
}
