package Ships;

import java.util.concurrent.BlockingQueue;

public class Ships extends Thread {
    private Ship ship;
    private BlockingQueue blockingQueue;

    Ships(Ship ship, BlockingQueue blockingQueue){
        this.ship = ship;
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try{
            blockingQueue.put(ship);
            System.out.println("Ship in port");
            if(ship.unload){
                System.out.println("Ship Unloading");
            }
            Thread.sleep(1000);
            if(ship.load){
                System.out.println("Ship Load");
            }
            Thread.sleep(1000);
            blockingQueue.take();
            System.out.println("Ship go out");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
