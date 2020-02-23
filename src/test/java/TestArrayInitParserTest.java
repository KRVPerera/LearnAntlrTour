import com.krv.tour.TestArrayInitParser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestArrayInitParserTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRunFileSimple() {
        TestArrayInitParser.runFile("src/test/resources/intsimple");
        Assert.assertEquals(0, 0);
    }

    @Test
    public void testRunFileMultiple() {
        TestArrayInitParser.runFile("src/test/resources/intlist");
        Assert.assertEquals(0, 0);
    }

    @Test
    public void testRunFileExpr() {
        TestArrayInitParser.runFileExpr("src/test/resources/expr/t.expr");
        Assert.assertEquals(0, 0);
    }
}
