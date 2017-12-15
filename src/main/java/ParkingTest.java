import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParkingTest {
    Sensor sensor = new Sensor();
    Parking parking = new Parking();
    Zone zone = new Zone();

    @Test
    void addSensor() {
        List<Sensor> listSensor = parking.getSensors();
        int initialSize = listSensor.size();

        parking.addSensor(sensor);

        // Check if the size of sensor list is incremented when addSensor is used
        assertEquals(initialSize + 1, parking.getSensors().size());

        // Check if added sensor is containing in sensor list
        assertEquals(true, parking.getSensors().contains(sensor));
    }

    @Test
    void removeSensor() {
        List<Sensor> listSensor = parking.getSensors();
        int initialSize = listSensor.size();

        parking.removeSensor(sensor.getID());

        // Check that if when removeSensor is used the list sensors is decremented
        assertEquals(initialSize - 1, parking.getSensors().size());

        // Check that the name of the sensor deleted is no more containing in the sensor list
        assertEquals(false, parking.getSensors().contains(sensor));
    }

    @Test
    void addZone() {
        assertEquals(false,false);
    }

    @Test
    void removeZone() {
        assertEquals(false,false);
    }

    @Test
     void getSensorState() {
        assertEquals(false,false);
    }

}