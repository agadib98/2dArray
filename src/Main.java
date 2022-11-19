import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter six number");
        Scanner s = new Scanner(System.in);
        int[] array = new int[6];
        double sum = 0;
        int count = 0;
        for (int i = 0; i < 6; i++) {
            array[i] = s.nextInt();
            sum = sum + array[i];
        }
        double avg = sum/6;
        for(int i= 0;i<6;i++){
            if(array[i]>avg)
                count++;
        }
        double percentage = (double)count*100/6;


        System.out.println("the sum is " + sum);
        System.out.println("the agerage is " + avg);
        System.out.println("the percentage is "+percentage+"%");
    }
}