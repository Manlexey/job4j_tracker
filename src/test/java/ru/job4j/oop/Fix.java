package ru.job4j.oop;

public class Fix {
    private String desk;

    public Fix(String text) {
        desk = text;
    }

    public static void main(String[] args) {
        String issue = "Fix me ASAP.";
        Fix item = new Fix(issue);
    }
}
