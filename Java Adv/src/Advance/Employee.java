package Advance;

public class Employee {

//2


        private final String firstName;
        private final String lastName;

        private final Integer age;
        private final String phone;
        private final String address;

        private Employee(EmployeeBuilder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.age = builder.age;
            this.phone = builder.phone;
            this.address = builder.address;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public Integer getAge() {
            return age;
        }

        public String getPhone() {
            return phone;
        }

        public String getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", phone='" + phone + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }

        public static class EmployeeBuilder {
            private final String firstName;
            private final String lastName;
            private Integer age;
            private String phone;
            private String address;

            public EmployeeBuilder(String firstName, String lastName) {
                if (firstName == null || lastName == null) {
                    throw new IllegalArgumentException("First name and last name are required.");
                }
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public EmployeeBuilder age(Integer age) {
                this.age = age;
                return this;
            }

            public EmployeeBuilder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public EmployeeBuilder address(String address) {
                this.address = address;
                return this;
            }

            public Employee build() {
                return new Employee(this);
            }
        }

        public static void main(String[] args) {

            Employee employee1 = new Employee.EmployeeBuilder("John", "Doe")
                    .age(30)
                    .phone("123-456-7890")
                    .address("123 Elm St")
                    .build();

            Employee employee2 = new Employee.EmployeeBuilder("Jane", "Smith")
                    .phone("098-765-4321")
                    .build();

            System.out.println(employee1);
            System.out.println(employee2);
        }

}
