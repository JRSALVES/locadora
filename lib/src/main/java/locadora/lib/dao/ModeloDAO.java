package locadora.lib.dao;

import bancolib.BasicCrudDAO;
import bancolib.entity.Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import locadora.lib.ConexaoBanco;

public class ModeloDAO implements BasicCrudDAO<Modelo> {

    @Override
    public Modelo select(int id) throws SQLException {
        String query = String.format("""
                       SELECT
                       	*
                       FROM
                       	modelo m
                       WHERE 
                        id = %d
                       """, id);

        try (Statement stmt = ConexaoBanco.getConexao().createStatement(); ResultSet rs = stmt.executeQuery(query);) {
            if (rs.next()) {
                Modelo modelo = new Modelo();
                modelo.id = rs.getInt("id");
                modelo.nome = rs.getString("nome");
                modelo.id_fabricante = rs.getInt("id_fabricante");

                return modelo;
            }

            return null;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<Modelo> select() throws SQLException {
        String query = """
                       SELECT
                       	*
                       FROM
                       	modelo m
                       """;

        try (Statement stmt = ConexaoBanco.getConexao().createStatement(); ResultSet rs = stmt.executeQuery(query);) {
            List<Modelo> lista = new ArrayList<>();

            while (rs.next()) {
                Modelo modelo = new Modelo();
                modelo.id = rs.getInt("id");
                modelo.nome = rs.getString("nome");
                modelo.id_fabricante = rs.getInt("id_fabricante");

                lista.add(modelo);
            }

            return lista;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public int insert(Modelo entity) throws SQLException {

        String insertSQL = String.format("""
                           INSERT INTO 
                            fabricante 
                             (nome, id_fabricante) 
                           VALUES 
                             ('%s', %d)
                           """, entity.nome, entity.id_fabricante);

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
    public int update(int id, Modelo entidadeAtualizada) throws SQLException {
        String updateSQL = String.format("""
                           UPDATE modelo 
                             SET 
                                nome='%s',
                                id_fabricante=%d
                           WHERE
                            id = %d;
                           """, entidadeAtualizada.nome, entidadeAtualizada.id_fabricante, id);

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
                            modelo 
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
