package Bank;
//        Создать следующие классы:
//        Класс Пользователь (поля: ID и Email)
//        Класс Аккаунт (поля: ID, ID пользователя, количество средств)
//        ID должны быть уникальны и ID аккаунтов тоже
//        Класс Банк (Список всех аккаунтов, метод перевода денег)
//        transferMoney(Account src, Account dst, in amount) - откуда, куда, сколько. Аккаунт отправителя и получателя не должен совпадать.
//        Если средств недостаточно, перевод не будет выполнен.
//        Потокобезопасная проверка состояния счета (для отправки)
//        Класс Транзакций (Transaction) - поля: отправитель, получатель, количество денег, дата и время.

public class Main {
    public static void main(String[] args) {
        User user1 = new User("asd@da.io");
        User user2 = new User("dsb@dq.ku");
        Bank bank = new Bank();

        Account a11 = new Account(user1, 3000);
        Account a12 = new Account(user1, 8000);
        Account a13 = new Account(user1, 15000);
        Account a21 = new Account(user2, 0);
        Account a22 = new Account(user2, 10000);
        Account a23 = new Account(user2, 13500);

        bank.transferCash(a11, a21, 13.5);
        bank.transferCash(a22, a13, 5000.00);
        bank.transferCash(a23, a12, 350.12);

        for(Thread traAct: bank.getThreadList()){
            try{
                traAct.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(a11);
        System.out.println(a12);
        System.out.println(a13);
        System.out.println(a21);
        System.out.println(a22);
        System.out.println(a23);
    }
}
