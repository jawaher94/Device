import java.util.ArrayList;
import java.util.List;

class RemoteControl {
    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device d) {
        devices.add(d);
    }

    public void turnAllOn() {
        for (Device d : devices) {
            d.turnOn();
        }
    }

    public void turnAllOff() {
        for (Device d : devices) {
            d.turnOff();
        }
    }

    public void turnOnByType(Class<?> type) {
        for (Device d : devices) {
            if (d.getClass().equals(type)) {
                d.turnOn();
            }
        }
    }
}
