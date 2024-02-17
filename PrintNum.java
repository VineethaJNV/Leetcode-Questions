public class PrintNum{
    public static void printRec(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        printRec(n-1);
        System.out.print(n+" ");
    }
    public static void printIter(int n){
        System.out.println("Using For");
        for(int i = n; i > 0; i--){
            System.out.print(i+" ");
        }
        System.out.println("\nUsing while");
        while(n > 0){
            System.out.print(n+" ");
            n--;
        }
        return;
    }
    public static void main(String[] args) {
        int n = 10; //10 9 8 7 6 5 4 3 2 1
        printIter(n);
        System.out.println("\nUsing recursion");
        printRec(n);
    }
}