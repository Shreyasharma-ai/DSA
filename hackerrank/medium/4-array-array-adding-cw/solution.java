import java.util.*;

public class Main {
  static int[] calSum(int a[], int b[], int n, int m) {
    // your code here
    int size=Math.max(m,n);
    int[] ans=new int[size+1];
    int i=n-1;
    int j=m-1;
    int k=size;
    int carry=0;
    
    while(i>=0 || j>=0 || carry>0) {
        int sum=carry;
        if(i>=0) sum+=a[i--];
        if(j>=0) sum+=b[j--];
        ans[k--]=sum%10;
        carry=sum/10;
    }
    if(ans[0]!=0) return ans;
    return Arrays.copyOfRange(ans,1,size+1);
    
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);
  }
}
