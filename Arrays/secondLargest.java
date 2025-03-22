import java.util.*;

class secondLargest{
    static int get(int[] arr) {
       int lgt=arr[0];
       int seclgt=0;
       for (int i=1; i<arr.length; i++) {
            if(arr[i] > lgt) {
                seclgt = lgt;
                lgt = arr[i];
            }
        }  
        return seclgt;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(get(arr));
    }
}
