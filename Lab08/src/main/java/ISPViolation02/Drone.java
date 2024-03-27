package ISPViolation02;

public class Drone implements ISwitches{
    @Override
    public boolean turnCameraOn() {
        return true;
    }
    @Override
    public boolean turnCameraOff() {
        return false;
    }

    @Override
    public boolean turnRadioOn() {
        return true;
    }

    @Override
    public boolean startEngine() {
        return true;
    }

    @Override
    public boolean turnRadioOff() {
        return false;
    }


}
