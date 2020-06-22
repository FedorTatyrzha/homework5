package HomeWork;

public class Lesson1 {
    public static void main(String[] args) {
        int n = 9;
        if (n>0)
            {System.out.println("число положительное");}
        else if (n<0)
        {System.out.println("число отрицательное");}
        if ((n % 10) == n) {
            System.out.println("1 цифра");
        } else if ((n % 100) == n) {
            System.out.println("2 цифры");
        } else if ((n % 1000) == n) {
            System.out.println("3 цифры");
        }
        else if (n>0){
            System.out.println("число положительное");

    }
}}