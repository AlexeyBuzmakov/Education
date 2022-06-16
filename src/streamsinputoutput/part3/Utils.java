package streamsinputoutput.part3;

import java.io.*;
import java.util.Arrays;

public class Utils {

    public static void inputOutputArrayObjects(Person[]persons) {                                                    //1
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Test.txt"))){
            for(int i = 0; i < persons.length; i++) {
                bw.write((i + 1) + ". " + persons[i] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("Test.txt"))){
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serializationDesirializationArrayObjects(Person[]persons) {                                   //2
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Test.bin"))){
            oos.writeObject(persons);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Test.bin"))){
            Person[]newPersons = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(newPersons));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputCSV(Person[]persons) {                                                             //3
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Test.csv"))){
            bw.write("Name;Surname;Age;Job;Animals\n");
            for(Person person : persons) {
                bw.write(person.getName() + ";" + person.getSurname() + ";" + person.getAge() + ";" + person.getJob() + ";" + Arrays.toString(person.getAnimals()) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("Test.csv"))){
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputXML(Person[]persons, String[]fieldNames) {                                         //4
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Test.xml"))){
           for(int i = 0; i < persons.length; i++) {
               bw.write("<" + fieldNames[0] + (i + 1) + ">" + "\n"
               + "<" + fieldNames[1] + ">" + persons[i].getName() + "</" + fieldNames[1] + ">" + "\n"
               + "<" + fieldNames[2] + ">" + persons[i].getSurname() + "</" + fieldNames[2] + ">" + "\n"
               + "<" + fieldNames[3] + ">" + persons[i].getAge() + "</" + fieldNames[3] + ">" + "\n"
               + "<" + fieldNames[4] + ">" + persons[i].getJob() + "</" + fieldNames[4] + ">" + "\n"
               + "<" + fieldNames[5] + ">" + Arrays.toString(persons[i].getAnimals()) + "</" + fieldNames[5] + ">" + "\n"
               + "</" + fieldNames[0] + (i + 1) + ">" + "\n\n");
           }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("Test.xml"))){
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputJSON() {

    }
}
