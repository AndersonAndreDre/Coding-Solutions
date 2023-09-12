public class ReverseStringVowel {
    public static String reverseVowel(String s){
        char[] arr=s.toCharArray();
        int left=0,right=arr.length-1;
        while (left<right){
            boolean leftIsVowel= isVowel(arr[left]);
            boolean  rightIsVowel=isVowel(arr[right]);
            if(leftIsVowel && rightIsVowel){
                swap(arr,left,right);
                ++left;
                --right;
            }
            if(!leftIsVowel){
                ++left;
            }
            if (!rightIsVowel){
                --right;
            }
        }
        return new String(arr);
    }

    private static boolean isVowel(char letter){
        char c=Character.toLowerCase(letter);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';

    }

    private  static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        //int k= new uniquepaths(3,2);
        System.out.println(reverseVowel("APPLEPIE"));
    }

}
