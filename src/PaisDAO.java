import java.sql.Connection;
import java.sql.PreparedStatement;

public class PaisDAO  extends ConnectionFactory{

	public void novoPais(Pais pais){

		try{

			Connection connection = getConnection();

			PreparedStatement stmt = connection.prepareStatement("insert pais(idPais, nomePais, continentePais, capitalPais) values(?, ?, ?, ?)");
			stmt.setInt(1, pais.getId());
			stmt.setString(2, pais.getNome());
			stmt.setString(3, pais.getContinente());
			stmt.setString(4, pais.getCapital());

			stmt.execute();
			stmt.close();
		}catch (Exception e) {
			e.printStackTrace();
            throw new RuntimeException();
        }

	}

}
