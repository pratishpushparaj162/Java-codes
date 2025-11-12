package example.algorythms;

public class AlgTwoPalindrome {
    public static void main(String[] args) {
        String originOne = "madam";
        String originTwo = "elephant";
        System.out.println(checkPalindrome(originOne));
        System.out.println(checkPalindrome(originTwo));
        System.out.println("======================================");
        System.out.println(checkPalindromeAdvanced(originOne));
        System.out.println(checkPalindromeAdvanced(originTwo));
    }

    static boolean checkPalindrome(String origin) {
        StringBuilder stringBuilder = new StringBuilder(origin);
        String temp = stringBuilder.reverse().toString();
        return temp.equalsIgnoreCase(origin);
    }

    static boolean checkPalindromeAdvanced(String origin) {
        String temp = origin.toLowerCase();
        for (int i = 0, j = temp.length() - 1; i < j; i++, j--) {
            if (temp.charAt(i) != temp.charAt(j)) {
                return  false;
            }
        }
        return true;
    }
}
