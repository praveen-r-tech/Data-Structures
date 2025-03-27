import java.util.*;

class charSearch{
    static int search(String s,char c){
       int i=s.indexOf(c);
       return (i!=-1)? i : -1;
    }
   public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        char ch= sc.next().charAt(0);
        int index= search(str,ch);
        System.out.print(index);
    }
}
