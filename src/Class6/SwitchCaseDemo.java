package Class6;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String country=scanner.next();

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){ //converts the text to lowercase USA=usa

            case "usa":
                System.out.println("Burgers");
            case "italy":
                System.out.println("Pasta");
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");

        }
    }
}
