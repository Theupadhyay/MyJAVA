

    // ComputerBuilder.java


    // Main.java
    public class Main {
        public static void main(String[] args) {
            // Constructing a computer with mandatory components
            Computer computer1 = new ComputerBuilder("8GB", "Intel Core i5", "500GB HDD")
                    .build();
            System.out.println("Computer 1: " + computer1);

            // Constructing a computer with mandatory and optional components
            Computer computer2 = new ComputerBuilder("16GB", "AMD Ryzen 7", "1TB SSD")
                    .setUsbPort("4x USB 3.0")
                    .setHdmiPort("1x HDMI")
                    .setAdditionalKeyboard("Mechanical Keyboard")
                    .setWirelessMouse("Logitech G502")
                    .build();
            System.out.println("Computer 2: " + computer2);
        }
    }
