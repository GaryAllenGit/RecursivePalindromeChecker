public class RecursivePalindromeTester {
    public static void main(String[] args) {
        RecursivePalondromeSolver solver = new RecursivePalondromeSolver();

        // a list of words to use for testing
        String[] words = {"madam", "toot", "hello"};

        // iterate around the list of test words, printing and testing each one
        for (String word : words) {
            System.out.print(word);
            if (solver.isPalindrome(word)) System.out.println(" is a palindrome");
            else System.out.println(" is NOT a palindrome");
        }
    }
}

