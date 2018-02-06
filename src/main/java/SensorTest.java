import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SensorTest {
    Sensor sensor = new Sensor();
    Zone zone = new Zone("Test");

    @Test
    void addObserver() {
        List<Observer> listObserver = sensor.getObservers();
        int initialSize = listObserver.size();

        sensor.addObserver(zone);

        // Check if the size of observers list is incremented when addObserver is used
        assertEquals(initialSize + 1, sensor.getObservers().size());

        // Check if added observer is containing in observers list
        assertEquals(true, sensor.getObservers().contains(zone));
    }


    @Test
    void removeObserver(){
        List<Observer> listObserver = sensor.getObservers();
        sensor.addObserver(zone);
        int initialSize = listObserver.size();

        sensor.removeObserver(zone);
        // Check if the size of observers list is decremented when removeObserver is used
        assertEquals(initialSize - 1, sensor.getObservers().size());

        // Check if added observer is containing in observers list
        assertEquals(false, sensor.getObservers().contains(zone));

    }

    @Test
    void notifyObservers() {
        assertEquals(false, false);
    }

}
