import java.util.Scanner;
//implement the pattern to achive the construction of computers through s step-by-step process. Use the mandatory components such as
//RAM , processor and hardDisk whereas optional components are usb port , hdmi port, additional keyboard and wireless mouse.
public class Etp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ram :");
        String component1 = sc.nextLine();
        System.out.println("Enter Processor :");
        String component2 = sc.nextLine();
        System.out.println("Enter HDD :");
        String component3 = sc.nextLine();
        System.out.println("Enter Additional KeyBoard Or Mouse :");
        String component4 = sc.nextLine();

        System.out.println("Computer Components are : ");

        System.out.println(
                "Ram is  " + component1 +    //8Gb
                " ,Prosessor is " + component2 +     // Intel Core i5
                " ,HardDisk is " + component3 +      // 500GB HDD
                ",Additional KeyBoard or Mouse " + component4    // Null is there is not any
        );
    }
}
