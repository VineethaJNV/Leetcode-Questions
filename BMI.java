import java.util.*;
public class BMI {
    // public static int findCategory(int wt, int ht){
        

    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wt = sc.nextInt();
        float ht = sc.nextFloat();
        float BMI = wt/(ht*ht);
        if(BMI < 18){
            System.out.println(0);
        }else if((BMI >= 18) && (BMI < 25)){
            System.out.println(1);
        }else if((BMI >= 25) && (BMI < 30)){
            System.out.println(2);
        }else if((BMI >= 30) && (BMI < 40)){
            System.out.println(3);
        }else if (BMI >= 40){
            System.out.println(4);
        }
    }
}
