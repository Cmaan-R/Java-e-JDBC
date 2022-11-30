import java.sql.Connection;
import java.util.List;

import br.com.alura.jdbc.ConnectionFactory;

public class TestaListagemDeCategorias {

	public static void main(String[] args) {
	
	try(Connection connection = new ConnectionFactory().recuperaConexao()) {
		
		CategoriaDAO categoriaDAO = new CategoriaDAO(connection);	
		List<Categoria> listaDeCategoria = categoriaDAO.listar();
		
	}
		
	
		
		
	}

}
