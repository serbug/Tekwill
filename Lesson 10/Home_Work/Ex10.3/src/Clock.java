public class Clock {
    int hours = 12;
    int minutes = 0;

    public Clock() {

    }

    public void next() {
        minutes++;

        if (minutes >= 60) {
            hours++;
            minutes = 0;
            if (hours > 12 && hours <= 24) {
                hours -= 12;
            } else {
                System.out.println("\n Invalid input!");
            }
            System.out.println("\nTime is " + hours + ":" + minutes);
        }else{
            System.out.println("\n Invalid input!");
        }


    }
}
