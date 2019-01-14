import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{




            UserDao userDao = UserDao.getInstance();
            userDao.add(new User(1, "l)lkekcheburek"));
            userDao.add(new User(2, "l2lkekcheburek"));
            userDao.add(new User(3, "lol45ekcheburek"));
            userDao.add(new User(4, "lolk6314kcheburek"));
            userDao.add(new User(5, "lolkekch13burek"));
            userDao.add(new User(6, "lolkekc52eburek"));
            userDao.add(new User(7, "lolkekche5123urek"));
            userDao.add(new User(8, "lolkekchebusfdgek"));
            userDao.add(new User(9, "lolkekcheburqwe1k"));
            userDao.add(new User(10, "lolkekcheburekad123"));
            List<User> userList = userDao.getAll();
            for(User user: userList){
                System.out.println(user.toString());
            }
            userDao.delete(5);
            userDao.delete(9);
            userDao.delete(3);
            userDao.delete(7);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
