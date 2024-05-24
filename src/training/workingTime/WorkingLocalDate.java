package training.workingTime;

import java.time.LocalDate;

public class WorkingLocalDate {

    public WorkingLocalDate(){}


    /**
     * LocalDate represents a date in ISO format yyyy-MM-dd without time.
     * You can use it this way:
     *
     * LocalDate localDate = LocalDatet.now();
     *
     * https://howtodoinjava.com/java/date-time/intro-to-date-time-api/
     * https://www.baeldung.com/java-8-date-time-intro
     */


    /**
     * Returns the current local date.
     * @return
     */
    public void getCurrentLocalDate(){
        System.out.println("Current Local Date: " + LocalDate.now());
    }

    public void constructorsWay(){
        LocalDate localDate = LocalDate.of(2023,10,31);
        LocalDate localDate1 = LocalDate.parse("2023-12-31");

    }



}
