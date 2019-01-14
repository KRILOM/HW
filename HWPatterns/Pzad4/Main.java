package Pzad4;

public class Main {
    public static void main(String[] args) {
        Visitors visitors = new Visitors();

        visitors.setiLogger(new ConsoleLogger());
        visitors.write("CL");

        visitors.setiLogger(new FileLogger());
        visitors.write("FL");

        visitors.setiLogger(new TimeFileLogger());
        visitors.write("TFL");
    }
}
