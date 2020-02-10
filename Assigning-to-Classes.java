
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution{
    public static void
         main(String [] args)throws IOException{
             
        Scanner dede=new Scanner(System.in);
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int t=dede.nextInt();
          while(t-->0){
              int n=dede.nextInt();
              int []a=new int[2*n];
              for(int i=0;i<2*n;a[i++]=dede.nextInt()){}
              
              new MySort().mergeSort(a, 0, 2*n-1);
              System.out.println(a[n]-a[n-1]);
              
              
              
          }
         
         }
          
         
         
         
         
         
         
         




    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    }
    
    
    


    
}


class MySort {
    public void selectionSort(int[]a,int left,int right){
        //left index from 0 and right= last index
        for(int i=left;i<=right;i++){
            int min_index=i;
            for(int j=i+1;j<=right;j++){
                if(a[min_index]>a[j])min_index=j;
            }
            int temp=a[min_index];
            a[min_index]=a[i];
            a[i]=temp;
        }
    }
    
    public void bubbleSort(int a[],int  left,int right){
        //left index from 0 and right= last index
        
        for(int i=left;i<=right;i++){
            for(int j=left;j<right;j++){
                if(a[j+1]<a[j]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    
    
    public void insertionSort(int a[],int left,int right){
        //left index from 0 and right= last index
        for(int i=left+1;i<=right;i++){
            int temp=a[i];
            int j=i-1;
            for(;j>=0&&temp<a[j];j--){
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
    }
    
    public void quickSort(int a[],int left,int right){
        //left index from 0 and right= last index
        if(left<right){
            int pi_index=partition(a,left,right);
            
            quickSort(a,pi_index+1,right);//for left side of pivot
            quickSort(a,left,pi_index-1);//for right side of pivot
            
        }
        
    }
    private int partition(int a[],int left,int right){
            //last element is used as pivot
            int pivot=a[right];
            int i=left-1;
            for(int j=left;j<right;j++){
                if(pivot>a[j]){
                    i++;
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            int temp=a[i+1];
            a[i+1]=a[right];
            a[right]=temp;
            return i+1;
    }
    
    
    public void mergeSort(int []a,int left,int right){
        if(left<right){
            int m=(left+right)/2;
            mergeSort(a, left, m);
            mergeSort(a, m+1, right);
            merging(a,left,m,right);
            
        }
        
        
    }
    private void merging(int[]a,int left,int m,int right){
        int n1=m-left+1;
        int n2=right-(m+1)+1;
        int []L=new int[n1];
        int []R=new int[n2];
        
        for(int i=0;i<n1;i++){L[i]=a[left+i];}
        for(int i=0;i<n2;i++){R[i]=a[m+1+i];}
        
        int i=0;int j=0;
        int k=left;
        while(i<n1&&j<n2){
            if(L[i]<=R[j]){
                a[k]=L[i];
                i++;
            }
            else {
                a[k]=R[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=R[j];
            j++;
            k++;
        }
    }
    
}

                
