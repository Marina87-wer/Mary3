package Lesson2;

public class Main {

    public static void main(String[] args) {
        numFrom10to20();
        isPositiveOrNegative();
        isNegative();
        printWordNTimes("Hello",10);


    }
    public static boolean numFrom10to20() {
        int k;
        int j;
        k = 17;
        j = -5;
        if (k + j >= 10 && k + j <= 20) {
            System.out.println("true");
        } else if (k + j < 10 && k + j > 20) {
            System.out.println("false");

        }
        return false;


                }

    public static void isPositiveOrNegative() {
        int i;
        i = 8;
        if (i >= 0) {
            System.out.println("Positive");

        } else if (i < 0) {
            System.out.println("Negative");

        }
    }

    public static boolean isNegative() {
        int a;
        a = 3;
        if (a > 0) {
            System.out.println("false");
         return true;
        }
        if (a < 0) {
            System.out.println("true");
            return false;
        }
        return false;
    }
    public static void printWordNTimes(String a, int times) {

        for (int i = 0; i < times; i++ ) {
            System.out.println(a);
        }
    }

}
