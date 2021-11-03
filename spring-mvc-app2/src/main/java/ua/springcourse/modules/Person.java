package ua.springcourse.modules;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Person {
    private int id;

    @NotEmpty(message = "Select Name")
    @Size(min = 2, max = 10, message = "NAme should be between 2 and 10")
    private String name;

    @Min(value = 1, message = "Should be grater  than zero")
    private int age;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email not valid")
    private String email;

    public Person(){

    }

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
