// Question :
// A non-empty array a of length n is called an array of all possiblities if it contains all numbers between 0 and a.length-1 inclusive. Write a method named isAllPossibilities that accepts an integer array and returns 1 if the array is an array of all possiblities, otherwise it returns 0.
// If you are programming in Java or C#, the function signature is
// int isAllPossibilities(int[ ] a)
// If you are programming in C or C++, the function signature is
// int isAllPossibilities(int a[ ], int len) where len is the number of elements in the array
// Examples
// If the input array is
// return
// {1, 2, 0, 3}
// 1
// {3, 2, 1, 0}
// 1
// {1, 2, 4, 3}
// 0 (because 0 not included and 4 is too big)
// {0, 2, 3}
// 0 (because 1 is not included)
// {0}
// 1
// {}
// 0

public class AllPossibilities {
    
    public static int isAllPossibilities(int arr[]){
        if(arr.length < 1 || arr == null){
            return 0 ;
        }

        for(int i = 0; i< arr.length; i++){
            boolean step = false;
            for(int j = 0; j< arr.length; j++){
                if(arr[i] == j){
                    step = true;
                }
            }
            if(step == false){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] a = {0};
        System.out.println(AllPossibilities.isAllPossibilities(a));
        int[] a1 = {1, 2, 0, 3};
        System.out.println(AllPossibilities.isAllPossibilities(a1));
        int[] a2 = {3, 2, 1, 0};
        System.out.println(AllPossibilities.isAllPossibilities(a2));
        int[] a3 = {1, 2, 4, 3};
        System.out.println(AllPossibilities.isAllPossibilities(a3));
        int[] a4 = {0, 2, 3};
        System.out.println(AllPossibilities.isAllPossibilities(a4));
        int[] a5 = {};
        System.out.println(AllPossibilities.isAllPossibilities(a5));

    }
}
