package contatoProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoProgram {

	public static void main(String[] args) {
		// variaveis de conexao
				String jdbcURL = "jdbc:postgresql://localhost:5433/java";
				String username = "postgres";
				String password = "mysecretpassword";
				
				try {
					//abre conexao com o servidor
					Connection connection = DriverManager.getConnection(jdbcURL, username, password);
					System.out.println("conectado ao servidor Postgresql");
					
					String sql = "INSERT INTO contato (frist_name, last_name, email) VALUES(?, ?,?)";
					
					//Statement statement = connection.createStatement();
					
					PreparedStatement statement = connection.prepareStatement(sql);
					statement.setString(1, "andreson");
					statement.setString(2, "gusmao");
					statement.setString(3, "flavio@email.com");
					
					int rows = statement.executeUpdate();
					if (rows > 0) {
						System.out.println("um novo contato foi inserido");
					}
					
					
					//fecha conexao com o servidor
					connection.close();
				} catch (SQLException e) {
					//deu bosta fí
					System.out.println("Erro na conexao com o servidor");
					e.printStackTrace();
				}

	}

}
