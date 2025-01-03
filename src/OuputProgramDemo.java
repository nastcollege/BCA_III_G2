public class OuputProgramDemo {
    /*
    A program that will user unary operator and conditional operator.
    trace output of every line
     */

    public static void main(String[] args) {
        int a,b,c; //a=0,b=0,c=0;
        c=43; //c=43
        b=++c; //b=44 c=44
        a=c; //a=44
        System.out.println(c++); //44 c=45

        b=a>b?a:b;  // b=44
        System.out.println(++b); //45 b=45

        --a; //43

        b=a--; //b=43 a=42
        c=a+b+c; //42+43+45 c=130
        System.out.println(b--); //43 b=42
        System.out.println(c--); //130 c=129
    }
}
