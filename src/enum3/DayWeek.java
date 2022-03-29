package enum3;

public enum DayWeek {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
    FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private final int numberDayWeek;

    DayWeek(int numberDayWeek) {
        this.numberDayWeek = numberDayWeek;
    }

    public int getNumberDayWeek() {
        return numberDayWeek;
    }
}
