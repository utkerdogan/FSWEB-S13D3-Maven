package org.example;

public class Person {
    String firstname;
    String lastname;
    int age;
    double height;
    char gender;
    boolean married;
    
    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age, double height, char gender, boolean married) {
        this(firstname, lastname, age);
        this.height = height;
        this.gender = gender;
        this.married = married;
    }
    public String getFirstName(){
        return this.firstname;
    }
    public String getLastName(){
        return this.lastname;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        }else{
            return false;
        }
    }

}
