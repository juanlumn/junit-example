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
    public void add() {
        assertThat(calculator.add(NUMBER_1, NUMBER_2), is(RESULT));
        assertThat(calculator.add(NUMBER_1, NUMBER_3), not(RESULT));
    }

    @Test
    public void subtract() {
        assertThat(calculator.subtract(NUMBER_1, NUMBER_2), is(RESULT));
        assertThat(calculator.subtract(NUMBER_1, NUMBER_3), not(RESULT));
    }

    @Test
    public void multiply() {
        assertThat(calculator.multiply(NUMBER_1, NUMBER_2), is(RESULT));
        assertThat(calculator.multiply(NUMBER_3, NUMBER_3), not(RESULT));
    }

    @Test
    public void divide() {
        assertThat(calculator.divide(NUMBER_1, NUMBER_3), is(RESULT));
        assertThat(calculator.divide(NUMBER_3, NUMBER_3), not(RESULT));
    }
}