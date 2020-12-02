package homework4.ex1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static homework4.Constants.OUT_OF_BOUNDS;
/**
 * @author Gohar Farmanyan
 */
public class TestStringAPI {

    private StringApi api;

    @BeforeClass
    public void setUp() {
        api = new StringApi();
    }

    @Test
    public void testGetCharAtIndexNull() {
        String result = api.getCharAtIndex(null, 7);
        assert result.equals(OUT_OF_BOUNDS);

    }

    @Test
    public void testGetCharAtIndexEmpty() {
        String result = api.getCharAtIndex("", 7);
        assert result.equals(OUT_OF_BOUNDS);

    }

    @Test
    public void testGetCharAtIndexBigK() {
        String result = api.getCharAtIndex("abcd", 8);
        assert result.equals(OUT_OF_BOUNDS);
    }

    @Test
    public void testGetCharAtIndexSmallK() {
        String result = api.getCharAtIndex("abcd", -8);
        assert result.equals(OUT_OF_BOUNDS);
    }

    @Test
    public void testGetCharAtIndex() {
        String result = api.getCharAtIndex("abcd", 3);
        assert result.equals("d");
    }

    @Test
    public void testGetCharAtIndexZero() {
        String result = api.getCharAtIndex("abcd", 8);
        assert result.equals("a");
    }

}
