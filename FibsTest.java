import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FibsTest.
 *
 * @author  Dave Avis
 * @version 3.17.2019
 */
public class FibsTest
{
    /**
     * Testing sumFibs.
     */
    @Test(timeout=2000)
    public void sumFibsTest()
    {
        assertEquals( "sumFibs is incorrect. (-45 points)", 4613732, Fibs.sumFibs() );
    }
}
