public class Button {
    private Switchable device;

    public Button(Switchable device) {
        this.device = device;
    }

    public void press() {
        device.turnOn(); // Turn on the device when the button is pressed
    }

    public void release() {
        device.turnOff(); // Turn off the device when the button is released
    }
}
