package fizz.buzz;

/**
 * User: brjacobs
 * Date: 7/18/14
 * Time: 12:06 PM
 */
public class FizzBuzz {

    public static final String BUZZ = "BUZZ";

    public static final String FIZZ = "FIZZ";

    public static final String FIZZ_BUZZ = FIZZ + BUZZ;

    public static final String NO_SAUCE = "No Sauce";

    public String fizzBuzz(int number) {

        boolean isDivisibleBy3 = number % 3 == 0;

        boolean isDivisibleBy5 = number % 5 == 0;

        boolean isDivisibleByBoth = isDivisibleBy3 && isDivisibleBy5;

        if (isDivisibleByBoth) {
            return FIZZ_BUZZ;
        }
        else if (isDivisibleBy5) {
            return BUZZ;
        }
        else if (isDivisibleBy3) {
            return FIZZ;
        }
        else {
            return NO_SAUCE;
        }
    }
}
