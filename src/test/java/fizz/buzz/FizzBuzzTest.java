package fizz.buzz;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static fizz.buzz.FizzBuzz.BUZZ;
import static fizz.buzz.FizzBuzz.FIZZ;
import static fizz.buzz.FizzBuzz.FIZZ_BUZZ;
import static fizz.buzz.FizzBuzz.NO_SAUCE;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: brjacobs
 * Date: 7/18/14
 * Time: 12:15 PM
 */
public class FizzBuzzTest {

    private FizzBuzz fz = new FizzBuzz();

    private static List<Integer> fizzes;

    private static List<Integer> buzzes;

    private static List<Integer> fizzBuzzes;

    private static List<Integer> noSauces;

    @BeforeClass
    public static void before() {

        fizzes = asList(-3, 3, 6, 9);

        buzzes = asList(-5, 5, 10);

        fizzBuzzes = asList(15, 30);

        noSauces = asList(7, 13, 17);
    }

    @Test
    public void shouldBeFizz() {
        assertEquals(fizzes, FIZZ);
    }

    @Test
    public void shouldBeBuzz() {
        assertEquals(buzzes, BUZZ);
    }

    @Test
    public void shouldBeFizzBuzz() {
        assertEquals(fizzBuzzes, FIZZ_BUZZ);
    }

    @Test
    public void shouldBeNoSauce() {
        assertEquals(noSauces, NO_SAUCE);
    }

    private void assertEquals(List<Integer> numbers, String expected) {
        numbers.forEach(number -> assertThat(fz.fizzBuzz(number), is(expected)));
    }
}
