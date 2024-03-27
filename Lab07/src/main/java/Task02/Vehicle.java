package Task02;

public class Vehicle {
    protected int distanceKM;
    protected int timeMinutes;
    protected int numberOfPassengers;
    public Vehicle(int distanceKM, int timeMinutes, int numberOfPassengers)
    {
        this.distanceKM = distanceKM;
        this.numberOfPassengers = numberOfPassengers;
        this.timeMinutes = timeMinutes;
    }
}
