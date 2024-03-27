package ISPViolation02;

public class Car implements ISwitches{

    @Override
    public boolean startEngine() {
        return true;
    }

    @Override
    public boolean turnRadioOn() {
        return true;
    }

    @Override
    public boolean turnCameraOff() {
        return false;
    }


    @Override
    public boolean turnRadioOff() {
        return false;
    }

    @Override
    public boolean turnCameraOn() {
        return true;
    }

}
