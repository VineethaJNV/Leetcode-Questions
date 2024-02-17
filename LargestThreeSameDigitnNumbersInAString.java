import java.util.HashMap;

public class LargestThreeSameDigitnNumbersInAString {
/*You are given a string num representing a large integer. An integer is good if it meets the following conditions:
It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.
Note:
A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer. */
    public static String largestGoodInteger(String num) {
        String ans = "0";
        for(int i = 0; i <= num.length() - 3; i++){
            System.out.println(num.substring(i, i+3));
            String subStr = num.substring(i, i+3);
            if((subStr.charAt(0) == subStr.charAt(1))&&(subStr.charAt(0)==subStr.charAt((2)))){
               System.out.println("max = : "+max+" "+"subStr : "+Integer.parseInt(subStr));
                ans = Integer.parseInt(ans) > Integer.parseInt(subStr) ? ans : subStr;
                System.out.println("ans : "+ans);
                
            }
        }
        System.out.println();
        return ans;
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(int i = 0 ; i < num.length(); i++){
        //     Character ch = num.charAt(i);
        //     map.put(ch, map.getOrDefault(ch, 0)+1);
        // }
        // Integer largestThreeDigitNum = Integer.MIN_VALUE;
        // for(Character ch : map.keySet()){
        //     if(map.get(ch) >= 3){
        //         StringBuilder threeSameDigitNumber = new StringBuilder(ch);
        //         threeSameDigitNumber.append(ch);
        //         threeSameDigitNumber.append(ch);
        //         threeSameDigitNumber.append(ch);
        //         System.out.println(ch+" "+threeSameDigitNumber);
        //         Integer sameDigNum = Integer.parseInt(threeSameDigitNumber.toString());
        //         largestThreeDigitNum = Math.max(sameDigNum, largestThreeDigitNum);
        //     }
        // }
        // return largestThreeDigitNum.toString();

    }
    public static void main(String[] args) {
        String num = "6777133339";
        // String num = "2300019";
        System.out.println(largestGoodInteger(num));
    }
}
