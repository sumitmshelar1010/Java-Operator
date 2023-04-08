package MainPackage.JavaBasics.operator;

public class OrLogicalOperator {
    public static void main(String[] args) {
        int A =100 , B =200 ;


        /* IN OR LOGIC
           IF ANY ONE LOGIC AMONG TWO A & B IS TRUE THEN ALSO RESULT WILL BE TRUE
           IF FIRST LOGIC IS TRUE SO IT WILL NOT GO FOR SECOND
           DIRECTLY SHOW TRUE RESULT */

        System.out.println(A>50 || B>100);
        System.out.println(A<50 || B>100);
        System.out.println(A>50 || B<100);
        System.out.println(A<50 || B<100);
    }
}
