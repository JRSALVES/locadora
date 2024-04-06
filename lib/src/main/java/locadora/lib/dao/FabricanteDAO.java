package locadora.lib.dao;

import bancolib.BasicCrudDAO;
import bancolib.entity.Fabricante;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import locadora.lib.ConexaoBanco;

public class FabricanteDAO implements BasicCrudDAO<Fabricante> {

    @Override
    public Fabricante select(int id) throws SQLException {
        String query = String.format("""
                       SELECT
                       	*
                       FROM
                       	fabricante f 
                       WHERE 
                        id = %d
                       """, id);

        try (Statement stmt = ConexaoBanco.getConexao().createStatement(); ResultSet rs = stmt.executeQuery(query);) {
            if (rs.next()) {
                Fabricante fabricante = new Fabricante();
                fabricante.id = rs.getInt("id");
                fabricante.nome = rs.getString("nome");

                return fabricante;
            }

            return null;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<Fabricante> select() throws SQLException {
        String query = """
                       SELECT
                       	*
                       FROM
                       	fabricante f
                       """;

        try (Statement stmt = ConexaoBanco.getConexao().createStatement(); ResultSet rs = stmt.executeQuery(query);) {
            List<Fabricante> listaFabricante = new ArrayList<>();

            while (rs.next()) {
                Fabricante fabricante = new Fabricante();
                fabricante.id = rs.getInt("id");
                fabricante.nome = rs.getString("nome");

                listaFabricante.add(fabricante);
            }

            return listaFabricante;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public int insert(Fabricante entity) throws SQLException {

        String insertSQL = String.format("""
                           INSERT INTO 
                            fabricante 
                             (nome) 
                           VALUES 
                             ('%s')
                           """, entity.nome);

        try (Statement stmt = ConexaoBanco.getConexao().createStatement()) {
            return stmt.executeUpdate(insertSQL);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());

            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public int update(int id, Fabricante fabricanteAtualizado) throws SQLException {
        String updateSQL = String.format("""
                           UPDATE fabricante 
                             SET nome='%s'
                           WHERE
                            id = %d;
                           """, fabricanteAtualizado.nome, id);

        try (Statement stmt = ConexaoBanco.getConexao().createStatement()) {
            return stmt.executeUpdate(updateSQL);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());

            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public int delete(int id) throws SQLException {
        String deleteSQL = String.format("""
                           DELETE FROM 
                            fabricante 
                           WHERE
                            id = %d
                           """, id);

        try (Statement stmt = ConexaoBanco.getConexao().createStatement()) {
            return stmt.executeUpdate(deleteSQL);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());

            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

}
