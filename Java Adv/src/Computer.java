public class Computer {
    // Main.java
    private String RAM;
    private String processor;
    private String hardDisk;
    private String usbPort;
    private String hdmiPort;
    private String additionalKeyboard;
    private String wirelessMouse;

    public Computer(String RAM, String processor, String hardDisk) {
        this.RAM = RAM;
        this.processor = processor;
        this.hardDisk = hardDisk;
    }

    public void setUsbPort(String usbPort) {
        this.usbPort = usbPort;
    }

    public void setHdmiPort(String hdmiPort) {
        this.hdmiPort = hdmiPort;
    }

    public void setAdditionalKeyboard(String additionalKeyboard) {
        this.additionalKeyboard = additionalKeyboard;
    }

    public void setWirelessMouse(String wirelessMouse) {
        this.wirelessMouse = wirelessMouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", processor='" + processor + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", usbPort='" + usbPort + '\'' +
                ", hdmiPort='" + hdmiPort + '\'' +
                ", additionalKeyboard='" + additionalKeyboard + '\'' +
                ", wirelessMouse='" + wirelessMouse + '\'' +
                '}';
    }
}