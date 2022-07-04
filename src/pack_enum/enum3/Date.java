package pack_enum.enum3;

public class Date {
    private DayWeek nameDayWeek;
    private Month month;
    private int year;
    private int numberDayMonth;

    public Date(int age, Month month, int numberDayMonth, DayWeek nameDayWeek) {
        this.year = age;
        this.month = month;
        this.nameDayWeek = nameDayWeek;
        this.numberDayMonth = numberDayMonth;
    }

    public DayWeek getNameDayWeek() {
        return nameDayWeek;
    }

    public void setNameDayWeek(DayWeek nameDayWeek) {
        this.nameDayWeek = nameDayWeek;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 0) {
            this.year = year;
        }
    }

    public int getNumberDayMonth() {
        return numberDayMonth;
    }

    public void setNumberDayMonth(int numberDayMonth) {
        if (numberDayMonth > 0 && numberDayMonth <= 31){
            this.numberDayMonth = numberDayMonth;
        }
    }
}
