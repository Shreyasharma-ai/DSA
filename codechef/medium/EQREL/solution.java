import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] array=new int[n];
		for(int i=0;i<n;i++){
		    array[i]=sc.nextInt();
		}
		int min=array[0];
		for(int i=0;i<n;i++) if(array[i]<min) min=array[i];
		
		long sum=0;
		for(int i=0;i<n;i++){
		    sum+=array[i]-min;
		}
		System.out.println(sum);
	}
}
