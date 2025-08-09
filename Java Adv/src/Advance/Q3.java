package Advance;

//3

public class Q3 {
    private final int HDD;
    private final int RAM;

    private final boolean isGraphicsCard;
    private final boolean isBluetooth;

    private Q3(Builder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCard = builder.isGraphicsCard;
        this.isBluetooth = builder.isBluetooth;
    }

    @Override
    public String toString() {
        return "Computer Specifications:\n" +
                "HDD: " + HDD + " GB\n" +
                "RAM: " + RAM + " GB\n" +
                "Graphics Card: " + (isGraphicsCard ? "Yes" : "No") + "\n" +
                "Bluetooth: " + (isBluetooth ? "Yes" : "No");
    }

    public static class Builder {
        private final int HDD;
        private final int RAM;

        private boolean isGraphicsCard = false;
        private boolean isBluetooth = false;

        public Builder(int HDD, int RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public Builder addGraphicsCard(boolean isGraphicsCard) {
            this.isGraphicsCard = isGraphicsCard;
            return this;
        }

        public Builder addBluetooth(boolean isBluetooth) {
            this.isBluetooth = isBluetooth;
            return this;
        }

        public Q3 build() {
            return new Q3(this);
        }
    }

    public static void main(String[] args) {
        Q3 myComputer = new Q3.Builder(500, 16)
                .addGraphicsCard(true)
                .addBluetooth(true)
                .build();

        System.out.println(myComputer);
    }
}