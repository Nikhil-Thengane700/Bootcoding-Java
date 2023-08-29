public class MoveArrayBy2 {
    private static int [] moveArr(int[] nums){
        for (int i = 0; i < nums.length ; i++) {
           if(i< nums.length-3){ nums[i+2] =nums[i];}
            if(i== nums.length-3){
                nums[0] =nums[i];
            }
            if(  i== nums.length-2){
                nums[1] = nums[i];
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr ={ 1,2,3,4,5,6,7};
       int [] res= moveArr(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);

        }

    }
}
