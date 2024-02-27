package testUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Dung
 */
public class TestUnitTest {
    
    public TestUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of testInsertNV method, of class TestUnit.
     */
    @Test
    public void testTestInsertNV() {
        System.out.println("testInsertNV");
        TestUnit instance = new TestUnit();
        instance.testInsertNV();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
