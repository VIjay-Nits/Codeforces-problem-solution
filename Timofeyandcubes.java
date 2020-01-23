import java.util.Scanner;
import java.util.*;
public class Solution {

  public static void main(String[] args) {
      
         
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = in.nextInt();
		}
		for(int i = 0;i<n/2;i+=2){
			int t = a[i];
			a[i]=a[n-i-1];
			a[n-i-1] = t;
		}
		System.out.print(a[0]);
		for(int i = 1;i<n;i++){
			System.out.print(" "+a[i]);
		}
	}
}
 
