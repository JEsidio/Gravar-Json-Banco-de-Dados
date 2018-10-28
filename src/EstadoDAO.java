import java.sql.Connection;
import java.sql.PreparedStatement;

public class EstadoDAO extends ConnectionFactory{

	public void novoEstado(Estado estado){

		try{

			Connection connection = getConnection();

			PreparedStatement stmt = connection.prepareStatement("insert estado(idEstado, nomeEstado, siglaEstado, capitalEstado, pais_idPais) values(?, ?, ?, ?, ?)");
			stmt.setInt(1, estado.getId());
			stmt.setString(2, estado.getNome());
			stmt.setString(3, estado.getSigla());
			stmt.setString(4, estado.getCapital());
			stmt.setInt(5, estado.getIdPais());

			stmt.execute();
			stmt.close();
		}catch (Exception e) {
			e.printStackTrace();
            throw new RuntimeException();
        }

	}

}
