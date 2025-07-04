public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        TV tv = new TV();
        AirConditioner ac = new AirConditioner();
        Refrigerator fridge = new Refrigerator();
        Oven oven = new Oven();

        remote.addDevice(tv);
        remote.addDevice(ac);
        remote.addDevice(fridge);
        remote.addDevice(oven);

        System.out.println("Turn all devices ON:");
        remote.turnAllOn();

        System.out.println("\nTurn on only the oven:");
        remote.turnOnByType(Oven.class);

        System.out.println("\nTurn all devices OFF:");
        remote.turnAllOff();
    }
}
