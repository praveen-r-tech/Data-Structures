import java.util.*;

class toLower{
    
    static String toLower(String str){
       StringBuilder sb= new StringBuilder();
       for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32));  
            } else {
                sb.append(ch);  
            }
        }
        return sb.toString();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        str=toLower(str);
        System.out.print(str);
    }
}
