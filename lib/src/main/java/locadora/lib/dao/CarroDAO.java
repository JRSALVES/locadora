package locadora.lib.dao;

import bancolib.BasicCrudDAO;
import bancolib.entity.Carro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import locadora.lib.ConexaoBanco;

public class CarroDAO implements BasicCrudDAO<Carro> {

    @Override
    public Carro select(int id) throws SQLException {
        String query = String.format("""
                       SELECT
                       	*
                       FROM
                       	carro c 
                       WHERE 
                        id = %d
                       """, id);

        try (Statement stmt = ConexaoBanco.getConexao().createStatement(); ResultSet rs = stmt.executeQuery(query);) {
            if (rs.next()) {
                Carro carro = new Carro();
                carro.id = rs.getInt("id");
                carro.id_fabricante = rs.getInt("id_fabricante");
                carro.id_modelo = rs.getInt("id_modelo");
                carro.cor = rs.getString("cor");
                carro.disponivel = rs.getBoolean("disponivel");
                carro.placa = rs.getString("placa");
                carro.valorlocacao = rs.getDouble("valorlocacao");

                return carro;
            }

            return null;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<Carro> select() throws SQLException {
        String query = """
                       SELECT
                       	*
                       FROM
                       	carro c
                       """;

        try (Statement stmt = ConexaoBanco.getConexao().createStatement(); ResultSet rs = stmt.executeQuery(query);) {
            List<Carro> lista = new ArrayList<>();

            while (rs.next()) {
                Carro carro = new Carro();
                carro.id = rs.getInt("id");
                carro.id_fabricante = rs.getInt("id_fabricante");
                carro.id_modelo = rs.getInt("id_modelo");
                carro.cor = rs.getString("cor");
                carro.disponivel = rs.getBoolean("disponivel");
                carro.placa = rs.getString("placa");
                carro.valorlocacao = rs.getDouble("valorlocacao");

                lista.add(carro);
            }

            return lista;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public int insert(Carro entity) throws SQLException {
        String insertSQL = String.format(Locale.ENGLISH, """
                           INSERT INTO 
                            fabricante 
                             (
                                id_fabricante,
                                id_modelo,
                                cor,
                                disponivel,
                                placa,
                                valorlocacao,
                             ) 
                           VALUES 
                             (
                                '%d'
                                '%d'
                                '%s'
                                '%b'
                                '%s'
                                '%.2f'
                             )
                           """,
                entity.id_fabricante, entity.id_modelo, entity.cor,
                entity.disponivel, entity.placa, entity.valorlocacao);

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
    public int update(int id, Carro entidadeAtualizada) throws SQLException {
        String updateSQL = String.format(Locale.ENGLISH, """
                           UPDATE fabricante 
                             SET
                                id_fabricante='%d',
                                id_modelo='%d',
                                cor='%s',
                                disponivel='%b',
                                placa='%s',
                                valorlocacao='%.2f'
                           WHERE
                            id = %d;
                           """,
                entidadeAtualizada.id_fabricante, entidadeAtualizada.id_modelo, entidadeAtualizada.cor,
                entidadeAtualizada.disponivel, entidadeAtualizada.placa, entidadeAtualizada.valorlocacao);

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
                            carro 
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
