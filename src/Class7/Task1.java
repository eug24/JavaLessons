package Class7;

public class Task1 {

    public static void main(String[] args) {
        /* Create a boolean variable wordDay and assign true
        create int variable day and assign it to 1
        as long as it is workDay print "I need a day off" and increase day.
        once day is 6 print "I don not need a day off anymore"
         */

        boolean wordDay=true;
        int day=1;
        while (wordDay){
            if(day<=5){
                System.out.println("I need a day off");
            }else{
                System.out.println("I do not need a day off anymore");
                wordDay=false;
            }
            day=day+1;
        }
    }
}
