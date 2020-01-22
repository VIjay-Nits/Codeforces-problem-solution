 import java.util.Scanner;
import java.util.*;
public class Solution {

  public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        new MergeSort().mergeSort(a, 1, n);
        int flag=0;
        int count=1;
        for(int i=0;i<n;){
            if(a[i]<count){i++;}
            else {flag++;i++;count++;}
        }
        System.out.println(flag);
            //System.out.println(a[0]+""+a[1]+""+a[2]);
        
  

  }
    
}
class MergeSort{
	public void mergeSort(int[] arr,int l,int r){
		// arr= 1,4,5,6,2,8,7; here l=1 and r=7;
		if(l<r){
			int mid=(l+r)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merging(arr,l,mid,mid+1,r);

		
		}
		else return;

	}
	private void merging(int []arr,int l1,int r1,int l2,int r2){
		int len1=r1-l1+1;	//left sub array size
		int len2=r2-l2+1;	//right array size
		int []al=new int[len1];
		int []ar=new int[len2];
		int i=0,j=0,k=l1-1;
                for(int l=0;l<len1;l++)al[l]=arr[l1-1+l]; //copying element in sub array
                for(int l=0;l<len2;l++)ar[l]=arr[l2-1+l];
		while(len1>i&&len2>j){
			if(al[i]<=ar[j])arr[k++]=al[i++];
			else arr[k++]=ar[j++];
		}

		
		while(len1>i)arr[k++]=al[i++];
			
		while(len2>j)arr[k++]=ar[j++];

                
                
        }
}
  
