package streamsinputoutput.failformats;

import java.io.*;
import java.util.Arrays;

public class Utils {

    public static void inputOutputArrayObjects(Person[] persons) {                                                   //1
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Test.txt"))) {
            for (int i = 0; i < persons.length; i++) {
                bw.write((i + 1) + ". " + persons[i] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("Test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serializationDesirializationArrayObjects(Person[] persons) {                                  //2
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Test.bin"))) {
            oos.writeObject(persons);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Test.bin"))) {
            Person[] newPersons = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(newPersons));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputCSV(Person[] persons, String[] fields) {                                           //3
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Test.csv"))) {
            bw.write(fields[0] + "," + fields[1] + "," + fields[2] + "," + fields[3] + "," + fields[4] + "\n");
            for (Person person : persons) {
                bw.write(person.getName() + "," + person.getSurname() + "," + person.getAge() + "," +
                        person.getJob() + "," + Arrays.toString(person.getAnimals()) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("Test.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputXML(Person[] persons, String[] fieldNames) {                                       //4
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Test.xml"))) {
            bw.write("<persons>\n");
            for (int i = 0; i < persons.length; i++) {
                bw.write("<" + fieldNames[0] + ">" + persons[i].getName() + "</" + fieldNames[0] + ">" + "\n"
                        + "<" + fieldNames[1] + ">" + persons[i].getSurname() + "</" + fieldNames[1] + ">" + "\n"
                        + "<" + fieldNames[2] + ">" + persons[i].getAge() + "</" + fieldNames[2] + ">" + "\n"
                        + "<" + fieldNames[3] + ">" + persons[i].getJob() + "</" + fieldNames[3] + ">" + "\n"
                        + "<" + fieldNames[4] + ">\n");
                for (int j = 0; j < persons[i].getAnimals().length; j++) {
                    bw.write("<animal>" + persons[i].getAnimals()[j] + "</animal>\n");
                }
                bw.write("</" + fieldNames[4] + ">\n");
                if (i != persons.length - 1) {
                    bw.write("\n");
                }
            }
            bw.write("</persons>");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("Test.xml"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputJSON(Person[] persons, String[] fieldNames) {                                      //5
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Test.json"))) {
            bw.write("{\n\"persons\":[\n");
            for (int i = 0; i < persons.length; i++) {
                bw.write("{\n\"" + fieldNames[0] + "\": \"" + persons[i].getName() + "\",\n" +
                        "\"" + fieldNames[1] + "\": \"" + persons[i].getSurname() + "\",\n" +
                        "\"" + fieldNames[2] + "\": \"" + persons[i].getAge() + "\",\n" +
                        "\"" + fieldNames[3] + "\": \"" + persons[i].getJob() + "\",\n" +
                        "\"" + fieldNames[4] + "\":[");
                for (int j = 0; j < persons[i].getAnimals().length; j++) {
                    bw.write("\"" + persons[i].getAnimals()[j] + "\"");
                    if (j != persons[i].getAnimals().length - 1) {
                        bw.write(",");
                    }
                }
                bw.write("]\n}");
                if (i != persons.length - 1) {
                    bw.write(",");
                }
                bw.write("\n");
            }
            bw.write("]\n}");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("Test.json"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
