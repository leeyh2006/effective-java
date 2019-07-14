package ch03.item17;

/**
 * Name:ComplexTest
 * Desc :
 * Developer :82108
 * Date : 2019-07-14
 * Time : 오후 1:02
 */
public class ComplexTest {

    public static void main(String[] args) {
        Complex test = Complex.valueOf(1,2);

        test.realPart();

        System.out.println(test.toString());
    }
}
