package Ships;
//        Порт. Корабли заходят в порт для разгрузки/загрузки.
//        Работает несколько причалов.
//        У одного причала может стоять один корабль.
//        Корабль может загружаться у причала, разгружаться или выполнять оба действия.

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Ship> blockingQueue1 = new ArrayBlockingQueue<>(1,true);
        BlockingQueue<Ship> blockingQueue2 = new ArrayBlockingQueue<>(1,true);
        BlockingQueue<Ship> blockingQueue3 = new ArrayBlockingQueue<>(1,true);
        BlockingQueue<Ship> blockingQueue4 = new ArrayBlockingQueue<>(1,true);
        Ship ship1 = new Ship(true, false);
        Ship ship2 = new Ship(true, false);
        Ships ships1 = new Ships(ship1,blockingQueue1);
        Ships ships2 = new Ships(ship2,blockingQueue1);
        ships1.start();
        ships2.start();
    }
}
