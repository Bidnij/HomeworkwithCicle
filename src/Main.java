import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //sequenceTree();
        //sequenceTree2();
        //dotPlus();
        //rating();
        atb();

    }


    public static void sequenceTree() {
        int number = 3;
        int count = 12;


        for (int i = 0; i < count; i++) {
            System.out.println(number);
            number = number + 6;
        }
    }


    public static void sequenceTree2() {
        int number = 3;
        int count = 12;
        int j = 0;

        do {
            System.out.println("Число " + number);
            number = number + 6;
            j++;
        } while (j < count);

    }

    public static void dotPlus() {
        String str = "*";

        for (int i = 0; i < 4; i++) {
            System.out.println(str);
            str = str + "*";
        }
    }

    public static void rating() {
        Scanner s = new Scanner(System.in);
        int reat = s.nextInt();
        s.close();

        if (reat >= 25 && reat <= 100) {
            if (reat < 25) {
                System.out.println("F");
            }
            if (reat >= 25 && reat < 45) {
                System.out.println("E");
            }
            if (reat >= 45 && reat < 50) {
                System.out.println("D");
            }
            if (reat >= 50 && reat < 60) {
                System.out.println("C");
            }
            if (reat >= 60 && reat < 80) {
                System.out.println("B");
            }
            if (reat >= 80) {
                System.out.println("A");
            }
        } else
            System.out.println("Это не оценка");
    }

    public static void atb() {
        Scanner s = new Scanner(System.in);
        int number =s.nextInt();
        s.close();

        switch (number) {
            case (200):
                System.out.println("Счастливчик");
                break;

            case (202):
                System.out.println("Не хватает " + (number - 200));
                break;

            case (100):
                System.out.println("Пойду возьму еще что нибудь");
                break;

            default:
                System.out.println("Что то пошло не так");
        }
    }
}
