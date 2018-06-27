package ua.prog.kiev.lesson2.taskTwo;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JsonParsing {

    private String readFile(String filePath) {
        StringBuilder dataFromFile = new StringBuilder();
        try (Scanner in = new Scanner(new File(filePath))) {
            while (in.hasNext()) {
                dataFromFile.append(in.nextLine());
                dataFromFile.append("\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return dataFromFile.toString();
    }


    public void transformJsonTextToJavaObjects(String filePath) {
        Gson gson = new Gson();
        Student studentOne = gson.fromJson(readFile(filePath), Student.class);
        System.out.println(studentOne.toString());

    }


}
