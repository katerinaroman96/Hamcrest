import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestDiscriminant {

    Discriminant dis;



    @BeforeAll
    public static void startedAll() {
        System.out.println("Tests started");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("Tests completed");
    }

    @BeforeEach
    public void started() {
        System.out.println("test started");
        dis = new Discriminant();
    }

    @AfterEach
    public void finished() {
        System.out.println("test completed");
    }

    @Test
    public void testDiscr() {
        int a = 3;
        int b = -14;
        int c = -5;
        double expected = 256.0;

        double result = dis.discr(a, b, c);

        assertThat(expected, equalTo(result));
        //Assertions.assertEquals(expected, result);
    }

    @Test
    public void testRoot() {
        double discr = 256.0;
        int a = 3;
        int b = -14;
        double expected = 5;

        double result = dis.root1(discr, a, b);

        assertThat(expected, equalTo(result));
        //Assertions.assertEquals(expected, result);
    }

    @Test
    public void testNegativeDiscr() {
        double discr = -256;
        int a = 3;
        int b = -14;

        double result = dis.root2(discr, a, b);

        assertThat(true, equalTo(Double.isNaN(result)));
        //Assertions.assertTrue(Double.isNaN(result));
    }

    @Test
    public void notNull() {
        assertThat(dis, notNullValue());
    }

    @Test
    public void notEmptyArrayOfRoots() {
        double x1 = 5;
        double x2 = 3;
        Double[] array = dis.roots(x1, x2);
        assertThat(array, not(emptyArray()));
    }
}
