package weather;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StevensionReadingTest {

    StevensionReading sReading;
    @Before
    public void setUp() throws Exception {
        sReading = new StevensionReading(1.5,2,3,4);
    }


    @Test
    public void testTestToString() {
        assertEquals("Reading: T = 3 D = 2 v = 4 rain = 1", sReading.toString());
    }
    @Test
    public void testGetTemperature() {
        assertEquals(3,sReading.getTemperature());
    }
    @Test
    public void testGetDewPoint() {
        assertEquals(2,sReading.getDewPoint());
    }
    @Test
    public void testGetWindSpeed() {
        assertEquals(4,sReading.getWindSpeed());
    }
    @Test
    public void testGetTotalRain() {
        assertEquals(1,sReading.getTotalRain());
    }
    @Test
    public void testGetRelativeHumidity() {
        assertEquals(95,sReading.getRelativeHumidity());
    }
    @Test
    public void testGetHeatIndex() {
        assertEquals(49,sReading.getHeatIndex());
    }
    @Test
    public void testGetWindChill() {
        assertEquals(-5,sReading.getWindChill());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDewPointMoreThanTemp(){
        sReading = new StevensionReading(1,2,1,1);
    }
}