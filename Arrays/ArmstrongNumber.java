class ArmstrongNumber{
    public static void main(String args[]){
        int n = 153;
        int sum = 0, temp = n;
        while(n!=0){
            
            int digit = n % 10;

            sum = sum + digit*digit*digit;

            n /=10;
        }
        if(sum == temp){
            System.out.println("Yes Armstrong Number");
        } else{
            System.out.println("No");
        }
    }
}