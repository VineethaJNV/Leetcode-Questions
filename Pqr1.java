public class Pqr1 {
    public static int fun(int p, int q, int r){
        for(r = 4; r <= 7; r++){
            q = (10^7)^q;
        }
        r = (r^p)^q;
        return p+q;
    }
    public static void main(String[] args) {
        System.out.println(fun(6, 4, 8));
    }
}
