package date_time_api;;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate specificDate = LocalDate.of(2008, Month.AUGUST, 5);                                 //1
        LocalTime specificTime = LocalTime.of(20,25,47);
        LocalDateTime specificDateTime = LocalDateTime.of(2022, Month.JUNE, 3, 23, 25,47);
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime  = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();



        Utils.createSubjectDateTimeFromString("2002-11-15", "05:13:26");
        System.out.println(Utils.formatDate(currentDate));
        System.out.println(Utils.getSubjectDateFromString("20:03:2021"));
        Utils.checkLeapYearAndGetDayWeek(specificDate);
        Utils.getDateDifference(specificDate, currentDate);
        Utils.getTimeDifference(specificTime, currentTime);
        System.out.println("Before date: " + Utils.getBeforeDate(specificDate, currentDate));
        System.out.println("Count leap years: " + Utils.countLeapYears(2000, 2022));
        Utils.getAgeJava();
        Utils.getDayWeek(currentDate);
        System.out.println("Time in Japan: " + Utils.getTimeJapan());
        Utils.getTrainSchedule()
                .forEach(System.out::println);
        System.out.println("Возможность добавить дополнительный рейс: " + Utils.checkAbilityAddTip(LocalTime.of(22,16), 10));
    }
}
