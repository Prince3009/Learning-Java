import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalculateSundays {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 3, 26);
        LocalDate endDate = LocalDate.of(2023, 6, 30);

        long daysBetween = endDate.toEpochDay() - startDate.toEpochDay();

        int sunday = 0;
        for(int i = 0; i <= daysBetween; i++) {
            LocalDate date = startDate.plusDays(i);
            if(date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sunday++;  
            }
    
    }
    System.out.println("The number of sundays is equal to " + sunday);
}

}