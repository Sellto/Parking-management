/**
 *Zone is the Observer.
 *Use to get freeSpace into the area.
 */
public class Zone extends Observer {
    /**
     *id is identifier of this zone.
     */
    private String id;
    /**
     *freeSpace reference the number of free space in this zone.
     */
    private int freeSpaces;

    /**
     *Constructor of Zone Class.
     * @param givenId is the identifier.
     */
    public Zone(final String givenId) {
        this.id = givenId;
    }

    /**
     * Design Pattern Method.
     * @param sensorState is the state from the notifyObservers method.
     */
    public final void update(final boolean sensorState) {
        if (!sensorState) {
            this.freeSpaces -= 1;
        } else {
            this.freeSpaces += 1;
        }
    }
    /**
     * Accessor of the freeSpaces variable.
     * @return the number of free space in this zone.
     */
    public final int getFreeSpace() {
        return this.freeSpaces;
    }

    /**
     * Accessor of the id variable.
     * @return the identifier of this zone.
     */
    public final String getId() {
        return this.id;
    }
}
