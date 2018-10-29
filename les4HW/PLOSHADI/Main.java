public class Main {
    public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setR(2);
    circle.cirDlin(circle);
    circle.showDlina();

    Rectangle rectangle = new Rectangle();
    rectangle.setX1(1);
    rectangle.setY1(0);
    rectangle.setX2(2);
    rectangle.setY2(3);
    rectangle.setX3(1);
    rectangle.setY3(3);
    rectangle.setX4(4);
    rectangle.setY4(0);
    rectangle.rectangleParam(rectangle);
    rectangle.showRszParam();

    Triangel triangel = new Triangel();
    triangel.setX1(0);
    triangel.setY1(0);
    triangel.setX2(2);
    triangel.setY2(0);
    triangel.setX3(3);
    triangel.setY3(1);
    triangel.tringParam(triangel);
    triangel.showParam();

    }
}
