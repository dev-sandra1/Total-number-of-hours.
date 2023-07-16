import java.util.Scanner;

public class Excercise01 {
    public static void main(String[] args) {
       
        Scanner enter = new Scanner (System.in);

        int totalHours, weeks, weekHours, residue, hours, days, daysHours, hoursWeeksDays;
     
        System.out.println("Enter your hours: ");
        totalHours = enter.nextInt();

        weeks = (totalHours / 168);

        weekHours = 168 * semanas;
        residue = totalHours - weekHours;

        days =  residue / 24;
        
        daysHours = 24 * dias;
        hoursWeeksDays = (weekHours + daysHours);

        hours = totalHours - hoursWeeksDays;

        System.out.println("total weeksl: " + weeks);
        System.out.println("total days: " + days);
        System.out.println("total hours: " + hours);
     


    }
}    