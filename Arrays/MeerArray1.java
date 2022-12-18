/*
 * A Meera array is defined to be an array such that for all values n in the array, the value 2*n is not in the array. So {3, 5, -2} is a Meera array because 3*2, 5*2 and -2*2 are not in the array. But {8, 3, 4} is not a Meera array because for n=4,2*n=8 is in the array.

* Write a function named isMeera that returns 1 if its array argument is a Meera array. Otherwise it returns 0.

* If you are programming in Java or C#, the function signature is
* int isMeera(int [ ] a)

* If you are programming in C or C++, the function signature is
* int isMeera(int a[ ], int len) where len is the number of elements in the array.
*/

public class MeerArray1 {
    public static int isMeeraArray(int[] arr){
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i] == 2*arr[j]){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] a1 = {3, 5, -2};
        System.out.println(MeerArray1.isMeeraArray(a1));

        int[] a2 = {8, 3, 4};
        System.out.println(MeerArray1.isMeeraArray(a2));
    }
}
