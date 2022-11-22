package br.com.alura.jdbc;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		System.out.println("Abrindo conexao...");

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperaConexao();

		System.out.println("Fechando conexao...");

		connection.close();

	}

}
