import java.util.ArrayList;
import java.util.List;

public class findDuplicatesSolution {
  // Find duplicates without using extra space
    public static  List<Integer> findDuplicates(int [] nums){
        List<Integer>results=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
                results.add(index+1);
            }
            nums[index]=-nums[index];
        }
        return  results;
    }
    public static void main(String[] args) {
        //int k= new uniquepaths(3,2);
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(array));
    }
}
