package MainPackage.JavaBasics.operator;

public class AndLogicalOperator {
    public static void main(String[] args) {
        int A =100 , B =200 ;

        /* IN AND LOGIC
           IF A & B BOTH ARE TRUE THEN ONLY RESULT WILL BE TRUE
           IF FIRST LOGIC IS FALSE SO IT WILL NOT GO FOR SECOND
           DIRECTLY SHOW FALSE RESULT */

        System.out.println(A>50 && B>100);
        System.out.println(A<50 && B>100);
        System.out.println(A>50 && B<100);
        System.out.println(A<50 && B<100);
    }}
