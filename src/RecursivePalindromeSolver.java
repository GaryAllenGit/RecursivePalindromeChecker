class RecursivePalindromeSolver {
    public boolean isPalindrome(String s) {
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
