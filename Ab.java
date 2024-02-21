public class Ab {
    public static int funn(int a, int b){
        if((b-4) < (a^b) && (3-a)<(a-b)){
            b = a+3;
            b = 2+1+a;
            b = 1+a+a;
            return funn(a,a)+funn(a+b, b);
        }
        return a+1;
    }
    public static void main(String[] args) {
        System.out.println(funn(9,4));
    }
}
