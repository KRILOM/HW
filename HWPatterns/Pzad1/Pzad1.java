package Pzad1;
import java.io.*;
public class Pzad1 {
    public static void main(String[] args) {
        String pass = "qwerty";

        String f = "file.txt";
        String f1 = "file2.txt";
        String f2 = "file3.txt";
        try (
                InputStream inputStream = new InputST(pass.getBytes(), new FileInputStream(f));
                OutputStream outputStream = new OutputST(new FileOutputStream(f1), pass.getBytes())
        ) {
            byte[] buffer = new byte[inputStream.available()];
            while ((inputStream.read(buffer)) > 0) {
                outputStream.write(buffer);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(
                InputStream inputStream = new InputST(pass.getBytes(), new FileInputStream(f1));
                OutputStream outputStream = new OutputST(new FileOutputStream(f2), pass.getBytes())
                ){
            byte[] buffer = new byte[1];
            while ((inputStream.read(buffer)) > 0 ){
                outputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
//Задачи по паттернам
//        1. Используя паттерн Decorator создать шифрующие потоки ввода/вывода с помощью XOR (можете выбрать другой способ). Они должны наследовать FilterInputStream и FilterOutputStream.
//        Конструктор этих потоков должен принимать пароль в виде массива байт и поток, который он декорирует.
//
//        Использование должно выглядеть следующим образом:
//        Трафик автоматически шифрует и дешифруется:
//        InputStream in = new CryptoInputStream(socket.getInputStream(), password);
//        OutputStream out = new CryptoOutputStream(socket.getOutputStream(), password);
//
//        Сохраняем в шифрованный файл и читаем из шифрованного файла:
//        InputStream in = new CryptoInputStream(new FileInputStream("test.bin"), password);
//        OutputStream out = new CryptoOutputStream(new FileOutputStream("test.bin"), password);
//
//        Для простоты можете начать имплементацию, где пароль - один байт.

//        2. Реализовать сигнализации, реагирующие на повышение температуры (паттерн observer).
//        Класс Sensor инкрементально повышает температуру, и на каждое изменение температуры оповещает слушателей (сигнализации). Их должно быть три, соответствующие уровням тревоги: Green (100), Yellow (300), Red (600).
//
//        Описываете интерфейс Alarm, имеющий метод void tempChanged(int temp), и подписываете три реализации к датчику на оповещения.
//
//        Сигнализации сработают по преодолению определенного порога температуры:
//        100 градусов - Green
//        300 градусов - Green, Yellow
//        600 градусов - Green, Yellow, Red
//
//        Срабатывание - вывод в консоль сообщения. Если сигнализация сработала, то сообщение не повторяется на дальнейшее повышение температуры, но если опустится ниже порога, а потом опять преодолеет, то выведется снова.
//
//        3. Доделать TextProcessor (паттерн Command), как обсуждали на занятии