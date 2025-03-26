import java.util.*;

class strSame{
    static boolean stringSame(String s1, String s2){
        return s1.equals(s2);
        /*
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
            return true;
        }
        */
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(stringSame(s1,s2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
