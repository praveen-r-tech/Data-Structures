import java.util.*;

class strLen{
    static int strLength(String s){
        int count=0;
        for(char ch: s.toCharArray()){
            count++;
        }
        //count=str.length();
        return count;
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int val = strLength(str);
        System.out.print(val);
    }
}
