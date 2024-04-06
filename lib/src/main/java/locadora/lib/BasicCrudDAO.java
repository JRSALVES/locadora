package bancolib;

import java.sql.SQLException;
import java.util.List;

public interface BasicCrudDAO<ENTIDADE> {

    public <ENTIDADE> ENTIDADE select(int id) throws SQLException;

    public <ENTIDADE> List<ENTIDADE> select() throws SQLException;

    public int insert(ENTIDADE entity) throws SQLException;

    public int update(int id, ENTIDADE entity) throws SQLException;

    public int delete(int id) throws SQLException;
}
