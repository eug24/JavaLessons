package Class5;

import java.util.Scanner;
public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Gender m f");
        char gender=scanner.next().charAt(0);

        switch (gender){

            case 'F':
                System.out.println("Female");
                break;
            case'f':
                System.out.println("Female");
                break;
            case'm':
                System.out.println("Male");
                break;
            case 'M':
                System.out.println("Poor Males");
                break;
            default:
                System.out.println("not specified");

        }
    }
}
