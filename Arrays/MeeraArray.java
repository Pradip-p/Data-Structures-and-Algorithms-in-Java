/*
 * A Meera array is defined to be an array that contains at least one odd number and  begins and ends with the same number of even numbers.

* So {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Meera array because it begins with three even numbers and ends with three even numbers and it contains at least one odd number

* The array {2, 4, 6, 8, 6} is not a Meera array because it does not contain an odd number.

* The array {2, 8, 7, 10, -4, 6} is not a Meera array because it begins with two even numbers but ends with three even numbers.

* Write a function named isMeera that returns 1 if its array argument is a Meera array. Otherwise, it returns 0.

* If you are writing in Java or C#, the function signature is
* int isMeera (int[ ] a)

* If you are writing in C or C++, the function signature is
* int isMeera (int a[ ], int len) where len is the number of elements in the array.
*/
public class MeeraArray {
    public static int isMeera(int[] arr){
        boolean isOdd = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 !=0){
                isOdd = true;
                break;
            } 
        }
        
        int firstEvenCount = 0, lastEvenCount = 0;

        boolean firstOdd = false, lastOdd = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 ==0 && !firstOdd){
                firstEvenCount++;
            }else{
                firstOdd = true;
            }

            if(arr[arr.length-i-1]%2 ==0 && !lastOdd){
                lastEvenCount++;
            }else{
                lastOdd = true;
            }
        }

        if(isOdd && (lastEvenCount == firstEvenCount)){
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a1 = {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6};
        System.out.println(MeeraArray.isMeera(a1));

        int[] a2 = {2, 4, 6, 8, 6};
        System.out.println(MeeraArray.isMeera(a2));
        
        int[] a3 = {2, 8, 7, 10, -4, 6};
        System.out.println(MeeraArray.isMeera(a3));
    }
}
