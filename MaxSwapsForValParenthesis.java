import java.util.*;
public class MaxSwapsForValParenthesis{
    public static int count(String str){
        Stack<Character> s = new Stack<>();
        char open = '{';
        char close = '}';
        int count = 0;
        for(int i = 0; i < str.length(); i++){ // O(N)
            char currChar = str.charAt(i);
            if (currChar == open){
                s.push(currChar);
            }
            if(currChar ==close ){
                if(s.isEmpty()){
                    count++;
                    s.push(currChar);
                }else{
                    char top = s.peek();
                    if(top != open){
                        count++;
                        s.push(currChar);
                    }else{
                        s.pop();
                    }

                }
                
                
            } 

        }
        return count;
    }
    public static void main(String[] args){
        // String str = "}{{}";
        String str = "{}{}";
        // String str = "{{{}}}";
        // String str = "}}}{}}{{{{";
        System.out.println("No of swaps needed are:"+count(str));

    }
}