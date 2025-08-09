import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID ");
        int empID = sc.nextInt();
        System.out.println("Enter Department name ");
        String department = sc.next();


        switch (empID){
            case 1 :
                System.out.println("Abhishek Upadhyay");
                break;
            case 2:
                System.out.println("anmol kumar");
                break;
            case 3:
                System.out.println("Emp 3 ");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "finance":
                        System.out.println("Finance Department ");
                        break;
                    default:
                        System.out.println("no department");
                }
                break;
            default:
                System.out.println("please input correct ID and department ");
        }
    }
}
