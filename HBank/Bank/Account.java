package Bank;

public class Account {
    private int userid;
    private User user;
    private double cash;
    private static int countid = 0;

    public Account(User user, double cash) {
        this.user = user;
        this.cash = cash;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userid=" + userid +
                ", user=" + user +
                ", cash=" + cash +
                '}';
    }
}
