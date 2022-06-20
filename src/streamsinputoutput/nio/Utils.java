package streamsinputoutput.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.*;

import static java.nio.file.StandardOpenOption.*;

public class Utils {

    @SuppressWarnings("unchecked")
    public static void writeReadUsedInputOutputStreams(Map<Integer, String> map) {                                 //1.1
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Test.bin"))) {
            oos.writeObject(map);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Test.bin"))) {
            Map<Integer, String> newMap = (Map<Integer, String>) ois.readObject();
            System.out.println(newMap);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeReadUsedClassFiles(Map<Integer, String> map) {                                          //1.2
        List<String> list = new ArrayList<>();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            list.add(entry.getKey() + "=" + entry.getValue());
        }
        if (!Files.exists(Paths.get("Test.txt"))) {
            try {
                Path file = Files.createFile(Paths.get("Test.txt"));
                Files.write(file, list);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exist");
        }
        try {
            System.out.println(Files.readAllLines(Paths.get("Test.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyMoveFiles() {                                                                           //2,3
        try {
            Files.deleteIfExists(Paths.get("Test.txt"));
            Files.createFile(Paths.get("Test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.copy(Paths.get("Test.txt"), Paths.get("TestDirectoryOne", "Test.txt"), StandardCopyOption.REPLACE_EXISTING);
            Files.move(Paths.get("Test.txt"), Paths.get("TestDirectoryOne", "Test.txt"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeReadMatrixUsedClassFiles(int[][] matrix) {                                                //4
        List<String> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j] + "");
            }
        }
        if (!Files.exists(Paths.get("Test.txt"))) {
            try {
                Files.createFile(Paths.get("Test.txt"));
                Files.write(Paths.get("Test.txt"), list);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exist");
        }
        try {
            List<String> newList = Files.readAllLines(Path.of("Test.txt"));
            int[][] newMatrix = new int[matrix.length][matrix.length];
            int index = 0;
            for (int i = 0; i < newMatrix.length; i++) {
                for (int j = 0; j < newMatrix[i].length; j++) {
                    newMatrix[i][j] = Integer.parseInt(newList.get(index));
                    index++;
                    System.out.print(newMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addingRowsUsedInputOutputStreams(String str, String str2) {                                 //5.1
        try (BufferedWriter br = new BufferedWriter(new FileWriter("Test.txt", true))) {
            br.write(str + " " + str2);
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

    public static void addingRowsUsedClassFiles(String str1, String str2) {                                        //5.2
        List<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        try {
            Files.write(Paths.get("Test.txt"), list, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(Files.readAllLines(Paths.get("Test.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createFileWithAutoExclusion() {                                                               //6
        try {
            Files.createFile(Paths.get("Test.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> list = List.of("Father", "Mother");
        try {
            Files.write(Paths.get("Test.txt"), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void editSequenceNumbers() {
        try (FileChannel channel = FileChannel.open(Paths.get("Test.txt"), WRITE, APPEND)){
            ByteBuffer buffer = ByteBuffer.allocateDirect(10);
            channel.position(3);
            buffer.putInt(0);
            buffer.flip();
            channel.write(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}