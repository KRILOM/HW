import java.sql.SQLException;
import java.util.List;

public interface IDao {
    void add(User user);
    List<User> getAll();
    void getById(int id) throws SQLException;
    void update();
    void delete(int id);
}
