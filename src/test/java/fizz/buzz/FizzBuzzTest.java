package fizz.buzz;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static fizz.buzz.FizzBuzz.BUZZ;
import static fizz.buzz.FizzBuzz.FIZZ;
import static fizz.buzz.FizzBuzz.FIZZ_BUZZ;
import static fizz.buzz.FizzBuzz.NO_SAUCE;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: brjacobs
 * Date: 7/18/14
 * Time: 12:15 PM
 */
public class FizzBuzzTest {

    private FizzBuzz fz = new FizzBuzz();

    private static List<Integer> divsBy3 = new ArrayList<>();

    private static List<Integer> divsBy5 = new ArrayList<>();

    private static List<Integer> divsBy53 = new ArrayList<>();

    private static List<Integer> noSauces = new ArrayList<>();

    @BeforeClass
    public static void before() {

        divsBy3.add(-3);
        divsBy3.add(3);
        divsBy3.add(6);
        divsBy3.add(9);

        divsBy5.add(-5);
        divsBy5.add(5);
        divsBy5.add(10);

        divsBy53.add(15);
        divsBy53.add(30);

        noSauces.add(7);
        noSauces.add(13);
        noSauces.add(17);
    }

    @Test
    public void shouldBeFizz() {
        assertEquals(divsBy3, FIZZ);
    }

    @Test
    public void shouldBeBuzz() {
        assertEquals(divsBy5, BUZZ);
    }

    @Test
    public void shouldBeFizzBuzz() {
        assertEquals(divsBy53, FIZZ_BUZZ);
    }

    @Test
    public void shouldBeNoSauce() {
        assertEquals(noSauces, NO_SAUCE);
    }

    private void assertEquals(List<Integer> numbers, String expected) {
        numbers.forEach(number -> assertThat(fz.fizzBuzz(number), is(expected)));
    }
}
