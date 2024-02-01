import static org.junit.jupiter.api.Assertions.*;

class RecursivePalindromeSolverTest {
    RecursivePalindromeSolver solver;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        solver = new RecursivePalindromeSolver();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void isPalindrome0() {
        assertFalse(solver.isPalindrome("hello"));
    }

    @org.junit.jupiter.api.Test
    void isPalindrome1() {
        assertFalse(solver.isPalindrome("book"));
    }

    @org.junit.jupiter.api.Test
    void isPalindrome2() {
        assertTrue(solver.isPalindrome("A"));
    }

    @org.junit.jupiter.api.Test
    void isPalindrome3() {
        assertTrue(solver.isPalindrome("toot"));
    }

    @org.junit.jupiter.api.Test
    void isPalindrome4() {
        assertTrue(solver.isPalindrome("madam"));
    }

    @org.junit.jupiter.api.Test
    void isPalindrome5() {
        assertTrue(solver.isPalindrome(""));
    }
}