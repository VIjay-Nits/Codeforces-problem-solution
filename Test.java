import java.util.*;
public class Test {
      
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int i;
        for(i=0;i<n;i++){
            if(a[i]>k)break;
            count++;
            
        }
        for(int j=n-1;j>=i;j--){
            if(a[j]>k)break;
            count++;
        }
         System.out.println(count);
        
        
    }
        
}
