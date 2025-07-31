public class Array01 {
    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3};
        System.out.println(differenceOfSum(nums)); // Output: 9
    }
    public static int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum=0;
        for(int i : nums){
            elementSum += i;
            digitSum += sumDigit(i);
        }
        return elementSum-digitSum;
    }
    public static int sumDigit(int n){
        int sum=0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}

