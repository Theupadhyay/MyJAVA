import java.util.ArrayList;
import java.util.stream.Stream;

class Employee{
    String name ;
    int salary;
    Employee(String name, int salary){
        this.name = name ;
        this.salary = salary;
    }
}
public class Stream01 {
    public static void main(String... args) {
        ArrayList<Employee> al =new ArrayList<>();
        al.add(new Employee("Abhishek",58));
        al.add(new Employee("Rishi",60));
        al.add(new Employee("Anmol",48));
        al.add(new Employee("Piyush",80));
        al.add(new Employee("Bhola",78));

        //Print the name of Employees whose salary is less than 80 in sorted Order
        // Compare By name
        Stream<Employee> str = al.stream().filter(e -> e.salary < 80).sorted((x, y) -> x.name.compareTo(y.name));
        //Compare by Salary
        Stream<Employee> strr = al.stream().filter(e -> e.salary < 80).sorted((x, y) -> x.salary>y.salary ? 1 : -1);
        str.forEach(e -> System.out.println(e.name + "\t"+ e.salary));

        // Using map
        Stream<String> strrr = al.stream().filter(e -> e.salary < 80).map(emp-> emp.name).sorted();
        strrr.forEach(n-> System.out.println(n  ));


    }
}
