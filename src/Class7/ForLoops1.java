package Class7;

public class ForLoops1 {

    public static void main(String[] args) {

        // using a for loop print odd number from 1 to 20;

        for (int i = 0; i<20; i++) {
            if(i%2!=0){ // checking if a number is odd
                System.out.println(i);
            }
        }

        for (int i=1; i<20; i+=2) {
            System.out.println(i);
        }
    }
}
