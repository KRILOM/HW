package Bank;

import java.util.Date;

public class Transaction implements Runnable{
    private Account src, dst, a1, a2;
    private double cash;
    private Date date;

    public Transaction(Account src, Account dst, double cash) {
        this.src = src;
        this.dst = dst;
        this.cash = cash;
    }

    @Override
    public void run() {
    this.date = new Date();

    if(src.getCash() < cash | src == dst | cash <= 0){
        System.out.println("No cash in your card");
        Thread.currentThread().interrupt();
    }
    else{
        if(src.getUserid() < dst.getUserid()){
            a1 = src;
            a2 = dst;
        }
        else{
            a1 = dst;
            a2 = src;
        }
        synchronized (a1){
            synchronized (a2){
                src.setCash(src.getCash() - cash);
                dst.setCash(dst.getCash() + cash);
                System.out.println("Transartion is done" + date);
            }
        }
    }
    }

}
