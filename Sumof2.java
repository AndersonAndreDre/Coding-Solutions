public class Sumof2 {


    public static String sumOfInt(int[] arr,int num){
        int[] returnArr={0,0};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]+arr[i]==num){
                     returnArr[0]=arr[j];
                     returnArr[1]=arr[i];
                }
            }

        }
        String i=returnArr[0]+", "+returnArr[1];
        return i;
    }



    public static void main(String[] args) {
        //int k= new uniquepaths(3,2);
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(sumOfInt(array,7));
    }


}
