package test.build.com.example.craft2;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void test1() throws Exception {
        String expected = "a";
        String actual = "a";
        assertEquals(expected, actual);
    }
}