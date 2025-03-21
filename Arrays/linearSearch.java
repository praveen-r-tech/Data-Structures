import java.util.*;

class linearSearch{
    public static int search(int arr[],int x)
    {
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int result = search(arr,x);
        System.out.println((result== -1) ? "Element is not present in array" : "Element is present at index " + result);
    }
}
