package streamsinputoutput.part3;

public class Main {
    public static final String[] FIELDS_NAMES = {"name", "surname", "age", "job", "animals"};
    public static void main(String[] args) {
        Person[] person = {new Person("Nikita", "Solonin", 32, "Doctor", new String[]{"Cat"}),
                           new Person("Vlad", "Sokolov", 27, "Programmer", new String[]{"Fish", "Parrot"}),
                           new Person("Anna", "Musina", 22, "Engineer", new String[]{"Dog", "Mouse"}),
                           new Person("Maxim", "Malinin", 21, "Accountant", new String[]{"Turtle", "Monkey"})};



        Utils.inputOutputArrayObjects(person);
        Utils.serializationDesirializationArrayObjects(person);
        Utils.inputOutputCSV(person);
        Utils.inputOutputXML(person, FIELDS_NAMES);
        Utils.inputOutputJSON(person, FIELDS_NAMES);

    }
}
