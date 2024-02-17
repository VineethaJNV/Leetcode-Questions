import java.util.HashMap;

public class FindWordsThatCanBeFormedByChars {
    /*You are given an array of strings words and a string chars.
A string is good if it can be formed by characters from chars (each character can only be used once).
Return the sum of lengths of all good strings in words. */
public static boolean isGoodString(HashMap<Character, Integer>stringMap, HashMap<Character, Integer>charsMap){
    for(Character ch:stringMap.keySet()){
        System.out.println("----------------"+ch+" : "+stringMap.get(ch)+"------------");
    }
    for(Character ch:charsMap.keySet()){
        System.out.println(ch+" : "+charsMap.get(ch));
    }
    for(Character ch : stringMap.keySet()){
        boolean flag = false;
        if(charsMap.containsKey(ch) && charsMap.get(ch) >= stringMap.get(ch)){
            flag = true;
        }
        if(!flag){
            return false;
        }
       
    }
    return true;
}
public static int countCharacters(String[] words, String chars) {
    HashMap<Character, Integer>charsMap = new HashMap<>();
    for(int i =  0; i < chars.length(); i++){
        Character ch = chars.charAt(i);
        charsMap.put(ch, charsMap.getOrDefault(ch, 0)+1);
    }
    for(Character ch:charsMap.keySet()){
        System.out.println(ch+" : "+charsMap.get(ch));
    }
    int output = 0;
    for(int i = 0; i < words.length; i++){
        String str = words[i];
        HashMap<Character, Integer>stringMap = new HashMap<>();
        for(int j =  0; j < str.length(); j++){
            Character ch = str.charAt(j);
            stringMap.put(ch, stringMap.getOrDefault(ch, 0)+1);
        }
        HashMap<Character, Integer> newCharsMap = new HashMap<>();
        for(Character ch : charsMap.keySet()){
            newCharsMap.put(ch, charsMap.get(ch));
        }
        boolean isGoodString = isGoodString(stringMap, newCharsMap);
        System.out.println(isGoodString);
        if(isGoodString){
            
            output += str.length();
        }
    }
    return output;
}
    public static void main(String[] args) {
        String chars = "atach";
        String words[] = {"cat", "bt", "hat", "tree"};
        System.out.println(countCharacters(words, chars));
    }
}
