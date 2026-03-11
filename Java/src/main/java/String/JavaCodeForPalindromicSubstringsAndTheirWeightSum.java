package String;

/**
 * This is a java code to find all the palindromic substrings of a given string and their sum of weights if a =1, b = 2
 * and so on.
 */
public class JavaCodeForPalindromicSubstringsAndTheirWeightSum {

    public static void main(String[] args) {
        String s = "aba";
        System.out.println("Sum: " + sumWeights(s));
    }

    public static int sumWeights(String s) {
        int len = s.length();
        int total = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (isPalindrome(s, i, j)) {
                    System.out.println(s.substring(i, j + 1));
                    int w = 0;
                    for (int k = i; k <= j; k++) {
                        w += weight(s.charAt(k));
                    }
                    total += w;
                }
            }
        }
        return total;
    }

    public static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static int weight(char ch) {
        return ch - 'a' + 1;
    }
}
