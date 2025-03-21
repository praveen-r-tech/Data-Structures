import java.util.*;

public class arrayAlternate{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Forward alternate:");
        for(int j=0;j<arr.length;j+=2){
            System.out.print(arr[j]+" ");
        }
        //System.out.println();
        /*USING WHILE
        int num=0;
        while(num<arr.length){
            System.out.print(arr[num]+" ");
            num+=2;
        }*/
    }    
}
