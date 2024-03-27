package Task02;

public class SEDAN extends Vehicle implements ITrip{

    public SEDAN(int distanceKM, int timeMinutes, int numberOfPassengers) {
        super(distanceKM, timeMinutes, numberOfPassengers);
    }

    @Override
    public int perHeadFare(VehicleType vehicleType) {
        return (50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;
    }

    @Override
    public boolean canTakeTrip(int numberOfPassengers) {
        return numberOfPassengers <= 4 && distanceKM <= 25;
    }
}
