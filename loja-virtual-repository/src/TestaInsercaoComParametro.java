import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {
	
	public static void main(String[] args) throws SQLException {
		
		String nome = "Mouse";
		String descricao = "Mouse Sem Fio";
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperaConexao();

		Statement stm = connection.createStatement();
		stm.execute("INSERT INTO PRODUTO (nome, descricacao) VALUES ('" + nome + "', '" + descricao + "')"
				, Statement.RETURN_GENERATED_KEYS);

		ResultSet rst = stm.getGeneratedKeys();
		while (rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: " + id);
		}

	}

}