import java.util.*;

class checkSort{
    static boolean check(int arr[],int n){
        if(n==0 || n==1){
            return true;
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i])
                return false;
        }
        return true;
    }
    
    /*Recursive_Method
     static boolean check(int arr[],int n){
        if(n==0||n==1){
            return true;
        }
        return arr[n-2]<=arr[n-1] && check(arr,n-1);
    }*/
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean result=check(arr,n);
        System.out.print(result);
    }
}
