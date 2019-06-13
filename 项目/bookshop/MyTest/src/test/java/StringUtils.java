public class StringUtils {
    static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2 ; i++) {
            if (s.charAt(i)!= s.charAt((s.length()-i))) {
                return false;
            }
        }
        return true;
    }
}
