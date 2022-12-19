// Question:
// An array is defined to be maxmin equal if it contains at least two different elements and the number of times the maximum value occur is the same as the number of times the minimum value occur. So {11, 4, 9, 11, 8, 5 , 4, 10} is maxmin equal, because the max value 11 and min value 4 both appear two times in the array.

// Write a function called isMaxMinEqual that accepts an integer array and returns 1 if the array is maxmin equal; otherwise it returns 0.

// If you are programming in Java or C#, the function signature is
//                 int isMaxMinEqual(int[ ] a)

// If you are programming in C or C++, the function signature is
//                 int isMaxMinEqual(int a[ ], int len) where len is the number of elements in the array

// Some other examples:
// if the input array is
// isMaxMinEqual should return
// {}
// 0 (array must have at least two different elements)
// {2}
// 0 (array must have at least two different elements)
// {1, 1, 1, 1, 1, 1}
// 0 (array must have at least two different elements)
// {2, 4, 6, 8, 11}
// 1 (Both max value (11) and min value 2 appear exactly one time)
// {-2, -4, -6, -8, -11}
// 1 (Both max value (-2) and min value -11 appear exactly one time)



public class MaxEqual {
    public static int isMaxMinEqual(int[ ] a){
        
        int maxCount = 0;
        int minCount = 0;

        if(a.length < 2){
            return 0;
        }

        int max = a[0];
        int min = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i]> max){
                max = a[i];
                maxCount = 1;
            } else if(a[i]< min){
                min = a[i];
                minCount = 1;
            } else {
                if(max == a[i]){
                    maxCount++;
                } 

                if(min == a[i]){
                    minCount++;
                }
            }
        }

        if(minCount == maxCount && min !=max){
            return 1;
        }
        
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {11, 4, 9, 11, 8, 5 , 4, 10};
        System.out.println(MaxEqual.isMaxMinEqual(arr)); // 1
        int[] arr1 = {};
        System.out.println(MaxEqual.isMaxMinEqual(arr1)); // 0
        int[] arr2 = {2}; 
        System.out.println(MaxEqual.isMaxMinEqual(arr2)); // 0
        int[] arr3 = {1, 1, 1, 1, 1, 1};
        System.out.println(MaxEqual.isMaxMinEqual(arr3)); //0
        int[] arr4 = {-2, -4, -6, -8, -11};
        System.out.println(MaxEqual.isMaxMinEqual(arr4)); // 1
    }
}
