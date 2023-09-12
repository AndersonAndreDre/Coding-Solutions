public class reverseIntDigitd {

    public static int reverseInt(int i){
        String s=""+i;
        String t="";
        char[] arr=s.toCharArray();
        for(int a= arr.length-1;a>-1;a--){
            t+=arr[a];
        }
        int k=Integer.parseInt(t);
        return k;
    }

    public static void main(String[] args) {
        //int k= new uniquepaths(3,2);
        System.out.println(reverseInt(123));
    }
}
