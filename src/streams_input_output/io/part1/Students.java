package streams_input_output.io.part1;

public class Students {
    private String name;
    private int groupNumber;
    private double averageGrade;

    public Students(String name, int groupNumber, double averageGrade) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Фамилия Имя: " + name + groupNumber +
               " Средний балл: " + averageGrade;
    }
}
