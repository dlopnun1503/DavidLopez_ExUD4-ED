
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;

/*
 *
 * @author David López
 */
public class ConversorTest {
    
    public ConversorTest() {
    }

    /**
     * Test of main method, of class conversor.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] argumentos = null;
        Conversor.main(argumentos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of celsiusAFahrenheit method, of class conversor.
     */
    @Test
    public void testCelsiusAFahrenheit() {
        System.out.println("celsiusAFahrenheit");
        float celsius = 0.0f;
        float expResult = 32.0f;
        float result = Conversor.celsiusAFahrenheit(celsius);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fahrenheitACelsius method, of class conversor.
     */
    @Test
    public void testFahrenheitACelsius() {
        System.out.println("fahrenheitACelsius");
        float fahrenheit = 0.0f;
        float expResult = -17.777779f;
        float result = Conversor.fahrenheitACelsius(fahrenheit);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}