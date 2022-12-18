/*Write a function named factorTwoCount that returns the number of times that 2 divides the argument.

For example, factorTwoCount(48) returns 4 because
48/2 = 24
24/2 = 12
12/2 = 6
6/2 = 3
2 does not divide 3 evenly.

Another example: factorTwoCount(27) returns 0 because 2 does not divide 27.

The function signature is

int factorTwoCount(int n);

*/
public class FactorTwoCounts {
    public static int factorTwoCount(int n){
        if(n%2!=0 || n==0){
            return -1;
        }

        int twoCount = 0;

        while(n%2==0 ){
            twoCount++;
            n /=2;
        }
        return twoCount;
    }
    public static void main(String[] args) {
        int number = 48;
        System.out.println(FactorTwoCounts.factorTwoCount(number));
        int number1 = 23;
        System.out.println(FactorTwoCounts.factorTwoCount(number1));
        int n = 0;
        System.out.println(FactorTwoCounts.factorTwoCount(n));
        int number2 = -90;
        System.out.println(FactorTwoCounts.factorTwoCount(number2));
    }
}