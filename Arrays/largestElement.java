import java.util.*;

class largestElement{
    static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
       
        /*Another way
        Arrays.sort(arr);
        return arr[arr.length - 1];
        */
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }    
        System.out.print(largest(arr));
    }
}
