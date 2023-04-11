public class SumOfOddNums {
    public static int sumOfOdds(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2!=0){
                sum=sum + arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int result = sumOfOdds(nums);
        System.out.println(result);
    }

}
