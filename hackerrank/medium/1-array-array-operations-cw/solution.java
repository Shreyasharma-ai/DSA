import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();

        ArrayOperations(arr, n);
    }

    public static void ArrayOperations(int[] arr, int n) {
        // Write your code here
        int sum=0;
        for(int x:arr) sum+=x;
            int average=sum/n;
            int max=arr[0];
            for(int x:arr){
                if(x>max)max=x;
            }
            System.out.println(sum+" "+average+" "+max);
        }
    }
