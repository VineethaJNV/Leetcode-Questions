
class HelloWorld {
    public static int fun(int a, int b, int c){
    if((b&a)<c || (2&a)<c){
        c = (b+b)+b;
    }
    //END if
    return a+b+c;
}
    public static void main(String[] args) {
        System.out.println(fun(2, 8, 6));
    }
}
