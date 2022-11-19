import java.util.Scanner;
public class tsk4cpy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter numbers: ");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }


        int element = arr[0];
        int count = 1;
        System.out.print("Output: ");
        for (int i = 1; i < n; i++){
            if (element == arr[i]){
                count++;
            } else {
                count = 1;
            }

            if (count == 3){
                System.out.print(arr[i] + " ");
            }

            element = arr[i];
        }

    }
}
