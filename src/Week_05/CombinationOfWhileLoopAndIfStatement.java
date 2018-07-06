package Week_05;

public class CombinationOfWhileLoopAndIfStatement {

    public static void main(String[] args) throws InterruptedException {
        /*
        An advance example of combination of while loop and if statement, to create 
        a very simple timer.
        */
        int second=0;
        int minutes=0;
        int hours=0;
        while(true){
            System.out.println(hours+":"+minutes+":"+second);
            Thread.sleep(1000);
            second++;
            if(second==60){
                second=0;
                minutes++;
                if(minutes==60){
                    minutes=0;
                    hours++;
                    if(hours==24){
                        hours=0;
                    }
                }
            }            
        }
    }
}
