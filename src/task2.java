import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner s = new Scanner(System.in);

       int j = s.nextInt();
        int[] array = new int[j];
        int sum = 0;
        int count = 0;
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < j; i++) {

            array[i] = array[i-1]+array[i-2];

        }
        for(int i = 0;i<j;i++)
            System.out.print(" "+array[i]);
    }
}
