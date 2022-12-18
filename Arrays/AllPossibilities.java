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
