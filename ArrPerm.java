import java.util.ArrayList;

public class ArrPerm {
    public static void findPerm(String str, String result){
        if(str.length() == 0){
            System.out.println(result);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            int curr = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            findPerm(newStr, result+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPerm(str, "");
    }
}
