// Question :
// An array is defined to be a Filter array if it meets the following conditions
//    a. If it contains 9 then it also contains 11.
//    b. If it contains 7 then it does not contain 13.

// So {1, 2, 3, 9, 6, 11} and {3, 4, 6, 7, 14, 16}, {1, 2, 3, 4, 10, 11, 13} and {3, 6, 5, 5, 13, 6, 13} are Filter arrays. 
// The following arrays are not Filter arrays: {9, 6, 18} (contains 9 but no 11), {4, 7, 13} (contains both 7 and 13)

// Write a function named isFilter that returns 1 if its array argument is a Filter array, otherwise it returns 0.

// If you are programming in Java or C#, the function signature is
//    int isFilter(int[ ] a)
// If you are programming in C or C++, the function signature is
//    int isFilter(int a[ ], int len) where len is the number of elements in the array.



public class FilterArray {
    
    public static int isFilter(int[ ] a){

        boolean has11 = false, has7 = false, has13 = false, has9 = false;

        for(int  i = 0; i< a.length; i++){
            if(a[i] == 9)
            has9 = true;
            if(a[i] == 11)
            has11 = true;
            if(a[i] == 7)
            has7 = true;
            if(a[i] == 13)
            has13 = true;
        }
        if (has9 ){
            if (! has11 )
            return 0 ;
        }
        

        if (has7){
            if (has13)
        return 0 ;
        }
        
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 6, 11};
        System.out.println(FilterArray.isFilter(arr)); // 1

        int[] arr1 = {3, 4, 6, 7, 14, 16};
        System.out.println(FilterArray.isFilter(arr1)); // 1

        int[] arr2 = {1, 2, 3, 4, 10, 11, 13};
        System.out.println(FilterArray.isFilter(arr2)); // 1

        int[] arr3 = {3, 6, 5, 5, 13, 6, 13};
        System.out.println(FilterArray.isFilter(arr3)); // 1

        int[] arr4 = {9, 6, 18};
        System.out.println(FilterArray.isFilter(arr4));

        int[] arr5 = {4, 7, 13};
        System.out.println(FilterArray.isFilter(arr5));

    }
}
