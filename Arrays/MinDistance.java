/*
 * Write a function named minDistance that returns the smallest distance between two non-trivial factors of a number. For example, consider 63. Its non-trivialfactors are 3, 7, 9 and 21. Thus minDistance(63) would return 2 because the smallest distance between any two non-trivial factors is 2 (9 - 7 = 2). As another example, minDistance (25) would return 0 because 25 has only one non-trivial factor: 5. Thus the smallest distance between any two non-trivial factors is 0 (5 - 5 = 0). Note that minDistance(11) would return -1 since 11 has no non-trivial factors.

* The function signature is
* int minDistance(int n)
 */
public class MinDistance {
    public static int minDistance(int n){

        if(n < 0){
            n = -n;
        }
        int temp = 0;

        int minDist = n;

        int count = 0;

        for(int i = 2; i <= n; i++){
                if(n % i == 0){
                    if(count == 0){
                        temp = i;
                    }
                    count++;
                    if(count > 1){
                        if(minDist > i - temp){
                            minDist = i - temp;
                            temp = i;
                        }
                    }
                }

                if( count==1 && i == n-1){
                    minDist = i-i;
                    return minDist;
                }
        }
        
        if(count == 0){
            return -1;
        }

        return minDist;
    }
    
    public static void main(String[] args) {
        int n = 63;
        System.out.println(MinDistance.minDistance(n)); // 2
        int num = 25;
        System.out.println(MinDistance.minDistance(num)); //0
    }
}
