public class Employeee {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    private Employeee(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Getters for all fields (omitted for brevity)

    public static class Builder {
        // Required fields
        private final String firstName;
        private final String lastName;

        // Optional fields, initialized with default values
        private int age = 0;
        private String phone = "";
        private String address = "";

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Employeee build() {
            return new Employeee(this);
        }
    }

    // Example of behavior/method in the class
    public void printDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }

    // Example of usage:
    public static void main(String[] args) {
        // Creating an Employee object using the builder pattern
        Employeee employeee = new Employeee.Builder("John", "Doe")
                .age(30)
                .phone("123-456-7890")
                .address("123 Main St, City")
                .build();

        // Printing employee details
        employeee.printDetails();
    }
}
