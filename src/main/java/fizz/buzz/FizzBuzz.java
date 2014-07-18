package fizz.buzz;

/**
 * User: brjacobs
 * Date: 7/18/14
 * Time: 12:06 PM
 */
public class FizzBuzz {

    public static final String BUZZ = "BUZZ";

    public static final String FIZZ = "FIZZ";

    public static final String FIZZBUZZ = FIZZ + BUZZ;

    public static final String NO_SAUCE = "No Sauce";

    public String fizzBuzz(int number) {

        boolean isDivisableBy3 = number % 3 == 0;

        boolean isDivisableBy5 = number % 5 == 0;

        boolean isDivisableByBoth = isDivisableBy3 && isDivisableBy5;

        if (isDivisableByBoth) {
            return FIZZBUZZ;
        }
        else if (isDivisableBy5) {
            return BUZZ;
        }
        else if (isDivisableBy3) {
            return FIZZ;
        }
        else {
            return NO_SAUCE;
        }
    }
}
