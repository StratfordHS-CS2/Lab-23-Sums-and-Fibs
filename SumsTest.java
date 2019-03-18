import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SumsTest.
 *
 * @author  Dave Avis
 * @version 3.17.2019
 */
public class SumsTest
{
    /**
     * Testing findSum
     */
    @Test(timeout=2000)
    public void findSumTest()
    {
        assertEquals( "Sum is incorrect. (-45 points)", 233168, Sums.findSum() );
    }
}