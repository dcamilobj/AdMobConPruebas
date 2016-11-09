package co.edu.udea.computacionmovil.myapplication00.test;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("co.edu.udea.computacionmovil.myapplication00", appContext.getPackageName());
    }

    @Test
    public void esta_da()
    {
        assertTrue(5>1);
    }

    @Test
    public void esta_no_da()
    {
        assertTrue(5<1);
    }
}
