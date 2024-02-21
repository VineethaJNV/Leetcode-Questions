public class Abc {
    public static int fun(int a, int b, int c){
        if((c+a)< b &&(b+c)<a){
            a = (a+c)+a;
            if((b+c-a)<(8+b)){
                b = (6+9)+c;
            }
            b=(b+b)+b;
        }
        b = (a+c)+a;
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(fun(6,5,10));
    }
}
