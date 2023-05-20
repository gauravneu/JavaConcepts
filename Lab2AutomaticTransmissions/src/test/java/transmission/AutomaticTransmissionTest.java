package transmission;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class AutomaticTransmissionTest {

    private AutomaticTransmission automaticTransmission;
    int randomSpeed;

    public AutomaticTransmissionTest(){
        automaticTransmission = new AutomaticTransmission(20,40,50,70,80);
        Random random = new Random();
        randomSpeed = random.nextInt(100);

    }

    @Test
    public void increaseSpeed() {
        for(int i=0; i < randomSpeed; i++){
        automaticTransmission.increaseSpeed();
        }
        assertEquals(randomSpeed,automaticTransmission.getSpeed());
    }

    @Test
    public void decreaseSpeed1() {
        for(int i=0; i < randomSpeed; i++){
            automaticTransmission.increaseSpeed();
        }
        for(int i = randomSpeed ;i > 0; i--){
            automaticTransmission.decreaseSpeed();
        }
        assertEquals(0,automaticTransmission.getSpeed());
    }

    @Test(expected = IllegalStateException.class)
    public void decreaseSpeed() {
        for(int i=0; i < randomSpeed; i++){
            automaticTransmission.increaseSpeed();
        }
        for(int i = randomSpeed ;i >= 0; i--){
            automaticTransmission.decreaseSpeed();
        }

    }

    @Test
    public void getSpeed() {
        for(int i=0; i < randomSpeed; i++){
            automaticTransmission.increaseSpeed();
        }
        assertEquals(randomSpeed,automaticTransmission.getSpeed());
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongInitialization() {
        automaticTransmission = new AutomaticTransmission(-1,9,54,6,7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongInitialization1() {
        automaticTransmission = new AutomaticTransmission(1,9,54,6,7);
    }

    @Test
    public void testToString() {
        for(int i=0; i < 45; i++){
            automaticTransmission.increaseSpeed();
        }
        assertEquals("Transmission (speed = 45, gear = 3)",automaticTransmission.toString());
    }
}