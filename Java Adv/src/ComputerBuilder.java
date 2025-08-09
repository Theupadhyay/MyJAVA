public class ComputerBuilder {
    private String RAM;
    private String processor;
    private String hardDisk;
    private String usbPort;
    private String hdmiPort;
    private String additionalKeyboard;
    private String wirelessMouse;

    public ComputerBuilder(String RAM, String processor, String hardDisk) {
        this.RAM = RAM;
        this.processor = processor;
        this.hardDisk = hardDisk;
    }

    public ComputerBuilder setUsbPort(String usbPort) {
        this.usbPort = usbPort;
        return this;
    }

    public ComputerBuilder setHdmiPort(String hdmiPort) {
        this.hdmiPort = hdmiPort;
        return this;
    }

    public ComputerBuilder setAdditionalKeyboard(String additionalKeyboard) {
        this.additionalKeyboard = additionalKeyboard;
        return this;
    }

    public ComputerBuilder setWirelessMouse(String wirelessMouse) {
        this.wirelessMouse = wirelessMouse;
        return this;
    }

    public Computer build() {
        Computer computer = new Computer(RAM, processor, hardDisk);
        computer.setUsbPort(usbPort);
        computer.setHdmiPort(hdmiPort);
        computer.setAdditionalKeyboard(additionalKeyboard);
        computer.setWirelessMouse(wirelessMouse);
        return computer;
    }
}