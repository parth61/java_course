package chapter9;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println("Person default Constructor");
    }
    public Person (String name){
        System.out.println("Person second constructor. Name is set");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
