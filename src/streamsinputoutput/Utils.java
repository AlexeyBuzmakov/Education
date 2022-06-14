package streamsinputoutput;

import collections.list.LinkedList;
import collections.list.List;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static void inputOutputUsingByteStreams(String str) {                                                     //1
        try (OutputStream os = new FileOutputStream("File.txt")){
            os.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream is = new FileInputStream("File.txt")){
            System.out.println(new String(is.readAllBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputUsingBufferedByteStreams(String str) {                                             //2
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("File.txt"));){
            bos.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("File.txt"));){
            System.out.println(new String(bis.readAllBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputUsingCharacterStreams(String str) {                                                //3
        try (FileWriter fw = new FileWriter("File.txt")){
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("File.txt")){
            int c;
            while((c = fr.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void inputOutputUsingBufferedCharacterStreams(String str) {                                        //4
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("File.txt"));){
            bw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("File.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputOutputMatrix(int[][]matrix) {                                                            //6
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Matrix.txt"));){
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    dos.writeInt(matrix[i][j]);
                }
                System.out.println();
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
        try (BufferedReader br = new BufferedReader(new FileReader("C://Users//alexe//Desktop//Students.txt"))){
            List<String>students = new LinkedList<>();
            String line;
            while((line = br.readLine()) != null) {
                students.addLast(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sortingFileWordsIntoDifferentFiles() {                                                        //8
        String line = null;
        try (BufferedReader br = new BufferedReader(new FileReader("C://Users//alexe//Desktop//Words.txt"))){
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("WordsStartCapitalLetter"))){
            Pattern pattern = Pattern.compile("[A-Z].*?( |$)");
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()) {
                bw.write(matcher.group());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("FiveCharacterWords"))){
            Pattern pattern = Pattern.compile(".{5}");
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()) {
                bw.write(matcher.group());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("WithoutCapitalLettersNumberWords"))){
            Pattern pattern = Pattern.compile(".*(?![A-Z])(?!\\d) ");
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()) {
                bw.write(matcher.group());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
