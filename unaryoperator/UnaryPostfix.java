package MainPackage.JavaBasics.operator.unaryoperator;

public class UnaryPostfix {
    public static void main(String[] args) {
        //-------------Operators-------------------

//      1> Unary
//        i>Postfix:
//        ii>Prefix:
//======================================================================================================
//        i>Postfix:
//        ----------
//        a>Postfix increment
//        b>Postfix decrement
//=================================================================================================
//  a>Postfix increment: (First assign then increment)
        int a = 100;
        int b = a++;   //-----first b=a=100 (first assign) and then a++=101 (increment)
        int e = a++;
        System.out.println(a);// result is 102
        System.out.println(b);// result is 100
        System.out.println(e);// result is 101

//  b>Postfix decrement: (First assign then decrement)
        int c = 100;
        int d = c--;   //-----first d=c=100 (first assign) and then c--=99 (increment)
        System.out.println(c);// result is 99
        System.out.println(d);// result is 100
    }
}
