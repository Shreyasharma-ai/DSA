import java.io.*;
import java.util.*;


public class Main {
    public static void SecondLargest(int[] arr, int n) {
        // Write code here
        int largest=arr[0];
        int SecondLargest=Integer.MIN_VALUE;
         
         for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                SecondLargest = largest;
                largest=arr[i];
            }
            else if(arr[i]>SecondLargest && arr[i]<largest){
                SecondLargest=arr[i];
                
            }
         
         }
        System.out.println(SecondLargest);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        SecondLargest(arr,n);
        sc.close();
        
    }
}
