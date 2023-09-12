import java.util.Arrays;
public class findMissing {

    public static int findMissingNum(int[] nums) {
        Arrays.sort(nums);
        int actual=0;
        for(int i: nums){
            actual+=i;
        }
       // int n=nums[nums.length-1];
        int n=nums.length;
        int sumOfN=((n+1)*(n+2))/2;

        return sumOfN-actual;


    }

    public static void main(String[] args) {
        int[] arr = {5,1,3,4};
        System.out.println(findMissingNum(arr));

    }
}