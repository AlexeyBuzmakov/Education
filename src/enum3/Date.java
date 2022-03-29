package enum3;

public class Date {
    private DayWeek nameDayWeek;
    private Month month;
    private int age;

    public Date(int age, Month month, DayWeek nameDayWeek) {
        this.age = age;
        this.month = month;
        this.nameDayWeek = nameDayWeek;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
