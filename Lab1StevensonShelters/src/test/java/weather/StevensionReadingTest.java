package weather;

import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class StevensionReadingTest extends TestCase {

    StevensionReading sReading;
    @Before
    public void setUp() throws Exception {
        sReading = new StevensionReading(1.5,2,3,4);
    }
//    @AfterClass
//    public void tearDown() throws Exception {
//        System.out.println("All Test Completed");
//    }

    @Test
    public void testTestToString() {
        assertEquals("Reading: T = 3 D = 2 v = 4 rain = 1", sReading.toString());
    }

    public void testGetTemperature() {
        assertEquals(3,sReading.getTemperature());
    }

    public void testGetDewPoint() {
        assertEquals(2,sReading.getDewPoint());
    }

    public void testGetWindSpeed() {
        assertEquals(4,sReading.getWindSpeed());
    }

    public void testGetTotalRain() {
        assertEquals(1,sReading.getTotalRain());
    }

    public void testGetRelativeHumidity() {
        assertEquals(95,sReading.getRelativeHumidity());
    }

    public void testGetHeatIndex() {
        assertEquals(49,sReading.getHeatIndex());
    }

    public void testGetWindChill() {
        assertEquals(-5,sReading.getWindChill());
    }

}