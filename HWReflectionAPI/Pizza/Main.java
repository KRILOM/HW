package Pizza;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Сделать пиццерию на очередях: клиенты складывают заказы в очередь 1, официанты из нее заказы забирают и добавляют в очередь 2,
//из которой повар заказ забирает и готовит, после чего он готовые блюда складывает в очередь 3, из который клиенты будут забирать заказы.
//Сами же клиенты блокируются на очереди 3, официанты на очереди 1, а повара - на очереди 2.
public class Main {

    public static void main(String[] args) {
        new Pizza();
    }
}
