package Pzad4;

import java.io.*;

import java.util.Date;
import java.util.Scanner;

public class TimeFileLogger implements ILogger {
    private Date date = new Date();

    @Override
    public void write(String dat) {
        System.out.println("File name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine() + ".txt";


        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(name)))) {
            dataOutputStream.writeUTF(dat + " " + date.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//    Самостоятельно изучить паттерн Стратегия. Реализовать Logger.
//        1. Интерфейс ILogger с мотодом write()
//        2. Реализовать три стратегии:
//        ConsoleLogger - выводит сообщения в консоль
//        FileLogger - записывает сообщение в файл
//        TimeFileLogger - записывает сообщение в файл + текущее время
//        3. Реализовать классы, исползующие эти стратегии.
//        Запись в файл должна работать!