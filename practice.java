import java.util.ArrayList;
import java.util.List;

public class practice {
    public static  String module(int[] nums){
        List<Integer> repeats= new ArrayList<>();
        int actual=0;
        for (int i=0;i<nums.length;i++){
            actual+=nums[i];

        }
        int n=nums.length;
        int sumofN=((n+1)*(n+2))/2;
        int missing=sumofN-actual;
        return Integer.toString(missing);

    }
    public static void main(String[] args) {
        int[] arr={ 1, 2, 4, 5, 6 };
        System.out.println(module(arr));
        //System.out.println(arr.length);
    }
}
