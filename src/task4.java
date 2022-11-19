import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int  size,n;
        System.out.println("enter size");

        size= s.nextInt();
        System.out.println("enter numbers");
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {

            array[i]= s.nextInt();



        }

        System.out.println(Arrays.toString(array));
        System.out.print("output ");
        for(int i=0;i<size-2;i++){
            if(array[i] == array[i+1])
                if(array[i+1] == array[i+2])
                    System.out.print(" "+array[i]);
        }
    }
}
