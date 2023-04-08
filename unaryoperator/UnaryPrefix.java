package MainPackage.JavaBasics.operator.unaryoperator;

public class UnaryPrefix {
    public static void main(String[] args) {
 //=============================================================================================
//        ii>Prefix:
//        a>Prefix increment
//        b>Prefix decrement
//===============================================================================================
//        a>Prefix increment: (First increment then assign)
        int a = 100; // first increment a=++a => a=101
        int b = ++a; // first increment b=++a => b=102
        int c = ++b; // first increment c=++b => c=102
//===============================================================================================
//        b>Prefix decrement: (First decrement then assign)
        int d = 100; // first decrement d=--d =>d=99
        int e= --d;  // first decrement e=--d =>c=98
        int f= --e;  // first decrement f=--e =>f=98

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
