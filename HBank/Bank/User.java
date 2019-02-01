package Bank;

public class User {
    private int id;
    private String email;
    private static int countid = 0;

    public User(String email) {
        this.id = ++countid;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Main{" +
                "Id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
