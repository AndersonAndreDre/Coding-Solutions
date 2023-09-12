import java.util.HashSet;
import java.util.Set;

public class stringSegmentation {

    public static boolean wordBreak(String inputStr, Set<String> wordDict) {
        int n = inputStr.length();
        // Create a boolean array to mark if a substring can be segmented.
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Empty string can always be segmented.

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // Check if the substring from j to i is in the dictionary and if dp[j] is true.
                if (dp[j] && wordDict.contains(inputStr.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Set<String> wordDict = new HashSet<>();
        wordDict.add("apple");
        wordDict.add("pen");
        wordDict.add("applepen");
        wordDict.add("pine");

        String inputString = "applepenpine";
        boolean result = wordBreak(inputString, wordDict);

        if (result) {
            System.out.println("Input string can be segmented into words.");
        } else {
            System.out.println("Input string cannot be segmented.");
        }
    }
}
