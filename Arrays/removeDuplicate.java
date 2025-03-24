import java.util.*;

class removeDuplicate{
    static int remove(int arr[],int n){
        if(n<=1){
            return n;
        }
        int idx=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
               arr[idx++]=arr[i];
            }
        }
        return idx;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int size=remove(arr,n);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
