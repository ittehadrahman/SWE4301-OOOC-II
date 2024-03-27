package Task02;

public class MOTOR_BIKE extends Vehicle implements ITrip{
    public MOTOR_BIKE(int distanceKM, int timeMinutes, int numberOfPassengers) {
        super(distanceKM, timeMinutes, numberOfPassengers);
    }

    @Override
    public int perHeadFare(VehicleType vehicleType) {
        return Math.max(25, distanceKM * 20) / numberOfPassengers;

    }

    @Override
    public boolean canTakeTrip(int numberOfPassengers) {
        return numberOfPassengers <= 1 && distanceKM <= 10;
    }
}
