public class Pqr {
    public static int fun(int p, int q, int r){
        q = p+q;
        for(int i = 2; i <= 5; i++){
            q = (r+6)^r;
            p = 8+q;
        }
        for(int i = 2; i <= 4; i++){
            q = p+p;
            q = q&p;
        }
        p = (p+r)+r;
        return p+q;
    }
    public static void main(String[] args) {
        System.out.println(fun(5,2,7));
    }
}
