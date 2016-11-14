import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Test class for the Calculator class
 */
public class CalculatorTest {

    private static final double NUMBER_1 = 0.0;
    private static final double NUMBER_2 = 0.0;
    private static final double NUMBER_3 = 1.0;
    private static final double RESULT = 0.0;

    private final Calculator calculator = new Calculator();

    @Test
    public void addShouldReturnSameAsResult() {
        assertThat(calculator.add(NUMBER_1, NUMBER_2), is(RESULT));
    }

    @Test
    public void addShouldReturnDifferentAsResult() {
        assertThat(calculator.add(NUMBER_1, NUMBER_3), not(RESULT));
    }

    @Test
    public void subtractShouldReturnSameAsResult() {
        assertThat(calculator.subtract(NUMBER_1, NUMBER_2), is(RESULT));
    }

    @Test
    public void subtractShouldReturnDifferentAsResult() {
        assertThat(calculator.subtract(NUMBER_1, NUMBER_3), not(RESULT));
    }

    @Test
    public void multiplyShouldReturnSameAsResult() {
        assertThat(calculator.multiply(NUMBER_1, NUMBER_2), is(RESULT));
    }

    @Test
    public void multiplyShouldReturnDifferentAsResult() {
        assertThat(calculator.multiply(NUMBER_3, NUMBER_3), not(RESULT));
    }

    @Test
    public void divideShouldReturnSameAsResult() {
        assertThat(calculator.divide(NUMBER_1, NUMBER_3), is(RESULT));
    }

    @Test
    public void divideShouldReturnDifferentAsResult() {
        assertThat(calculator.divide(NUMBER_3, NUMBER_3), not(RESULT));
    }
}