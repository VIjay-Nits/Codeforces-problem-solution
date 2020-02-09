import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution{
    public static void main(String[]args) throws java.io.IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        int one=0,zero=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1')one++;
            else zero++;
            
        }
        System.out.println(Math.abs(one-zero));
        br.close();
    }
         
         
         
         
}
