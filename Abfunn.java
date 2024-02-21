public class Abfunn {
    public static int funn(int a, int b){
        if(a<4 && (7+a)<(a^b)){
            b = (a+1)+a;
            a = (b+3)+b;
            a = 3+2+b;
            return funn(b,b)+funn(b,b);
        }
        return b-1;
    }
    public static void main(String[] args) {
        System.out.println(funn(3,8));
    }
}
