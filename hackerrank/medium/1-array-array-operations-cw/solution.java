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
        int sum=0,max=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(max<arr[i]) max=arr[i];
 
        }
        int ave=sum/n;
        System.out.println(sum+" "+ave+" "+max);
    }
    
}
