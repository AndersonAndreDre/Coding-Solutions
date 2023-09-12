public class reverseWordsSolution {
    public static String reversSentence(String sentence){
        int i = sentence.indexOf(" ");

        if(i==-1){
            return sentence;

        }

        return reversSentence(sentence.substring(i+1))+" "+ sentence.substring(0,i);

    }
//public static String reverse(String s) {
//    // Finding the index of the whitespaces
//    int x = s.indexOf(" ");
//
//    //Base condition
//    if(x == -1)
//        return s;
//
//    //Recursive call
//    return reverse(s.substring(x+1)) +" "+ s.substring(0, x);
//}
    public static void main(String[] args){
        String str ="MY NAME IS ANDERSON";
        String rev = reversSentence(str);
        System.out.println("Reversed sentence: " + rev);
    }
}
