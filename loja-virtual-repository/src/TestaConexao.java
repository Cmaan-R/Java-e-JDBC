import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		System.out.println("Abrindo conexao...");

		CriaConexao criarConexao = new CriaConexao();
		Connection connection = criarConexao.recuperaConexao();

		System.out.println("Fechando conexao...");

		connection.close();

	}

}
