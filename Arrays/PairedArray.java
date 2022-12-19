// isPaired
// QUESTION : An array a is called paired if its even numbered elements (a[0], a[2], etc.) are odd and its  odd numbered elements (a[1], a[3], etc.) are even.  Write a function namedisPaired that accepts an array of integers and returns 1 if the array is paired, otherwise it returns 0. Examples:  {7, 2, 3, 6, 7} is paired since a[0], a[2] and a[4] are odd, a[1] and a[3] are even. {7, 15, 9, 2, 3} is not paired since a[1] is odd. {17, 6, 2, 4} is not paired since a[2] is even.
// If you are programming in Java or C#, the function signature is 
// int isPaired(int[ ] a)
// If you are programming in C or C++, the function signature is 
// int isPaired(int a[ ], int len)
// where len is the number of elements in the array.  


public class PairedArray {
    
    public static int isPaired(int[ ] a){

        for(int i = 0; i < a.length; i++){
            if(i % 2 == 0){
                if(a[i] % 2 == 0){
                    return 0;
                }
            }
            if ( i% 2 != 0){
                if(a[i] % 2 != 0){
                    return 0;
                }
            }
        }

        return 1;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 6, 7};
        System.out.println(PairedArray.isPaired(arr)); // 1

        int[] arr1 =  {7, 15, 9, 2, 3};
        System.out.println(PairedArray.isPaired(arr1)); // 0

        int[] arr2 = {17, 6, 2, 4};
        System.out.println(PairedArray.isPaired(arr2)); //0
    }
}
