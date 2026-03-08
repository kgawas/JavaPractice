package String;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String s = "euazbipzncptldueeuechubrcourfpftcebikrxhybkymimgvldiwqvkszfycvqyvtiwfckexmowcxztkfyzqovbtmzpxojfofbvwnncajvrvdbvjhcrameamcfmcoxryjukhpljwszknhiypvyskmsujkuggpztltpgoczafmfelahqwjbhxtjmebnymdyxoeodqmvkxittxjnlltmoobsgzdfhismogqfpfhvqnxeuosjqqalvwhsidgiavcatjjgeztrjuoixxxoznklcxolgpuktirmduxdywwlbikaqkqajzbsjvdgjcnbtfksqhquiwnwflkldgdrqrnwmshdpykicozfowmumzeuznolmgjlltypyufpzjpuvucmesnnrwppheizkapovoloneaxpfinaontwtdqsdvzmqlgkdxlbeguackbdkftzbnynmcejtwudocemcfnuzbttcoew";
        System.out.println(longestPalindrome(s));
//        "cbbd"
    }

    public static String longestPalindrome(String s) {
        List<String> substrings = new ArrayList<>();
        int maxLength = 0;
        String maxString = "";
        for (int j = 0; j < s.length(); j++) {
            for (int k = j + 1; k <= s.length(); k++) {
                substrings.add(s.substring(j, k));
            }
        }
        for (String sub : substrings) {
            if (isPalindrome(sub) && maxLength < sub.length()) {
                maxLength = sub.length();
                maxString = sub;
            }
        }
        return maxString;
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int length = s.length();
        int count = 0;
        while (i != length / 2) {
            if (s.charAt(i) == s.charAt(length - i - 1)) {
                count++;
            }
            i++;
        }

        if (count == length / 2) {
            return true;
        }
        return false;
    }

}
