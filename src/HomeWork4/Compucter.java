package HomeWork4;

import java.util.Scanner;

public class Compucter {


    String processor;
    String ram;
    String drive;
    int resource;
    int count = 0;
    Scanner sc = new Scanner(System.in);
    public boolean fire = false;

     void Сompucter() {
        System.out.print("Введите процессор : ");
        this.processor = sc.nextLine();
        System.out.print("Введите опративную память : ");
        this.ram = sc.nextLine();
        System.out.print("Введите жесткий диск : ");
        this.drive = sc.nextLine();
        System.out.println("Введите ресурс полных циклов : ");
        this.resource = sc.nextInt();
    }

    void printCompInformation() {
        System.out.println("Процессор " + processor);
        System.out.println("Оперативная память " + ram);
        System.out.println("Жесткий диск " + drive);
        System.out.println("Ресурс полных циклов " + resource);
    }

    void turnOff() {
        int i = (int) (Math.random() * 2);
        System.out.print("Я хочу выключиться.Введите номер : ");
        int yrNumber = sc.nextInt();
        if (yrNumber <= 1) {
            if (yrNumber == i) {
                count++;
                System.out.println("Я выключен.");
                if (count == resource) {
                    System.out.print("Ресурс закончился. ");
                    count = 0;
                    fire = true;
                }
            } else {
                fire = true;
            }
        } else {
            System.out.println("Мне надо 1 или 0.");
            turnOff();
        }
    }

    void turnOn() {
        int i = (int) (Math.random() * 2);
        System.out.print("Я хочу включить.Введите ноомер : ");
        int yrNumber = sc.nextInt();
        if (yrNumber <= 1) {
            if (yrNumber == i) {
                System.out.println("Компьютер включен.");
            } else {
                fire = true;
            }
        } else {
            System.out.println("Мне надо 1 или 0.");
            turnOn();
        }
    }

    void fire() {
        System.out.println("Комьютер сгорел.Попробуйте еще");
        fire = false;
    }

    void metod() {
        while (true) {
            if (fire == false) {
                turnOn();
            }
            if (fire == false) {
                turnOff();
            }
            if (fire) {
                fire();
            }
        }
    }
}

