import org.sqlite.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDao implements IDao{

private static final String CON_STR = "jdbc:sqlite:dao.db";

private static UserDao instanse = null;

public static synchronized UserDao getInstance() throws SQLException {
    if(instanse == null)
        instanse = new UserDao();
    return instanse;
}
private Connection connection;

private UserDao() throws SQLException {
    DriverManager.registerDriver( new JDBC());
    this.connection = DriverManager.getConnection(CON_STR);
}
public List<User> getAll() {
    try(Statement statement = this.connection.createStatement()){
        List<User> users = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("SELECT id, login;");
        while (resultSet.next()){
            users.add(new User(resultSet.getInt("id"), resultSet.getString("login")));
        }
    return users;
    } catch (SQLException e) {
        e.printStackTrace();
        return Collections.emptyList();
    }
}
public void add(User user){
    try(PreparedStatement statement = this.connection.prepareStatement("INSERT INTO User('id','login')" + "VALUES(?,?)")){
    statement.setObject(1, user.id);
    statement.setObject(2, user.login);
    statement.execute();//выполняем запрос
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void delete(int id){
    try(PreparedStatement statement = this.connection.prepareStatement("DELETE FROM User WHERE id = ?")){
        statement.setObject(1,id);
        statement.execute();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void getById(int id) /*throws SQLException*/ {
//String sql = "SELECT * FROM User;";
//try(Connection connection = DriverManager.getConnection("jdbc:sqlite:dao.db")){
//    PreparedStatement statement = connection.prepareStatement(sql);
//    statement.setInt(1, id);
//    ResultSet resultSet = statement.executeQuery();
}

public void update(){

}

}
