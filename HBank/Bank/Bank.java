package Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accountList = new ArrayList<>();
    private List<Thread> threadList = new ArrayList<>();


    public void transferCash(Account src, Account dst,double cash){
        Transaction transaction = new Transaction(src,dst,cash);
        Thread thread = new Thread(transaction);
        thread.start();
        threadList.add(thread);
    }

    public void createAcc(Account account){
        accountList.add(account);
    }

    public List<Thread> getThreadList() {
        return threadList;
    }
}
