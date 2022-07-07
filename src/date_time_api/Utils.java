package date_time_api;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {
    public static void createSubjectDateTimeFromString(String d, String t) {                                         //2
        LocalDate date = LocalDate.parse(d);
        LocalTime time = LocalTime.parse(t);
        System.out.println(date + "\n" + time);
    }

    public static String formatDate(LocalDate date) {                                                                //3
        return date.format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
    }

    public static LocalDate getSubjectDateFromString(String str) {                                                   //4
        return LocalDate.parse(str, DateTimeFormatter.ofPattern("dd:MM:yyyy"));
    }

    public static void checkLeapYearAndGetDayWeek(LocalDate date) {                                                  //5
        System.out.println("Check leap yeas: " + date.isLeapYear() + "\nDay week: " + date.getDayOfWeek());
    }

    public static void getDateDifference(LocalDate date1, LocalDate date2) {                                         //6
        Period period = Period.between(date1, date2);
        long years = ChronoUnit.YEARS.between(date1, date2);
        long month = ChronoUnit.MONTHS.between(date1, date2);
        long days = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Years: " + period.getYears() + " Month: " + period.getMonths() + " Days: " + period.getDays() +
                "\nTotal years: " + years + " Total month: " + month + " Total days: " + days);
    }

    public static void getTimeDifference(LocalTime time1, LocalTime time2) {                                         //7
        Duration duration = Duration.between(time1, time2);
        long hours = ChronoUnit.HOURS.between(time1, time2);
        long minutes = ChronoUnit.MINUTES.between(time1, time2);
        long seconds = ChronoUnit.SECONDS.between(time1, time2);
        System.out.println("Hours: " + duration.toHoursPart() + " Minutes: " + duration.toMinutesPart() + " Seconds: " + duration.toSecondsPart() +
                "\nTotal hours: " + hours + " Total minutes: " + minutes + " Total seconds: " + seconds);
    }

    public static LocalDate getBeforeDate(LocalDate date1, LocalDate date2) {                                        //8
        if (date1.isBefore(date2)) {
            return date1;
        }
        return date2;
    }

    public static int countLeapYears(int a, int b) {                                                                 //9
        int beforeYear = a;
        int afterYear = b;
        if (a > b) {
            beforeYear = b;
            afterYear = a;
        }
        int countLeapYears = 0;
        while (beforeYear <= afterYear) {
            if (LocalDate.of(beforeYear, 1, 1).isLeapYear()) {
                countLeapYears++;
            }
            beforeYear++;
        }
        return countLeapYears;
    }

    public static void getAgeJava() {                                                                               //10
        Period period = Period.between(LocalDate.of(1996, Month.JANUARY, 21), LocalDate.now());
        System.out.println("Age Java: " + period.getYears() + " years " + period.getMonths() + " month "
                + period.getDays() + " days");
    }

    public static void getDayWeek(LocalDate date) {                                                                 //11
        DayOfWeek dayWeekAfterOneHundredDays = date.plusDays(100).getDayOfWeek();
        DayOfWeek dayWeekAfterThreeMonth = date.plusMonths(3).getDayOfWeek();
        DayOfWeek dayWeekAfterOneWeek = date.plusWeeks(1).getDayOfWeek();
        DayOfWeek dayOfWeekAfterOneYear = date.plusYears(1).getDayOfWeek();
        System.out.println(dayWeekAfterOneHundredDays + " - after one hundred days\n" + dayWeekAfterThreeMonth +
                " - after three month\n" + dayWeekAfterOneWeek + " - after one week\n" + dayOfWeekAfterOneYear + " - after one year");
    }

    public static List<LocalTime> getTrainSchedule() {                                                              //13
        Train[] trains = new Train[2];
        for (int i = 0; i < 2; i++) {
            trains[i] = new Train();
        }
        List<LocalTime> timeTable = new ArrayList<>();
        while (true) {
            for (Train train : trains) {
                if (train.getStartMovement().getDayOfMonth() > 1) {
                    return timeTable;
                }
                timeTable.add(LocalTime.of(train.getStartMovement().getHour(), train.getStartMovement().getMinute()));
                train.setStartMovement(train.getStartMovement().plusMinutes(Train.MOVEMENT_INTERVAL));
            }
        }
    }

    public static boolean checkAbilityAddTip(LocalTime timeStart, int duration) {                                   //14
        List<LocalTime> listTable = getTrainSchedule();
        for (LocalTime time : listTable) {
            if (time.plusMinutes(Train.MOVEMENT_TIME).isBefore(timeStart) && timeStart.plusMinutes(duration).isBefore(time)
                    || listTable.get(listTable.size() - 1).plusMinutes(Train.MOVEMENT_TIME).isBefore(timeStart) &&
                    timeStart.getHour() * 60 + timeStart.getMinute() + duration <= 1440) {
                return true;
            }
        }
        return false;
    }
}

