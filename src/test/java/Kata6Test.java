import static org.junit.Assert.*;
import org.junit.Test;

public class Kata6Test {

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Kata6.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Kata6.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Kata6.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Kata6.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Kata6.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Kata6.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Kata6.rps("scissors", "scissors"));
        assertEquals("Draw!", Kata6.rps("paper", "paper"));
        assertEquals("Draw!", Kata6.rps("rock", "rock"));
    }

}