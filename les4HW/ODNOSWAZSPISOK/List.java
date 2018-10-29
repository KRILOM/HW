public class List {
    private Node head;
    private Node tail;
    public void add(int i) {
        Node k = new Node();//создается новый узел
        k.i = i;
        if (tail == null) {
            head = k;//добавляем единицу
            tail = k;
        } else {
            tail.next = k;//добавляем двуйку и создается новый узыел
            tail = k;
        }
    }
    public void remove(int i) {
        if (head == null)
            return;
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        if (head.i == i) {
            head = head.next;
            return;
        }
        Node j = head;
        while (j.next != null) {
            if (j.next.i == i) {
                if (tail == j.next) {
                    tail = j;
                }
                j.next = j.next.next;
                return;
            }
            j = j.next;
        }
    }
    public void show() {
        Node j = head;
        while (j != null) {
            System.out.print(j.i + " ");
            j = j.next;
        }
    }
}