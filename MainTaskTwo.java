package ua.prog.kiev.lesson2.taskTwo;

public class MainTaskTwo {

    public static void main(String[] args) {
        JsonParsing createObjectsFromJson = new JsonParsing();
        createObjectsFromJson.transformJsonTextToJavaObjects("C:/Java/json.xml");
    }
}
