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

        boolean isFizz = number % 3 == 0;

        boolean isBuzz = number % 5 == 0;

        boolean isFizzBuzz = isFizz && isBuzz;

        if (isFizzBuzz) return FIZZ_BUZZ;
        if (isBuzz) return BUZZ;
        if (isFizz) return FIZZ;
        return NO_SAUCE;

    }
}
