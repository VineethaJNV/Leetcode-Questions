import java.util.*;
public class HoursCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for(int i = 0 ; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if((arr[i]+ arr[j]) % 60 == 0){
                    result++;
                }
            }
        }
       if( result == 0) {
            System.out.println("NO HOURS");
        }else{
            System.out.println(result);
        }
}}
