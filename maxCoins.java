import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthPasswordFieldUI;
public class maxCoins {
    /*There are 3n piles of coins of varying size, you and your friends will take piles of coins as follows:
In each step, you will choose any 3 piles of coins (not necessarily consecutive).
Of your choice, Alice will pick the pile with the maximum number of coins.
You will pick the next pile with the maximum number of coins.
Your friend Bob will pick the last pile.
Repeat until there are no more piles of coins.
Given an array of integers piles where piles[i] is the number of coins in the ith pile.

Return the maximum number of coins that you can have. */
    public static void printTriplets(int piles[]){
        ArrayList<int[]>list = new ArrayList<>();
        for(int i = 0; i < piles.length - 2; i++){
            int t[] = new int[3];
            int idx = 0;
            for(int j = i; j <= i + 2 ; j++){
                t[idx] = piles[j];
                idx++;
            }
            Arrays.sort(t);
            list.add(t);
            System.out.println();
        }
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).length; j++){
                System.out.print(list.get(i)[j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int piles[] = {9,8,7,6,5,1,2,3,4};
        printTriplets(piles);

    }
}
