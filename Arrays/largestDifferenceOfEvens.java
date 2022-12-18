/*
Write a function named largestDifferenceOfEvens which returns the largest difference between even valued elements of its array argument. For example largestDifferenceOfEvens(new int[ ]{-2, 3, 4, 9}) returns 6 = (4 - (-2)). If there are fewer than 2 even numbers in the array, largestDifferenceOfEvens should return -1.

If you are programming in Java or C#, the function signature is
int largestDifferenceOfEvens(int[ ] a)

If you are programming in C or C++, the function signature is
int largestDifferenceOfEvens(int a[ ], int len) where len is the number of elements in the array a.

Examples

a is {1, 3, 5, 9} then function returns -1 reason because there are no even numbers
a is {1, 18, 5, 7, 33} then function retuns -1 reason because there is only one even number (18)

a is {[2, 2, 2, 2]} then function retuens 0 reason because 2-2=0

a is {1, 2, 1, 2, 1, 4, 1, 6, 4} then function returns 4 reason because 6-2 ==4

*/

class largestDifferenceOfEvens{

    public static int largestDifferenceOfEven(int[] arr){
        int maxEven = 0, minEven = 0;
        int evenCout = 0;
        
        if(arr.length <1){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                if(evenCout == 0){
                    maxEven = arr[i];
                    minEven = arr[i];
                }

                evenCout++;
                if(minEven > arr[i]){
                    minEven = arr[i];
                }
                if(maxEven < arr[i]){
                    maxEven = arr[i];
                }
            }
        }

        if(evenCout< 2){
            return -1;
        }

        return maxEven-minEven;
    
    }
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 9};
        System.out.println(largestDifferenceOfEvens.largestDifferenceOfEven(a1));

        int[] a2 = {1, 2, 1, 2, 1, 4, 1, 6, 4};
        System.out.println(largestDifferenceOfEvens.largestDifferenceOfEven(a2));

        int[] a3 = {1, 18, 5, 7, 33};
        System.out.println(largestDifferenceOfEvens.largestDifferenceOfEven(a3));

        int[] a4 = {};
        System.out.println(largestDifferenceOfEvens.largestDifferenceOfEven(a4));
        
    }
}