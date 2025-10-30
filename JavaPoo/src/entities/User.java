package entities;

import java.util.Scanner;

public class User {
    private String name;
    private int age;
    private int doc;

    public User() {
        super();
    }

    public User(String name, int age, int doc) {
        this.name = name;
        this.age = age;
        this.doc = doc;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDoc() {
        return doc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public void registerUser() {
        Scanner ent = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = ent.nextLine();

        System.out.print("Enter your age: ");
        age = ent.nextInt();

        System.out.print("Enter your document: ");
        doc = ent.nextInt();
    }

    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Document: " + doc;
    }
}
