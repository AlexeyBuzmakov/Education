package streamsinputoutput.part2;

import java.io.*;
import java.util.Arrays;

public class Utils {

    public static void serializationDesirializationObject(Person person){                                            //1
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Files/Students.bin"))){
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Files/Students.bin"))){
            Person student1 = (Person) ois.readObject();
            System.out.println(student1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void serializationDesirializationArrayObjects(Object[]objects) {                               //2,3,4
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Files/Students.bin"))){
            oos.writeObject(objects);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Files/Students.bin"))){
            Object[] arrayObjects = (Object[]) ois.readObject();
            System.out.println(Arrays.toString(arrayObjects));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
