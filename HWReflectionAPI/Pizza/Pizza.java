package Pizza;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Pizza {

    BlockingQueue<Order> blockingQueue1 = new ArrayBlockingQueue<>(10, true );
    BlockingQueue<Order> blockingQueue2 = new ArrayBlockingQueue<>(10,true);
    BlockingQueue<Order> blockingQueue3 = new ArrayBlockingQueue<>(10,true);

    public Pizza() {
    for(int i = 1; i <= 5; i++){
        new Thread(new Client()).start();
    }
    new Thread(new Waiter()).start();
    new Thread(new Waiter()).start();
    }

class Client implements Runnable {
    @Override
    public void run() {
        try {
            blockingQueue1.put(new Order("pizza1", Thread.currentThread().getName()));
            System.out.println("Client ++");
            Thread.sleep(10000);

            boolean reverse = true;

            while (reverse) {
                while (!blockingQueue3.isEmpty()) {
                    Order order;
                        if ((order = blockingQueue3.take()).getClientId().equals(Thread.currentThread().getName())) {
                            System.out.println("Client" + Thread.currentThread().getName() + " takes");
                            reverse = false;
                        } else {
                            blockingQueue3.put(order);
                            Thread.sleep(1000);
                        }
                    }
                }
            } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    class Waiter implements Runnable{
        @Override
        public void run() {
            try{
                if(blockingQueue1.isEmpty()){
                    Thread.sleep(1000);
                }
                while (!blockingQueue1.isEmpty()){
                    Order order;
                    order = blockingQueue1.take();
                    System.out.println("waiter take order " + order.getClientId());
                    blockingQueue2.put(order);
                    System.out.println("client order" + order.getClientId() + " get to the Cook");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
    class Cook implements Runnable{
        @Override
        public void run() {
            try{
                if(blockingQueue2.isEmpty()){
                    Thread.sleep(1000);
                }
                while (!blockingQueue2.isEmpty()){
                    Order order;
                    order = blockingQueue2.take();
                    System.out.println("Cook coocked the food " + order.getClientId());
                    Thread.sleep(2000);
                    blockingQueue3.put(order);
                    System.out.println("Client order " + order.getClientId() + " ready");

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}