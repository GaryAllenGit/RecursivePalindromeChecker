public class RecursivePalindromeTester {
    public static void main(String[] args) {
        // a list of words to use for testing
        String[] words = {"madam", "toot", "hello"};

        // iterate around the list of test words, printing and testing each one
        for (String word : words) {
            System.out.print(word);
            if (isPalindrome(word))
                System.out.println(" is a palindrome");
            else
                System.out.println(" is NOT a palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1)
            // if the string is 0 or 1 chars in length, it is a palindrome
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1))
            // if the first and last letters do not match, it is not a palindrome
            return false;
        else
            // recursively call the function removing the first and last characters of the string
            return isPalindrome(s.substring(1, s.length() - 1));
    }
}
