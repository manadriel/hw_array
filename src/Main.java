import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }

    public static void task1() { //add diff array with sout
        System.out.println("Задача 1, 2, 3");
        System.out.println("Задача 1.1");
        int[] a = new int [3];
        a [0] = 1;
        a [1] = 2;
        a [2] = 3;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = a.length - 1; i >=0;  i--) {
            System.out.print(a[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 1.2");
        double[] b = {1.57, 7.654, 9.986};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i != b.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = b.length - 1; i >=0;  i--) {
            System.out.print(b[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 1.3");
        double[] c = {2.12, 42.69, 0.25, 3.22};
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i != c.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = c.length - 1; i >=0;  i--) {
            System.out.print(c[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }
    public static void task2() { //from 1 to 10 with for, from 10 to 1 while
        System.out.println("Задача 3");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 != 0) {
            arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}