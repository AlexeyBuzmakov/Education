package stream_api.part3.task5;

import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Files.walk(Paths.get("Test"))
                .filter(x -> x.toString().endsWith("txt")).toList()
                .forEach(x -> {
                    try {
                        Files.write(Paths.get("Test.txt"), Files.lines(x).toList(), StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        }
    }

