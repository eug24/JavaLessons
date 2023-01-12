package Class6;

public class LogicialNotDemo {
    public static void main(String[] args) {


        System.out.println(false);
        System.out.println(!false);
        boolean condition=!true;
        System.out.println(condition);

        String passwords="Pass123";
        System.out.println(passwords.equals("Pass123"));
        if(!passwords.equals("Pass123")){
            System.out.println("Wrong password");
        }

        boolean isRaining=true;

        if(!isRaining){
            System.out.println("lets go for a walk");
        }else{
            System.out.println("lets take the umbrella");
        }
    }
}
