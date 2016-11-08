import org.jetbrains.annotations.Contract;

/**
 * Calculator class.
 */
public class Calculator {

    /**
     * Private method which adds two double parameters
     *
     * @param number1 double parameter
     * @param number2 double parameter
     * @return double with the result of the addition
     */
    @Contract(pure = true)
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    /**
     * Private method which subtract two double parameters
     *
     * @param number1 double parameter
     * @param number2 double parameter
     * @return double with the result of the subtraction
     */
    @Contract(pure = true)
    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    /**
     * Private method which multiplies two double parameters
     *
     * @param number1 double parameter
     * @param number2 double parameter
     * @return double with the result of the multiply
     */
    @Contract(pure = true)
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    /**
     * Private method which divides two double parameters
     *
     * @param number1 double parameter
     * @param number2 double parameter
     * @return double with the result of the division
     */
    @Contract(pure = true)
    public double divide(double number1, double number2) {
        return number1 / number2;
    }
}
