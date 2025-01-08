package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    int height;
    int weight;
    String hairColor;


    public Person()
    {

    }

    public Person(String firstname, String lastName, int age)
    {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstname, String lastName, int age, int height, int weight, String hairColor)
    {
        this(firstname, lastName, age);
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen()
    {
        return getAge() >= 13 && getAge() <= 19;
    }
}
