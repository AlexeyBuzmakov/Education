package streamsinputoutput;

import collections.list.LinkedList;
import collections.list.List;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static void inputOutputUsingByteStreams() {                                                               //1
        try (OutputStream fos = new FileOutputStream("FileUsingByteStreams.txt")){
            fos.write("Russia".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream fis = new FileInputStream("FileUsingByteStreams.txt")){
            System.out.println(new String(fis.readAllBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputUsingBufferedByteStreams() {                                                       //2
        try (OutputStream bos = new BufferedOutputStream(new FileOutputStream("FileUsingBufferedByteStreams.txt"))){
            bos.write("Russia".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream bis = new BufferedInputStream(new FileInputStream("FileUsingBufferedByteStreams.txt"))){
            System.out.println(new String(bis.readAllBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputUsingCharacterStreams() {                                                          //3
        try (Writer fw = new FileWriter("FileUsingCharacterStreams.txt")){
            fw.write("Russia");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Reader fr = new FileReader("FileUsingCharacterStreams.txt")){
            int c;
            while((c = fr.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputUsingBufferedCharacterStreams() {                                                  //4
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("FileUsingBufferedCharacterStreams.txt"))){
            bw.write("Russia");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("FileUsingBufferedCharacterStreams.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputPrimitives() {                                                                     //5
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Primitives.txt"))){
            dos.writeByte(127);
            dos.writeShort(16873);
            dos.writeInt(228752);
            dos.writeLong(1873194817);
            dos.writeDouble(55.3);
            dos.writeFloat(34.15F);
            dos.writeBoolean(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputMatrix(int[][]matrix) {                                                            //6
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Matrix.txt"))){
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    dos.writeInt(matrix[i][j]);
                }
                dos.writeBytes("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("Matrix.txt"))){
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    System.out.print(dis.readInt() + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputStudents() {                                                                       //7
        List<Students>students = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Students.txt"))){
            String line;
            while((line = br.readLine()) != null) {
                String[]dateStudents = line.split("[- ]+");
                students.addLast(new Students(dateStudents[0] + " " + dateStudents[1] + " " + dateStudents[2] + "-",
                Integer.parseInt(dateStudents[3]), Double.parseDouble(dateStudents[4])));
            }
            System.out.println(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sortingFileWordsIntoDifferentFiles() {                                                        //8
        String line = null;
        try (BufferedReader br = new BufferedReader(new FileReader("Words.txt"))){
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[]words = line.split("[ ,.-]");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("WordsStartCapitalLetter.txt"))){
            for(String word : words) {
                if(word.matches("[A-Z].*")) {
                    bw.write(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("FiveCharacterWords.txt"))){
            for(String word : words) {
                if(word.matches(".{5}")) {
                    bw.write(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("WithoutCapitalLettersNumberWords.txt"))){
            for(String word : words) {
                if(word.matches("(?!.*[\\d[A-Z]]).*")) {
                    bw.write(word);
                    System.out.println(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outputOrderedArray(double[][]array) {                                                         //9
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("OrderedArrayDouble.txt"))){
            double totalSum = 0;
            int totalCountElement = 0;
            dos.write("Ряд Сумма  Значение".getBytes());
            dos.writeBytes("\n");
            for(int i = 0; i < array.length; i++) {
                double sum = 0;
                for(int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
                dos.writeBytes(i + 1 + "   " + sum + "   " + sum/array[i].length + "\n");
                totalSum += sum;
                totalCountElement += array[i].length;
            }
            dos.write("Количество элементов: ".getBytes());
            dos.writeBytes(totalCountElement + "");
            dos.writeBytes("\n");
            dos.write("Сумма элементов: ".getBytes());
            dos.writeBytes(totalSum + "");
            dos.writeBytes("\n");
            dos.write("Среднее значение элементов: ".getBytes());
            dos.writeBytes(totalSum/totalCountElement + "");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("OrderedArrayDouble.txt"))){
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void InputOutputReverseArray(int[]array) {                                                        //10
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("ReverseArray.txt"))){
            for(int i = array.length - 1; i >=0; i--) {
                dos.writeInt(array[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("ReverseArray.txt"))){
            for(int i = 0; i < array.length; i++) {
                System.out.print(dis.readInt() + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void splitBigNumber() {                                                                           //11
        String line = null;
        try (BufferedReader br = new BufferedReader(new FileReader("BigNumber.txt"))){
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<Integer, Integer>map = new LinkedHashMap<>();
        int index = 0;
        while(index != line.length()) {
            int number = line.charAt(index) - '0';
            if(map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
                index++;
                continue;
            }
            map.put(number, 1);
            index++;
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for(Map.Entry<Integer, Integer>entry : entries) {
            System.out.println("Число: " + entry.getKey() + " Повторений: " + entry.getValue());
        }
    }

    public static void correctionErrorReadRussianLanguage() {                                                       //12
        try (FileInputStream fis = new FileInputStream("TextInRussian.txt")) {
            int c;
            while ((c = fis.read()) != -1) {
                String symbol = (char)c + "";
                System.out.println(Arrays.toString(symbol.getBytes(StandardCharsets.UTF_8)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
