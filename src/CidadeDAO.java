import java.sql.Connection;
import java.sql.PreparedStatement;

public class CidadeDAO extends ConnectionFactory{

	public void novaCidade(Cidade cidade){

		try{

			Connection connection = getConnection();

			PreparedStatement stmt = connection.prepareStatement("insert cidade(nomeCidade, areaCidade, populacaoCidade, estado_idEstado) values(?, ?, ?, ?)");
			stmt.setString(1, cidade.getNome());
			stmt.setInt(2, cidade.getPopoulacao());
			stmt.setInt(3, cidade.getArea());
			stmt.setInt(4, cidade.getIdEstado());

			stmt.execute();
			stmt.close();
		}catch (Exception e) {
			e.printStackTrace();
            throw new RuntimeException();
        }

	}

}
